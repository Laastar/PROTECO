import java.util.Scanner;
import java.util.Random;
public class arreglos
{
	public static void main(String[] args) 
	{
		System.out.println("Prueba de Arreglos");
		Scanner sc = new Scanner(System.in);
		int[] arreglo1 = new int[5];
		int arreglo2[] = {1, 3, 5, 7, 9};
		for(int i = 0; i < arreglo1.length; i++)
		{
			System.out.print("Ingresa el elemento "+(i+1)+": ");
			arreglo1[i] = sc.nextInt();
		}
		System.out.println("Verificando el contenido del arreglo...");
		for (int i = 0; i < arreglo1.length; i++) 
		{
			System.out.println("El contenido en el indce "+i+" es: "+arreglo1[i]);
		}
		GeneradorArreglos arr = new GeneradorArreglos(1, 6);
	}
}


class GeneradorArreglos
{
	GeneradorArreglos(int i, int y)
	{
		for(int i = 0; i < y; i++)
		{
			arr[i] = rand.nextInt(y);
		}
	}
}
//class 