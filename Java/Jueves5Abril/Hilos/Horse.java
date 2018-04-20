public class Horse implements Runnable
{
	Score s = new Score();
	String horseName = null;

	public Horse(String horseName)
	{
		this.horseName = horseName;
	}

	public void run()
	{
		System.out.println("El caballo " + horsename + " esta corriendo");

		try
		{
			for(int i = 0; i < 5; i++)
			{
			 	Thread.currentThread().sleep(1000);
				s.position++;

				if(s.winner == false)
				{
					System.out.println("Posicion " + horseName + ": " + s.posicion);
				}

				if(s.posicion == 5 && s.winner == false)
				{
					System.out.println("El caballo " + horseName + " gano");
					s.winner = true;
					if(HorseSelected.selectName.equals(horseName))
					{
						System.out.println("Ganaste un pomo :v")M
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


