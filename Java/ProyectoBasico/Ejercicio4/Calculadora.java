class Calculadora
{
	public static void suma(int[][] matriz1, int[][] matriz2, int[][] matriz3, int tamaño)
	{
		System.out.println("Suma");
		System.out.println("Matriz1 + Matriz2 = Resultado");

		//Primero se hace la suma de las matrices elemento a elemento
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		//se declara una bandera
		int x = 1;
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				//En esta estructura de hace uso de la bandera para poder hacer recursivudad
				//De tal manera que se imprima la primer fila de todas las matrices
				//Y asi sucesivamente
				switch(x)
				{
					case 1:
					System.out.print("["+matriz1[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j =- 1;
						System.out.print("\t");
					}
					break;

					case 2:
					System.out.print("["+matriz2[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;

					case 3:
					System.out.print("["+matriz3[i][j]+"]");
					if(j == tamaño)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;
				}
			}
			x = 1;
			System.out.println("");
		}		
	}

	public static void resta(int[][] matriz1, int[][] matriz2, int[][] matriz3, int tamaño)
	{
		System.out.println("Resta");
		System.out.println("Matriz1 - Matriz2 = Resultado");
		//Se realiza la resta elemento a elemento
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		int x = 1;
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				//En esta estructura de hace uso de la bandera para poder hacer recursivudad
				//De tal manera que se imprima la primer fila de todas las matrices
				//Y asi sucesivamente
				switch(x)
				{
					case 1:
					System.out.print("["+matriz1[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j =- 1;
						System.out.print("\t");
					}
					break;

					case 2:
					System.out.print("["+matriz2[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;

					case 3:
					System.out.print("["+matriz3[i][j]+"]");
					if(j == tamaño)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;
				}
			}
			x = 1;
			System.out.println("");
		}		
	}

	public static void multiplicacion(int[][] matriz1, int[][] matriz2, int[][] matriz3, int tamaño)
	{
		int contador = 0;
		System.out.println("Multiplicacion");
		System.out.println("Matriz1 * Matriz2 = Resultado");
		//Se hace uso de multiples fors para poder replicar la peculiaridad de la manera
		//En que se multiplican las matrices
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				for(int k = 0; k < tamaño; k++)
				{
					matriz3[i][j] = matriz3[i][j] + (matriz1[i][k] * matriz2[k][j]);
				}				
			}
		}
		int x = 1;
		for (int i = 0; i < tamaño; i++) 
		{
			for (int j = 0; j < tamaño; j++) 
			{
				switch(x)
				{
					//En esta estructura de hace uso de la bandera para poder hacer recursivudad
					//De tal manera que se imprima la primer fila de todas las matrices
					//Y asi sucesivamente
					case 1:
					System.out.print("["+matriz1[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j =- 1;
						System.out.print("\t");
					}
					break;

					case 2:
					System.out.print("["+matriz2[i][j]+"]");
					if(j == tamaño-1)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;

					case 3:
					System.out.print("["+matriz3[i][j]+"]");
					if(j == tamaño)
					{
						x++;
						j = -1;
						System.out.print("\t");
					}
					break;
				}
			}
			x = 1;
			System.out.println("");
		}		
	}
}