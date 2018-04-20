import java.util.Random;
import java.util.Scanner;

class Ataques
{
	//Ambos metodos checan si el atacante el fisico o magico y ponen mensajes acorde
	//En el caso del oponente es un ataque al azar el que es realizado
	//En el caso del jugador le da opciones a usar
	public static double ataques(Fisicos atacante)
	{
		if(atacante.getNombre() == "Oponente")
		{
			Random rand = new Random();
			int eleccion = rand.nextInt(3)+1;
			if (eleccion == 1)
				return 1*atacante.getDamage();
			if (eleccion == 2)
				return 1.5*atacante.getDamage();
			if (eleccion == 3)
				return 2*atacante.getDamage();
			if (eleccion == 4)
				return 3*atacante.getDamage();			
		}
		else
		{
			System.out.println("Elige tu ataque");
			System.out.println("1. Usar shuriken");
			System.out.println("2. Usar katana");
			System.out.println("3. Usar golpe ligero");
			System.out.println("4. Usar golpe critico");
			Scanner s = new Scanner(System.in);
			int eleccion = s.nextInt();
			if (eleccion == 1)
				return 1*atacante.getDamage();
			if (eleccion == 2)
				return 1.5*atacante.getDamage();
			if (eleccion == 3)
				return 2*atacante.getDamage();
			if (eleccion == 4)
				return 3*atacante.getDamage();	
		}
		return 0;
	}

	public static double ataques(Magicos atacante)
	{
		if(atacante.getNombre() == "Oponente")
		{
			Random rand = new Random();
			int eleccion = rand.nextInt(3)+1;
			if (eleccion == 1)
				return 1*atacante.getDamage();
			if (eleccion == 2)
				return 1.5*atacante.getDamage();
			if (eleccion == 3)
				return 2*atacante.getDamage();
			if (eleccion == 4)
				return 3*atacante.getDamage();			
		}
		else
		{
			System.out.println("Elige tu ataque");
			System.out.println("1. Suiton Suishoha");
			System.out.println("2. Suiton Suikoudan no Jutsu");
			System.out.println("3. Suiton Daikoudan no Jutsu");
			System.out.println("4. Suiton Suiryu Kobaku");
			Scanner s = new Scanner(System.in);
			int eleccion = s.nextInt();
			if (eleccion == 1)
				return 1*atacante.getDamage();
			if (eleccion == 2)
				return 1.5*atacante.getDamage();
			if (eleccion == 3)
				return 2*atacante.getDamage();
			if (eleccion == 4)
				return 3*atacante.getDamage();	
		}
		return 0;
	}
}