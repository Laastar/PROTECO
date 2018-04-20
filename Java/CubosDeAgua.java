import java.util.Random;
import java.util.Scanner;

public class CubosDeAgua
{
	public static void main(String[] args) 
	{
		int agua = 0;
		System.out.println("Elige la longitud de arreglo");
		Scanner scanner = new Scanner(System.in);
		int longitud = scanner.nextInt();
		System.out.println("Elige la altura");
		int altura = scanner.nextInt();
		int [] arr1 = new int[longitud];
		int limite = altura;
		Random aleatorio = new Random();
		System.out.println("");
		for (int i = 0;i < longitud; i++) 
		{
			arr1[i] = aleatorio.nextInt(altura);
			/*
			Puedes descomentar para observar los numeros salidos
			en la tirada de dados
			*/
			//System.out.println(arr1[i]);
		}
		//int arr1[] = {0, 1, 12, 2, 1, 22, 1, 35, 23, 1};
		//System.out.println("");
		System.out.println("Distribucion");
		for (int contador = 0; contador < arr1.length; contador++) 
		{
			if(contador >= 10)
			{
				System.out.printf("%d: ", contador+1);
			}
			else
			{
				System.out.printf("%02d: ", contador+1);
			}
			for (int asterisco = 0; asterisco < arr1[contador]; asterisco++) 
			{
				System.out.print('\u25A0');
			}
			System.out.println("");
		}

		int i = 0;
		int j = 0;
		for (i = 0;i < arr1.length; i++) 
		{
			j = i+1;
			if(j >= arr1.length)
			{
				break;
			}
			else
			{
				if(arr1[i] > arr1[j])
				{
					while(j < arr1.length && arr1[i]>arr1[j])
					{
						agua += 1;
						j++;
					}
					if(j > arr1.length)
					{
						agua = 0;
					}
					i = j;
					j++;
				}
			}
		}
		System.out.println("Agua disponible: "+agua);
	}
}
