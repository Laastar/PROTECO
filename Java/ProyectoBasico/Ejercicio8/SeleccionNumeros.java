import java.util.Scanner;

class SeleccionNumeros
{
	public static void numeros(int eleccion)
	{
		//Se declara un scanner para poder recibir datos
		//Y se declara un arreglo en el cual contendremos los numeros dados
		Scanner scanner = new Scanner(System.in);
		double[] nums = new double[2];

		//Si el usuario no introduce un numero le manda un mensaje
		//Y lo mantiene en un loop hasta que introduzca un numero
		for(int i = 0; i < 2; i ++)
		{
			try
			{
				System.out.println("Elija el numero " + (i+1));
				double numero = Double.valueOf(scanner.next());
				nums[i] = numero;
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Caracter no valido");
				System.out.println("Intente de nuevo");
				i--;
			}
		}

		//Hace la eleccion de la operacion a realizar
		switch(eleccion)
		{
			case 1:
				Suma.sumatoria(nums);
				break;
			case 2:
				Resta.inversoSumatorio(nums);
				break;
			case 3:
				Division.inversoMultiplicativo(nums);
				break;
			case 4:
				Multiplicacion.multiplicar(nums);
				break;
		}
	}
}