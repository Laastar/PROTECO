import java.util.Scanner;
import java.io.IOException;

public class Calculadora
{
	public static void main(String[] args) 
	{
		//Se declara un scanner para poder recibir datos
		Scanner scanner = new Scanner(System.in);

		int eleccion = 0;

		//Le muestra el menu de la calculadora
		System.out.println("Beinvenido a La Calculadora Exacta");
		while(eleccion != 5)
		{
			System.out.println("");
			System.out.println("Elija su opcion preferida");
			System.out.println("1) Suma");
			System.out.println("2) Resta");
			System.out.println("3) Division");
			System.out.println("4) Multiplicacion");
			System.out.println("5) Salir");
			System.out.println("");

			//Si el usuario intenta utilizar una opcion no mostrada le mandara un mensaje
			//Hasta que elija una opcion correcta
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
				SeleccionNumeros.numeros(eleccion);
			}
			else
			{
				System.out.println("Elige una opcion correcta");
			}
		}
		
	}
}
