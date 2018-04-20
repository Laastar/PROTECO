public class ForEach
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 5, 7, 9};
		int total = 0;

		for(int i : arr)
		{
			total+=i;
		}
		System.out.println("Suma total del arreglo = "+total);
	}
}