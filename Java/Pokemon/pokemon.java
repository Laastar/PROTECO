class pokemon
{
	private String nombre;
	private int vida;
	private int nivel;

	pokemon(int seleccion)
	{
		if(seleccion == 1)
		{
			nombre = Blastoise;
		}
		else
		{
			nombre = Charizard;
		}
		vida = 20;
		nivel = 1;
	}
}


public main class mainpokemon
{
	public class public static void main(String[] args) 
	{
		System.out.println("Elige tu pokemon");
		System.out.println("1. Blastoise");
		System.out.println("2. ");
		Scanner s = new Scanner(System.in);
		pokemon(s);
	}
}