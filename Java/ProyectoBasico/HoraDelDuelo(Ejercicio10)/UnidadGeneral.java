import java.util.Scanner;
import java.io.IOException; 

class UnidadGeneral
{
	public static void selectGeneral(String nombre)
	{
		//Se declara un scanner para poder recibir datos
		Scanner scanner = new Scanner(System.in);

		//Se declaran las variables de eleccion y si la unidad es avanzada o no
		int eleccion = 0;
		int avanzada = 0;

		//Se lanza el menu para elegir la unidad general de prefenrencia
		System.out.println("Clases Generales");
		System.out.println("Elija su clase");
		System.out.println("1) Soldado");
		System.out.println("2) Academico");
		System.out.println("3) Salir");
		System.out.println("");

		//Mientras no haga una eleccion correcta no sale de este menu
		//Esto debido al uso de las excepciones
		while(eleccion != 3)
		{
			try
			{
				eleccion = Integer.valueOf(scanner.next());
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Elegiste una opcion no valida");
			}
			if(eleccion == 3)
			{
				System.exit(0);
			}
			else if (eleccion < 3 && eleccion > 0) 
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