import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayExceptionExample
{
	public static void main(String[] args) 
	{
		/*
		try
		{
			int[] numeros = {1,2,3,4};
			System.out.println(""+numeros[8]);
			System.out.println("Todo Bien");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Te excediste del rango del arreglo");
		}
		*/

		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		try
		{
			x = sc.nextInt();
		}
		catch (InputMismatchException e) 
		{
			System.out.println("No se ingreso un numero");
		}
		finally
		{
			System.out.println("Siempre se ejecuta");
			x=4;
		}

		String cadena;
		System.out.println("Ingresa un numero para el divisor");
		try
		{
			sc.nextLine();
			cadena = sc.nextLine();
			y = Integer.parseInt(cadena);
			System.out.println("El resultado es: " + (x/y));
		}
		catch (NumberFormatException e) 
		{
			System.out.println("No se ingreso un numero");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("No se puede dividir entre 0");
		}
	}
}