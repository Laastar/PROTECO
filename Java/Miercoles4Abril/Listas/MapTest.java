import java.util.HashMap;
import java.util.Map;

public class MapTest
{
	static Map<Persona,Animal> mascotas= new HashMap<Persona,Animal>();

	public static void main(String[]args)
	{
		Persona p1= new Persona("Juan","Perez");
		Persona p2= new Persona("Pepe","Gonzalez");

		Animal a1=new Animal("Perro");
		Animal a2=new Animal("Canario");

		mascotas.put(p1,a1);
		mascotas.put(p2,a2);

		System.out.println(p1.getNombre() +" tiene un"+mascotas.get(p2).getNombre());
		System.out.println(p2+" tiene un"+mascotas.get(p1));

		imprimirMapa();

		System.out.println("Mapa contiene a Pepe:"+mascotas.containsKey(p2));

		mascotas.remove(p2);

		System.out.println("Mapa contiene a Pepe:"+mascotas.containsKey(p2));
	}

	public static void imprimirMapa()
	{
		System.out.println("\nContenido de mapa:");

		for(Persona p: mascotas.keySet())
		{
			System.out.println(p+" : "+mascotas.get(p));
		}

		System.out.println("Total:"+mascotas.size()+"entradas\n");
	}
}