import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;

public class EscrituraArchivosBuffer
{
	public static void main(String[] args) 
	{
		EscrituraSinBuffer esb = new EscrituraSinBuffer();
		esb.escribirSinBuffer();

		EscrituraConBuffer ecb = new EscrituraConBuffer();
		ecb.escribirConBuffer();
	}
}

class EscrituraSinBuffer
{
	public void escribirSinBuffer()
	{
		try
		{	
			String cadena = "Hola, estoy escribiendo \n Salu2 XD";
			FileWriter fw = new FileWriter("/home/azurefang/java/Lunes2Abril/PruebaEscritura");
			for (int i = 0; i < cadena.length(); i++) 
			{
				fw.write(cadena.charAt(i));
			}
			fw.close();
		}
		catch (IOException e) {}
	}
}

class EscrituraConBuffer
{
	public void escribirConBuffer()
	{
		String cadena;
		File archivo;
		FileWriter fw;
		BufferedWriter bw;

		try
		{	
			archivo = new File("/home/azurefang/java/Lunes2Abril/PruebaEscritura2");
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
			Scanner teclado = new Scanner(System.in);
			do
			{
				cadena = teclado.nextLine();
				bw.write(cadena + "\n");
			} while(!cadena.equals("Au revoir"));
			bw.flush();
			bw.close();
			fw.close();
		}
		catch (IOException e) {}
	}
}