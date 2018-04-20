import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class EjercicioHacerCopia
{
	public static void main(String[] args) 
	{
		HacerCopia hc = new HacerCopia();
		hc.copiar();
	}
}

class HacerCopia
{
	public void copiar()
	{
		String cadena;
		File archivo;
		FileWriter fw;
		BufferedWriter bw;

		try
		{	
			archivo = new File("/home/azurefang/java/Lunes2Abril/EjercicioCopia");
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
		catch (IOException e) 
		{
			System.out.println("Archivo no encontrado");
		}

		try
		{
			File f = new File("/home/azurefang/java/Lunes2Abril/EjercicioCopia");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			archivo = new File("/home/azurefang/java/Lunes2Abril/EjercicioCopia2");
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);

			String linea;

			while ((linea = br.readLine()) != null) 
			{
				bw.write(linea + "\n");
			}

			br.close();
			fr.close();

			bw.flush();
			bw.close();
			fw.close();
		}
		catch (IOException e) 
		{
			System.out.println("Archivo no encontrado");
		}
	}
}