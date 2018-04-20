import java.util.Scanner;
import java.io.IOException; 

public class MainControl
{
	public static void main(String[] args) 
	{
		//Se instancia un scanner y algunas variable controladoras del sistema
		Scanner scanner = new Scanner(System.in);

		int eleccion = 0;
		String nombre;

		//Pide un nombre al usuario
		System.out.println("Cual es tu nombre alma perdida?");
		nombre = scanner.next();

		while(eleccion != 3)
		{
			//Manda un mensaje de saludo y el menu
			System.out.println("Enfrentaras un oponente especifico en base a tu eleccion");
			System.out.println("Elija con cuidado y sabiduria");
			System.out.println("Elija el tipo de clase");
			System.out.println("1) General");
			System.out.println("2) Avanzada");
			System.out.println("3) Salir");
			System.out.println("");
			//Con el try catch checa que se haya hecho una seleccion aceptable
			//De lo contrario manda un mensaje y otra vez el menu
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
				SeleccionUnidad.selectUnit(eleccion, nombre);
			}
			else
			{
				System.out.println("Elige una opcion correcta\n");
			}
		}
	}
}