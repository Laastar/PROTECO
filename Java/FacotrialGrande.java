public class FactorialGrande
{
	public static void main(String[] args) 
	{
		
	}

	static void funcfact(int n)
	{
		int resultado = new int[500];

		resultado[0]=1;
		inr resultado_size = 1;

		for (int x = 2;x <= n; i++) 
		{
			resultado_size = multiply(x, resultado, resultado_size);
		}

		System.out.println("Resultado del factorial: ");
		for (int i = resultado_size; i >= 0; i--) 
		{
			System.out.print(resultado[i]);
		}
	}

	static int multiply(int x, int resultado[], int resultado_size)
	{
		int adc = 0;

		for (int i = 0; i < resultado_size; i++) 
		{
			int producto = resultado[i]*x+adc;
			resultado[i] = producto%10;
			adc = producto/10;
		}

		while(adc != 0)
		{
			resultado[resultado_size] = adc%10;
			adc = adc/10;
			resultado_size++;
		}

		return resultado_size;
	}

	public static void main(String[] args) 
	{
		funcfact(100);
	}
}