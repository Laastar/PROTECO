public class Pasodearreglos
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 5, 7, 9};
		System.out.println("Efecto de pasar una referenciade un arreglo");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Arreglo["+i+"]: "+arr[i]);
		}
		modificarArreglo(arr);
		System.out.println("Valores del arreglo modificado son: ");
		for (int i = 0; i < arr.length; i++) 	
		{
			System.out.println("Arreglo["+i+"]: "+arr[i]);
		}
	}

	public static void modificarArreglo(int[] arreglo)
	{
		for (int i = 0; i < arreglo.length; i++) 
		{
			arreglo[i] *= 5;
		}
	}
}