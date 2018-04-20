import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Traduccion
{
	public static void EspañolIngles(Map<String,Ingles> palabrasEsp)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Inserta la palabra a traducir al Ingles: ");

		try
		{
			String palabra = br.readLine();

			if(palabrasEsp.containsKey(palabra))
			{
				System.out.println("Traduccion: " + palabrasEsp.get(palabra).getPalabra());
			}
			else
			{
				System.out.println("No encontrado");
			}
		}
		catch (IOException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;
		}
	}

	public static void InglesEspañol(Map<String,Español> palabrasIng)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Inserta la palabra a traducir al Español: ");

		try
		{
			String palabra = br.readLine();

			if(palabrasIng.containsKey(palabra))
			{
				System.out.println("Traduccion: " + palabrasIng.get(palabra).getPalabra());
			}
			else
			{
				System.out.println("No encontrado");
			}
		}
		catch (IOException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;
		}
	}
}