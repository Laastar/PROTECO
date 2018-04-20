import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collection;

class SetTest
{
	public static void main(String[]args)
	{
		String[]colores= {"rojo","blanco","azul","verde","gris","naranja","blanco","gris"};

		List<String>lista= Arrays.asList(colores);

		System.out.printf("Lista: %s\n",lista);

		imprimeSinDuplicados(lista);
	}

	private static void imprimeSinDuplicados(Collection<String>valores)
	{
		Set<String> set=new HashSet<String>(valores);

		System.out.printf("\nSin duplicados:");

		for(String valor: set)
		{
			System.out.printf("%s\n",valor);
		}
	}
}