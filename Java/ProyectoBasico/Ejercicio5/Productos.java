import java.util.Scanner;
import java.util.ArrayList;

class Productos
{
	public static void calculoTotal(ArrayList<String> productos, ArrayList<Integer> precios)
	{
		//Se declara un scanner para pode rerecibir datos
		Scanner scanner = new Scanner(System.in);

		//Se declara el total y el dinero actual
		int total = 0;
		int dinero = 500;

		//Se hace la suma de los precios de los productos
		for (int i = 0; i < precios.size(); i++) 
		{
			total = total + precios.get(i);
		}
		System.out.println("El total seria de: " + total);
		System.out.println("Que desea hacer?");
		System.out.println("1)Comprar ");
		System.out.println("2)Dejar productos ");
		int decision = Integer.valueOf(scanner.next());

		//En caso de que el precio sobrepase el presupeusto de manda a quitar algunos productos
		//En caso contrario procede normalmente
		if(decision == 1 && total > 500 )
		{
			Productos.quitar(productos, precios, total);
		}
		else
		{
			Productos.pago(total);
		}
	}

	public static void quitar(ArrayList<String> productos, ArrayList<Integer> precios, int total)
	{
		//Se declara un scanner para poder recibir datos
		Scanner scanner = new Scanner(System.in);

		//Mientras el total sea mayor al presupuesto seguira pidiendo quitar productos de la lista
		while(total > 500)
		{
			total = 0;
			System.out.println("Excediste lo que puedes pagar");
			System.out.println("Debes dejar algunos productos");
			System.out.println("Estos son los productos que tienes y su respectivo precio");

			//Se despliegan los productos con su precio e indice en la lista
			for (int i = 0; i < precios.size(); i++) 
			{
				System.out.println(i + ". " + productos.get(i) + "\t" + precios.get(i));
				total = total + precios.get(i);
			}
			System.out.println("Total: " + total);
			System.out.println("Que producto deseas quitar?");

			//Se pide el indice para poder quitar al elemento junto con su respectivo precio de las listas
			int num = Integer.valueOf(scanner.next());
			precios.remove(num);
			productos.remove(num);
			total = 0;
			for (int i = 0; i < precios.size(); i++) 
			{
				total = total + precios.get(i);
			}
			System.out.println("Que desea hacer?");
			System.out.println("1)Comprar ");
			System.out.println("2)Dejar productos ");
			int decision = Integer.valueOf(scanner.next());

			//Si el valor del total es menor a 550 y eligio proseguir a comprarlos, se procede
			//De lo contrario solo limpa la pantalla
			if(decision == 1 && total > 500 )
			{
				LimpiarPantalla.limpiezaPorfavor();
			}
			if(decision == 1 && total < 501)
			{	
				LimpiarPantalla.limpiezaPorfavor();
				Productos.pago(total);
			}
		}
	}

	public static void pago(int total)
	{
		//le dice el cambio de su compra
		System.out.println("Gracias por su compra");
		System.out.println("Su cambio fue de: " + (500-total));
	}
}