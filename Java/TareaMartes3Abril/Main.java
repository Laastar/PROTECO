import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		int eleccion = 0;

		while(eleccion != 3)
		{
			eleccion = 0;
			System.out.println("Bienvenido");
			System.out.println("1) Ingresar un nuevo usuario");
			System.out.println("2) Iniciar sesion");
			System.out.println("3) Salir");
			System.out.println("");

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
			else if (eleccion == 1) 
			{
				DarAlta.darAlta();
			}
			else if (eleccion == 2)
			{
				IniciarSesion.inicioSesion();
			}
			else
			{
				System.out.println("Elige una opcion correcta\n");
			}
		}
	}
}