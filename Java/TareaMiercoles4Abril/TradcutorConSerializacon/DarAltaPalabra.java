import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;

class DarAltaPalabra
{
	public static void seleccionTipo()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int eleccion = 0;

		System.out.println("1)Español");
		System.out.println("2)Ingles");

		while(eleccion != 1 || eleccion != 2)
		{
			try
			{
				eleccion = Integer.valueOf(br.readLine());	
			}
			catch (IOException e) 
			{
				System.out.println("Error en lectura de palabra");
				return;
			}
			catch (NumberFormatException e) 
			{
				System.out.println("No introdujiste una palabra");
				return;
			}

			if(eleccion == 1)
			{
				palEspañol();
				return ;
			}
			else if (eleccion == 2) 
			{
				palIngles();
				return ;
			}
			else
			{
				System.out.println("Elige una opcion correcta\n");
			}
		}
	}

	public static void palEspañol()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			ObjectInputStream españolIngles = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectInputStream inglesEspañol = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			Map<String,Ingles> palabrasEsp = (Map<String,Ingles>) españolIngles.readObject();
			Map<String,Español> palabrasIng = (Map<String,Español>) inglesEspañol.readObject();

			System.out.println("Inserta la palabra en español");
			String palabra = br.readLine();
			

			System.out.println("Inserta su traduccion");
			String traduccion = br.readLine();

			Español p1 = new Español(palabra);
			Ingles t1 = new Ingles(traduccion);

			palabrasEsp.put(palabra, t1);
			palabrasIng.put(traduccion, p1);

			ObjectOutputStream españolIngles2 = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectOutputStream inglesEspañol2 = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			españolIngles2.writeObject(palabrasEsp);
			inglesEspañol2.writeObject(palabrasIng);

			españolIngles2.close();
			inglesEspañol2.close();

			return;
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;	
		}
		catch (IOException e) 
		{
			System.out.println("Error en el traductor");
			return;
		}
	}

	public static void palIngles()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			ObjectInputStream españolIngles = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectInputStream inglesEspañol = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			Map<String,Ingles> palabrasEsp = (Map<String,Ingles>) españolIngles.readObject();
			Map<String,Español> palabrasIng = (Map<String,Español>) inglesEspañol.readObject();

			System.out.println("Inserta la palabra en Ingles");
			String palabra = br.readLine();
			

			System.out.println("Inserta su traduccion");
			String traduccion = br.readLine();

			Español p1 = new Español(traduccion);
			Ingles t1 = new Ingles(palabra);

			palabrasEsp.put(traduccion, t1);
			palabrasIng.put(palabra, p1);

			ObjectOutputStream españolIngles2 = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir") + "/EspañolIngles")));
			ObjectOutputStream inglesEspañol2 = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir") + "/InglesEspañol")));

			españolIngles2.writeObject(palabrasEsp);
			inglesEspañol2.writeObject(palabrasIng);

			españolIngles2.close();
			inglesEspañol2.close();

			return ;
		}
		catch (IOException e) 
		{
			System.out.println("Error en el traductor");
			return;
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;	
		}
	}
}