import java.util.Scanner;
import java.lang.Boolean;
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
