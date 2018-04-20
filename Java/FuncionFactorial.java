class FuncionFactorial
{
	static void funcfact(int n)
	{
		int resultado[] = new int[500];

		resultado[0]=1;
		int resultado_size = 1;

		for (int x = 2;x <= n; x++) 
		{
			resultado_size = OperacionesFactorial.multiplicar(x, resultado, resultado_size);
		}

		System.out.println("Resultado del factorial: ");
		for (int i = resultado_size-1; i >= 0; i--) 
		{
			System.out.print(resultado[i]);
		}
	}
}