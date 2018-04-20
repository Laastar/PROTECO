import java.util.Scanner;
import java.util.ArrayList;

public class MainPrebeMart
{
	public 
	static void main(String[] args) 
	{
		//Se limpia la pantalla
		LimpiarPantalla.limpiezaPorfavor();

		//Se declaran las listas de lo produstos y precios, junto con la varialbe de eleccion
		int eleccion = 1;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> productos = new ArrayList<String>();
		ArrayList<Integer> precios = new ArrayList<Integer>();

		System.out.println("Bienvenido al PrebeMart");
		System.out.println("Tiene 500 creditos, úselos sabiamente");
		System.out.println("Por favor ingrese sus porductos");

		//mientras siga eligiendo introducir mas productos no saldra de aqui
		while(eleccion == 1)
		{
			//Pide el nombre y precio del producto
			System.out.println("Introduce el nombre del producto");
			String nombre = scanner.next();
			productos.add(nombre);

			System.out.println("Introduce el precio");
			int precio = Integer.valueOf(scanner.next());
			precios.add(precio);

			//Pregunta si desea agregar otro o no
			System.out.println("Desea agregar otro producto?");
			System.out.println("(1 = SI , 2 = NO)");
			eleccion= Integer.valueOf(scanner.next());
		}

		//Se limpia la pantalla y le muestra la lista de sus porductos junto con su precio
		LimpiarPantalla.limpiezaPorfavor();
		System.out.println("Estos son los productos que tienes y su respectivo precio");
		for (int i = 0; i < precios.size(); i++) 
		{
			System.out.println(productos.get(i) + "\t" + precios.get(i));
		}
		Productos.calculoTotal(productos, precios);
	}
}