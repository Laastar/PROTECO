import java.util.Scanner;
import java.lang.Boolean;

class Pokemon
{
	private String nombre;
	private String tipo;
	private int vida;
	private int nivel;

	Pokemon(int seleccion)
	{
		if(seleccion == 1)
		{
			nombre = "Blastoise";
			tipo = "Agua";
		}
		else
		{
			nombre = "Charizard";
			tipo = "Fuego";
		}
		vida = 20;
		nivel = 1;
	}

	public String getName()
	{
		return nombre;
	}

	public int getVida()
	{
		return vida;
	}

	public String getTipo()
	{
		return tipo;
	}
}

class SeleccionTurno
{
	public static boolean Turno(int seleccion);
	{
		if(seleccion  == 1)
		{
			seleccion=2;
			return true;
		}
		seleccion=2;
		return false;
	}
}

public class MainPokemon 
{

	public static void main(String[] args) 
	{

		System.out.println("Elige tu pokemon");
		System.out.println("1. Blastoise");
		System.out.println("2. Charizard");
		Scanner s = new Scanner(System.in);
		int eleccion = s.nextInt();
		Pokemon poke1 = new Pokemon(eleccion);
		if (eleccion == 1)
		{
			eleccion = 2;
		}
		else
		{
			eleccion = 1;
		}
		Pokemon poke2 = new Pokemon(eleccion);
		System.out.println("Elegiste a: "+ poke1.getName());
		System.out.println("Vida: "+ poke1.getVida());
		System.out.println("Pokemon tipo: "+ poke1.getTipo());
		System.out.println("");
		System.out.println("Oponente: "+ poke2.getName());
		System.out.println("Vida: "+ poke2.getVida());
		System.out.println("Pokemon tipo: "+ poke2.getTipo());
		SeleccionTurno.Turno(1);

	}
}
