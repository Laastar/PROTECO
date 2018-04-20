//Error en interfazRunnable
//sleep
//No hubo ejemplo de join, un copy paste
//yield
//sincro no hubo tiempo
//notify, notify all lo dejo como investigacion

//T T tarea
//leer sincro presentacion
//leer articulos
//problema de 4 filosofos

public class PruebaInterfaz implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Iteracion: " + (i+1) + " de " + Thread.currentThread().getName());
			try
			{
				Thread.currentThread().sleep(5000);
			}
			catch (Exception e) {
				
			}
		}
		saludar();
		System.out.println("Termino el hilo " + Thread.currentThread().getName());
	}

	public void saludar()
	{
		System.out.println("Hola Adios");
	}

	public static void main(String[] args) 
	{
		//Resumido
		new Thread(new PruebaInterfaz(), "Hola").start();

		//Largo y detallado
		PruebaInterfaz Hola2 = new PruebaInterfaz();

		Thread t = new Thread(Hola2, "Hola2");

		t.start();
	}
}
