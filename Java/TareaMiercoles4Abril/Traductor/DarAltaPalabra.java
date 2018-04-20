import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class DarAltaPalabra
{
	public static void seleccionTipo(Map<String,Ingles> palabrasEsp, Map<String,Español> palabrasIng)
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
				palEspañol(palabrasEsp, palabrasIng);
				return ;
			}
			else if (eleccion == 2) 
			{
				palIngles(palabrasEsp, palabrasIng);
				return ;
			}
			else
			{
				System.out.println("Elige una opcion correcta\n");
			}
		}
	}

	public static void palEspañol(Map<String,Ingles> palabrasEsp, Map<String,Español> palabrasIng)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("Inserta la palabra en español");
			String palabra = br.readLine();
			

			System.out.println("Inserta su traduccion");
			String traduccion = br.readLine();

			Español p1 = new Español(palabra);
			Ingles t1 = new Ingles(traduccion);

			palabrasEsp.put(palabra, t1);
			palabrasIng.put(traduccion, p1);

			return;
		}
		catch (IOException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;
		}
	}

	public static void palIngles(Map<String,Ingles> palabrasEsp, Map<String,Español> palabrasIng)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("Inserta la palabra en Ingles");
			String palabra = br.readLine();
			

			System.out.println("Inserta su traduccion");
			String traduccion = br.readLine();

			Español p1 = new Español(traduccion);
			Ingles t1 = new Ingles(palabra);

			palabrasEsp.put(traduccion, t1);
			palabrasIng.put(palabra, p1);
		}
		catch (IOException e) 
		{
			System.out.println("Error en lectura de palabra");
			return;
		}
		return;
	}
}