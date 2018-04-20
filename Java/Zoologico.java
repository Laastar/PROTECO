public class Zoologico
{
	private final int N=10;
	public Animal[] animales = new Animal[N];
	public int numero;
	public void agregarAnimal(Animal a)
	{
		if(numero == N)
		{
			System.out.println("Zoologico lleno");
		}
		else
		{
			animales[numero] = a;
			numero++;
		}
	}
}