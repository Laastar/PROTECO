import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Traductor
{
	static Map<String,Ingles> palabrasEsp= new HashMap<String,Ingles>();

	static Map<String,Español> palabrasIng= new HashMap<String,Español>();

	public static void main(String[] args) 
	{
		Español p1 = new Español("Casa");
		Español p2 = new Español("Juguete");
		Español p3 = new Español("Vida");
		Español p4 = new Español("Computadora");
		Español p5 = new Español("Raton");
		Ingles t1 = new Ingles("House");
		Ingles t2 = new Ingles("Toy");
		Ingles t3 = new Ingles("Life");
		Ingles t4 = new Ingles("Computer");
		Ingles t5 = new Ingles("Mouse");

		palabrasEsp.put("Casa", t1);
		palabrasEsp.put("Juguete", t2);
		palabrasEsp.put("Vida", t3);
		palabrasEsp.put("Computadora", t4);
		palabrasEsp.put("Raton", t5);
		palabrasIng.put("House", p1);
		palabrasIng.put("Toy", p2);
		palabrasIng.put("Life", p3);
		palabrasIng.put("Computer", p4);
		palabrasIng.put("Mouse", p5);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Bienvenido al Traductor Español-Ingles / Ingles-Español");
		int eleccion = 0;

		while(eleccion != 4)
		{
			eleccion = 0;
			System.out.println("");
			System.out.println("1) Traducir Ing-Esp");
			System.out.println("2) Traducir Esp-Ing");
			System.out.println("3) Agregar nueva traduccion");
			System.out.println("4) Salir");
			System.out.println("");

			try
			{
				eleccion = Integer.valueOf(br.readLine());
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Elegiste una opcion no valida");
			}
			catch (IOException e) 
			{
				System.out.println("Elegiste una opcion no valida");
			}

			if(eleccion == 4)
			{
				System.exit(0);
			}
			else if (eleccion == 1) 
			{
				Traduccion.InglesEspañol(palabrasIng);
			}
			else if (eleccion == 2)
			{
				Traduccion.EspañolIngles(palabrasEsp);
			}
			else if (eleccion == 3)
			{
				DarAltaPalabra.seleccionTipo(palabrasEsp, palabrasIng);
			}
			else
			{
				System.out.println("Elige una opcion correcta\n");
			}
		}

	}
}