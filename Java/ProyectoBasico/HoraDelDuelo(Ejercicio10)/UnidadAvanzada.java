import java.util.Scanner;
import java.io.IOException; 

class UnidadAvanzada
{
	public static void selectAdvanced(String nombre)
	{
		//Se declara un scanner para poder recibir datos
		Scanner scanner = new Scanner(System.in);

		//Se declaran las variables de eleccion y si la unidad es avanzada o no
		int eleccion = 0;
		int avanzada = 1;
		
		//Se lanza el menu para elegir la unidad avanzada de prefenrencia
		System.out.println("Clases Generales");
		System.out.println("Elija su clase");
		System.out.println("1) Guardian");
		System.out.println("2) Guerrero");
		System.out.println("3) Elementalista");
		System.out.println("4) Nigromante");
		System.out.println("5) Salir");
		System.out.println("");

		//Mientras no haga una eleccion correcta no sale de este menu
		//Esto debido al uso de las excepciones
		while(eleccion != 5)
		{
			try
			{
				eleccion = Integer.valueOf(scanner.next());
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Elegiste una opcion no valida");
			}
			if(eleccion == 5)
			{
				System.exit(0);
			}
			else if (eleccion < 5 && eleccion > 0) 
			{
				LinkStart.startup(eleccion, avanzada, nombre);
			}
			else
			{
				System.out.println("Elige una opcion correcta");
			}
		}
	}
}
