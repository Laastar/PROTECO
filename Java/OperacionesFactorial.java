class OperacionesFactorial
{
	static int multiplicar(int x, int resultado[], int resultado_size)
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
}