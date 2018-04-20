import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;

class Traduccion
{
	public static void EspañolIngles()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Inserta la palabra a traducir al Ingles: ");

		try
		{
			ObjectInputStream españolIngles = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectInputStream inglesEspañol = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			Map<String,Ingles> palabrasEsp = (Map<String,Ingles>) españolIngles.readObject();
			Map<String,Español> palabrasIng = (Map<String,Español>) inglesEspañol.readObject();

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
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;	
		}
	}

	public static void InglesEspañol()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Inserta la palabra a traducir al Español: ");

		try
		{
			ObjectInputStream españolIngles = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectInputStream inglesEspañol = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			Map<String,Ingles> palabrasEsp = (Map<String,Ingles>) españolIngles.readObject();
			Map<String,Español> palabrasIng = (Map<String,Español>) inglesEspañol.readObject();

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
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;	
		}
	}
}