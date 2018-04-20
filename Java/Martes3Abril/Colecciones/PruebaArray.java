import java.util.Arrays;
import java.util.Random;

public class PruebaArray
{
	public static void main(String[] args) 
	{
		int num[] = new int[10];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis()); //Tiempo que ha pasado desde 1 enero de 1970

		for (int i = 0; i < num.length; i++) 
		{
			num[i] = rand.nextInt(100);
		}

		int[] antes = (int []) num.clone();

		System.out.println("Arreglo num es igual antes de ser ordenado: " + Arrays.equals(antes, num));

		Arrays.sort(num);

		System.out.println("Arreglo num es igual despues de ser ordenado: " + Arrays.equals(antes, num));

		System.out.println("Antes = " + Arrays.toString(antes));
		System.out.println("Num = " + Arrays.toString(num));

		System.out.println("Busqueda del numero 9, resultado: " + Arrays.binarySearch(num, 9));
	}
}