import java.util.Random;
public class Aleatorios
{
	public static void main(String[] args) 
	{
		int[] a1 = new int[5];
		int[] a2 = new int[5];

		Random aleatorio = new Random();

		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = aleatorio.nextInt(6);
			a2[i] = aleatorio.nextInt(6);
		}
		System.out.println("Arreglo 1");
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("El contenido en el indce "+i+" es: "+a1[i]);
		}
		System.out.println("Arreglo 2");
		for (int i = 0; i < a2.length; i++) 
		{
			System.out.println("El contenido en el indce "+i+" es: "+a2[i]);
		}
	}
}