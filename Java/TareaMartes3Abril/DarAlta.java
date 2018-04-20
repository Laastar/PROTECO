import java.util.Scanner;
import java.io.Serializable;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

abstract class DarAlta implements Serializable, Path
{
	public static void darAlta()
	{
		Scanner scanner = new Scanner(System.in);

		double altura = 0;
		int edad = 0;

		System.out.println("Introduce un nombre");
		String nombre = scanner.next();

		System.out.println("Introduce un usuario");
		String usuario = scanner.next();

		System.out.println("Introduce una contraseña");
		String pass = scanner.next();

		System.out.println("Introduce una altura");

		while(true)
		{
			try
			{
				altura = Double.valueOf(scanner.next());	
				break;
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Introduce un numero valido porfavor");
			}
		}
		
		System.out.println("Introduce una edad");
		while(true)
		{
			try
			{
				edad = Integer.valueOf(scanner.next());	
				break;
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Introduce un numero valido porfavor");	
			}
		}

		Path p = Paths.get((System.getProperty("user.dir") + "/" + usuario));
		boolean exists = Files.exists(p);

		if(exists)
		{
			System.out.println("\nUsuario ya existe\n");
			return;
		}

		NuevoUsuario p1 = new NuevoUsuario(nombre, usuario, pass, altura, edad);
		
		try
		{
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir") + "/" + usuario)));
			salida.writeObject(p1);
			salida.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Archivo corrompido");
		}
		catch (IOException e) 
		{
			System.out.println("No se pudo crear el usuario");
		}
	}
}