import java.util.ArrayList;
import java.util.List;

public class Listas
{
	public static void main(String[] args) 
	{
		//ArrayList
		List<String> items = new ArrayList<String>();

		items.add("Rojo");
		items.add(0, "Amarillo");

		System.out.println("Contenido con for: ");

		for (int i = 0; i < items.size(); i++) 
		{
			System.out.printf(" %s", items.get(i));
		}

		System.out.println("");

		mostrar(items, "\nMuestra el contenido de la lista usando for-each: ");

		items.add("Verde");
		items.add("Amarillo");

		mostrar(items, "\nLista con nuevo elementos: ");

		items.remove("Amarillo");

		mostrar(items, "\nQue Amarillo borro?");

		items.remove(1);

		mostrar(items, "\nBorra el segundo elemento");

		System.out.printf("\"Rojo\" %s esta en la lista\n", items.contains("Rojo") ? "si" : "no");


	}

	public static void mostrar(List<String> items, String encabezado)
	{
		System.out.println(encabezado);

		for (String item : items) 
		{
			System.out.printf(" %s", item);
		}

		System.out.println("");
	}
}