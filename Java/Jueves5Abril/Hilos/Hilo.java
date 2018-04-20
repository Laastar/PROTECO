public class Hilo extends Thread
{
	public static void main(String[] args) 
	{
		Hilo hi = new Hilo("Hi");
		Hilo hola = new Hilo("Hola");
		hi.run();
		hola.run();
	}

	public Hilo(String name)
	{
		super(name);
	}

	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Iteracion: " + (i+1) + " de " + getName());
		}
		System.out.println("Termino el hilo " + getName());
	}
}