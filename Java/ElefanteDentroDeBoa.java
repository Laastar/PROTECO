import java.util.Random;
import java.util.Scanner;

public class ElefanteDentroDeBoa
{
	public static void main(String[] args) 
	{
		System.out.println("Elige el numero de tiradas");
		Scanner scanner = new Scanner(System.in);
		int tiradas = scanner.nextInt();
		System.out.println("Elige el numero de dados");
		int dados = scanner.nextInt();
		int [] arr1 = new int[tiradas];
		int limite = ((5*dados)+(1*dados));
		Random aleatorio = new Random();
		System.out.println("");
		for (int i = 0;i < tiradas; i++) 
		{
			arr1[i] = aleatorio.nextInt(5*dados)+(1*dados);
			/*
			Puedes descomentar para observar los numeros salidos
			en la tirada de dados
			*/
			System.out.println(arr1[i]);
		}
		//System.out.println("");
		int [] arr2 = new int[limite+1];
		for (int i = 0;i < arr1.length; i++) 
		{
			for (int j = 0;j < limite; j++) 
			{
				if(arr1[i] == j)
				{
					arr2[j] += 1;
				}
			}
		}
		/*
		Aqui lo puedes descomentar para ver el numero de veces que
		se repite un numero tirado en el o los dados
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("");
		*/
		System.out.println("Distribucion");
		for (int contador = dados; contador < arr2.length; contador++) 
		{
			if(contador >= 10)
			{
				System.out.printf("%d: ", contador);
			}
			else
			{
				System.out.printf("%02d: ", contador);
			}
			for (int asterisco = 0; asterisco < arr2[contador]; asterisco++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
