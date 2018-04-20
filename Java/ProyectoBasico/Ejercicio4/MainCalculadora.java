import java.util.Scanner;

public class MainCalculadora
{
	public static void main(String[] args) 
	{
		//Se declara una scanner para poder recibir datos
		Scanner scanner = new Scanner(System.in);

		//Se pide el tamaño de las matrices cuadradas
		System.out.println("Introduce el tamaño de las matrices");
		int tamaño = Integer.valueOf(scanner.next());

		//Se declaran las matrices necesarias para las operaciones
		int[][] matriz1 = new int[tamaño][tamaño];
		int[][] matriz2 = new int[tamaño][tamaño];
		int[][] matriz3 = new int[tamaño][tamaño];

		//Se piden los valores de las matrices
		System.out.println("Matriz 1");
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				System.out.println("Introduce el valor en la locacion ["+i+"]["+j+"]");
				int numero = Integer.valueOf(scanner.next());
				matriz1[i][j]= numero;
			}
		}

		System.out.println("Matriz 2");
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				System.out.println("Introduce el valor en la locacion ["+i+"]["+j+"]");
				int numero = Integer.valueOf(scanner.next());
				matriz2[i][j]= numero;
			}
		}

		//Se hace las operacionde de suma, resta y multiplicacion
		Calculadora.suma(matriz1, matriz2, matriz3, tamaño);
		System.out.println("");
		Calculadora.resta(matriz1, matriz2, matriz3, tamaño);
		System.out.println("");
		Calculadora.multiplicacion(matriz1, matriz2, matriz3, tamaño);

		/*
		System.out.println("Matriz 1");
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				System.out.print("["+matriz1[i][j]+"]");
			}
			System.out.println("");
		}
		*/
	}
}