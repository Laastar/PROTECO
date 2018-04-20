class Suma
{
	public void sumatoria(int[] arreglo)
	{
		int total = 0;
		for (int i = 0;  i < arreglo.length; i++) 
		{
			total = total + arreglo[i];
		}	
	}

	public void sumatoria(double a, double b)
	{
		System.out.println(a+b);
	}
}