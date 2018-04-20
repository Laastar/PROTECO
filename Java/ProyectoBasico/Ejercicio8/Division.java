class Division
{
	//Metodo que realiza la division
	public static void inversoMultiplicativo(double[] arreglo)
	{
		double num1 = arreglo[0] * 1.0;
		double num2 = arreglo[1] * 1.0;
		//Si se divide entre cero deberia de tirar la excepcion de que no se puede dividr entre cero
		//Pero como se usa valores exactos nos tira innfity
		try
		{
			double total = num1 / num2;
			System.out.println("La division es: " + total);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Introdujiste valores errados");
		}
		
	}
}
