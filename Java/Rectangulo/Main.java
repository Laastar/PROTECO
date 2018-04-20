public class Main
{
	public static void main(String[] args) 
	{
		Rectangulo rect1 = new Rectangulo(10,10);
		Rectangulo rect2 = rect1.agrandar(2, rect1);
		System.out.println("Las dimensiones del nuevo rectangulo son:");
		System.out.println("Base: " + rect2.getBase());
		System.out.println("Altrura: " + rect2.getAltura());

	}
}
