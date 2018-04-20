import java.util.Scanner;

class Horse implements Runnable
{
	Score s = new Score();
	String horseName = null;

	public Horse(String horseName)
	{
		this.horseName = horseName;
	}

	public void run()
	{
		System.out.println("El caballo " + horseName + " esta corriendo");

		try
		{
			for(int i = 0; i < 5; i++)
			{
			 	Thread.currentThread().sleep(1000);
				s.position++;

				if(s.winner == false)
				{
					System.out.println("Posicion " + horseName + ": " + s.position);
				}

				if(s.position == 5 && s.winner == false)
				{
					System.out.println("El caballo " + horseName + " gano");
					s.winner = true;
					if(HorseSelected.selectName.equals(horseName))
					{
						System.out.println("Ganaste un pomo :v");
					}
					else
					{
						System.out.println("Me debes un pomo >:v");
					}
					Thread.currentThread().interrupt();
				}
			}
		}
		catch (Exception e) {
			
		}
	}
}

class HorseSelected
{
	static String selectName = "Hola";
}

class Score
{
	int position = 0;
	static boolean winner = false;
}

public class HorseRacing
{
	public HorseRacing()
	{
		System.out.println("Pick a horse: 1.Horse1, 2.Horse2, 3.Horse3"); 
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();

		switch (opcion) 
		{
			case "1":
				HorseSelected.selectName = "Horse1";
				break;
			case "2":
				HorseSelected.selectName = "Horse2";
				break;
			case "3":
				HorseSelected.selectName = "Horse3";
				break;
			default:
				System.out.println("Estas wey");
				break;
		}
		System.out.println("Comienza la carrera");
		Horse h1 = new Horse("Horse1");
		Horse h2 = new Horse("Horse2");
		Horse h3 = new Horse("Horse3");

		new Thread(h1).start();
		new Thread(h2).start();
		new Thread(h3).start();
	}

	public static void main(String[] args) 
	{
		HorseRacing carrera = new HorseRacing();
	}
}