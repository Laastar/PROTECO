import java.util.Random;
import java.util.Scanner;
//Programa Grafico Barras
/*
Rango de califs
00-09
10-19
20-29
30-39
40-49
50-59
60-69
70-79
80-89
90-99
100
*/

/*
[1,0,3,2,1,1,2,0,1,2,1,1]
12 valores entre 0 y 3
el return regresa 6
agua que almacena
*/
public class GraficoBarras
{
	public static void main(String[] args) 
	{
		int [] arr = {20, 5, 7, 9, 4, 5, 21, 15, 3, 15, 10};
		System.out.println("Distribucion");
		//Para cada elemento del arreglo imprimir una barra del grafico
		for (int contador = 0; contador < arr.length; contador++) 
		{
			if(contador == 10)
			{
				System.out.printf("%5d", 100);
			}
			else
			{
				System.out.printf("%02d-%02d: ", contador*10, contador*10+9);
			}
			//Imprimir los * de acuerdo l valor que sta guardado
			for (int asterisco = 0; asterisco < arr[contador]; asterisco++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}