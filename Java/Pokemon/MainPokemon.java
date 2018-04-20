import java.util.Scanner;
public class MainPokemon 
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
