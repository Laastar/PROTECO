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
			//ataque1 = 
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

	public void setVida(int vida)
	{
		this.vida = vida;
	}

	public String getTipo()
	{
		return tipo;
	}
}

class SeleccionTurno
{
	public static boolean turno(int seleccion)
	{
		if(seleccion  == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Ataque
{
	public static int ataques(Pokemon poke)
	{
		int daño;
		if(poke.getName()=="Blastoise")
		{
			System.out.println("Elige tu ataque");
			System.out.println("1. Impactrueno");
			System.out.println("2. Suiton Suikoudan no Jutsu");
			System.out.println("3. Suiton Daikoudan no Jutsu");
			System.out.println("4. Suiton Suiryu Kobaku");
			Scanner s = new Scanner(System.in);
			int eleccion = s.nextInt();
			if (eleccion == 1)
				return 5;
			if (eleccion == 2)
				return 7;
			if (eleccion == 3)
				return 9;
			if (eleccion == 4)
				return 15;			
		}
		else
		{
			System.out.println("Elige tu ataque");
			System.out.println("1. Katon Gokakyu no Jutsu");
			System.out.println("2. Katon Hosenka no Jutsu");
			System.out.println("3. Yasaka Magatama");
			System.out.println("4. Amaterasu");
			Scanner s = new Scanner(System.in);
			int eleccion = s.nextInt();
			if (eleccion == 1)
				return 5;
			if (eleccion == 2)
				return 7;
			if (eleccion == 3)
				return 9;
			if (eleccion == 4)
				return 15;
		}
		return 0;
	}
}

class Daño
{
	public static void hacerDaño(int dañoHecho, Pokemon poke)
	{
		int vida = poke.getVida();
		vida = vida - dañoHecho;
		poke.setVida(vida);
		System.out.println("Hiciste " + dañoHecho+ " puntos de daño");
		Scanner s = new Scanner(System.in);
		System.out.println("Press a key to proceed...");
		s.nextLine();
	}
}

class Muerte
{
	public static boolean muerto(Pokemon poke)
	{
		if(poke.getVida()<1)
		{
			return true;
		}
		return false;
	}
}

public class MainPokemonOriginal 
{
	public static void main(String[] args) 
	{
		System.out.println("Elige tu pokemon");
		System.out.println("1. Blastoise");
		System.out.println("2. Charizard");

		Scanner s = new Scanner(System.in);
		int eleccion = s.nextInt();
		int eleccion2;

		Pokemon poke1 = new Pokemon(eleccion);
		if (eleccion == 1)
		{
			eleccion2 = 2;
		}
		else
		{
			eleccion2 = 1;
		}
		Pokemon poke2 = new Pokemon(eleccion2);

		System.out.println("Elegiste a: "+ poke1.getName());
		System.out.println("Vida: "+ poke1.getVida());
		System.out.println("Pokemon tipo: "+ poke1.getTipo());
		System.out.println("");
		System.out.println("Oponente: "+ poke2.getName());
		System.out.println("Vida: "+ poke2.getVida());
		System.out.println("Pokemon tipo: "+ poke2.getTipo());
		while(true)
		{
			if(SeleccionTurno.turno(eleccion)==true)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+poke1.getName());
				System.out.println("Vida restante "+poke1.getVida());
				int a =Ataque.ataques(poke1);
				Daño.hacerDaño(a, poke2);
				eleccion++;
				if(Muerte.muerto(poke2)==true)
				{
					System.out.println(poke2.getName() + " ya esta muerto, solo que no le han avisado");
					System.out.println("Ganador "+poke1.getName());
					if(poke1.getVida()<=6)
						System.out.println("Ufff la senti cerca muchachos");
					break;
				}
			}
			else
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+poke2.getName());
				System.out.println("Vida restante "+poke2.getVida());
				int a =Ataque.ataques(poke2);
				Daño.hacerDaño(a, poke1);
				eleccion--;
				if(Muerte.muerto(poke1)==true)
				{
					System.out.println(poke1.getName() + " ya esta muerto, solo que no le han avisado");
					System.out.println("Ganador "+poke2.getName());
					if(poke2.getVida()<=6)
						System.out.println("Ufff la senti cerca muchachos");
					break;
				}
			}
		}
	}
}
