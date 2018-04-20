import java.util.Scanner;
import java.io.Serializable;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

class IniciarSesion implements Serializable
{
	public static void inicioSesion()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el nombre del usuario");
		String usuario = scanner.next();

		try
		{
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/" + usuario)));
			NuevoUsuario p2 = (NuevoUsuario) entrada.readObject();
			entrada.close();

			System.out.println("Introduce una contraseña");
			String pass = scanner.next();

			String contraseña = p2.getPass();

			if(pass.equals(contraseña))
			{
				System.out.println(p2);
			}
			else
			{
				System.out.println("Datos invalidos");
			}
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Archivo no encontrado");
			return;
		}
		catch (IOException e) 
		{
			System.out.println("Archivo corrompido");
			return;
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error fatal");
		}
	}
}