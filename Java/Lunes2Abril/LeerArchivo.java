import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

//Archivos grandes con buffer para optimizar el programa

public class LeerArchivo
{
	public static void main(String[] args) 
	{
		Leer archivo = new Leer();
		archivo.leer();
		LeerBuffer arch = new LeerBuffer();
		arch.lectura();
	}
}

class Leer
{
	public void leer()
	{
		try
		{
			FileReader fr = new FileReader("/home/azurefang/java/Lunes2Abril/PruebaLectura");
			int caracter;
			while((caracter = fr.read()) != -1) 
			{
				char c = (char) caracter;
				System.out.println(c);
			}
			fr.close();
		}
		catch (IOException e) 
		{
			System.out.println("No se encuentra el archivo");
		}
	}
}

class LeerBuffer
{
	public void lectura()
	{
		try
		{
			File f = new File("/home/azurefang/java/Lunes2Abril/PruebaLectura");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) 
			{
				System.out.println(linea);
			}
			br.close();
			fr.close();
		}
		catch (IOException e) 
		{
			System.out.println("Archivo no encontrado");
		}
	}
}