class Combate
{
	//Checa si se eligio una clase fisica y muestra sus atributos en pantalla
	public static void preCombat(Fisicos player)
	{
		Guerrero oponente = new Guerrero("Oponente");
		if(player instanceof Guardian)
		{
			System.out.println("Elegiste la Clase Guardian");
			Guardian player1 = (Guardian) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
		else if(player instanceof Guerrero)
		{
			System.out.println("Elegiste la Clase Guerrero");
			Guerrero player1 = (Guerrero) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
		else if(player instanceof Fisicos)
		{
			System.out.println("Elegiste la Clase Soldado");
			Fisicos player1 = (Fisicos) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
	}

	public static void realTimeCombat(Fisicos player1, Guerrero oponente)
	{
		int eleccion = 1;
		//Mientras haya alguien con vida no sale de este loop
		while(true)
		{
			//Va cambiano de personjaes en cada turno
			//Cada ves manda un mensaje de vida restante y daño realizado
			if(SeleccionTurno.turno(eleccion)==true)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+player1.getNombre());
				System.out.println("Has regenerado "+player1.getRegenHealth()+" puntos de vida");
				player1.setHealth(player1.getRegenHealth());
				System.out.println("Vida restante "+player1.getHealth());
				double ataque =Ataques.ataques(player1);
				Daño.hacerDaño(ataque, oponente);
				eleccion++;
				//Si alguien muere termina el juego
				if(Muerte.muerto(oponente)==true)
				{
					System.out.println(oponente.getNombre() + " ya esta muerto, solo que no le han avisado");
					System.out.println("Ganador "+player1.getNombre());
					if(player1.getHealth()<=10)
						System.out.println("Ufff la senti cerca muchachos");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+oponente.getNombre());
				System.out.println("Oponente ha regenerado "+oponente.getRegenHealth()+" puntos de vida");
				oponente.setHealth(oponente.getRegenHealth());
				System.out.println("Vida restante "+oponente.getHealth());
				double a =Ataques.ataques(oponente);
				Daño.hacerDaño(a, player1);
				eleccion--;
				if(Muerte.muerto(player1)==true)
				{
					System.out.println(player1.getNombre() + " perdiste miserablemente");
					System.out.println("Ganador "+oponente.getNombre());
					System.exit(0);
				}
			}
		}
	}

	//Checa si se eligio una clase magica y muestra sus atributos en pantalla
	public static void preCombat(Magicos player)
	{
		Elementalista oponente = new Elementalista("Oponente");
		if(player instanceof Elementalista)
		{
			System.out.println("Elegiste la Clase Elementalista");
			Elementalista player1 = (Elementalista) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
		else if(player instanceof Nigromante)
		{
			System.out.println("Elegiste la Clase Nigromante");
			Nigromante player1 = (Nigromante) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
		else if(player instanceof Magicos)
		{
			System.out.println("Elegiste la Clase Academico");
			Magicos player1 = (Magicos) player;
			System.out.println("Vida: " + player1.getHealth());
			System.out.println("Regenarcion de vida: " + player1.getRegenHealth());
			System.out.println("Defensa: " + player1.getDefensa());	
			System.out.println("Daño: " + player1.getDamage());
			Combate.realTimeCombat(player1, oponente);
		}
	}

	public static void realTimeCombat(Magicos player1, Elementalista oponente)
	{
		int eleccion = 1;
		//Mientras haya alguien con vida no sale de este loop
		while(true)
		{
			//Va cambiano de personjaes en cada turno
			//Cada ves manda un mensaje de vida restante y daño realizado
			if(SeleccionTurno.turno(eleccion)==true)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+player1.getNombre());
				System.out.println("Has regenerado "+player1.getRegenHealth()+" puntos de vida");
				player1.setHealth(player1.getRegenHealth());
				System.out.println("Vida restante "+player1.getHealth());
				double ataque =Ataques.ataques(player1);
				Daño.hacerDaño(ataque, oponente);
				eleccion++;
				//Si alguien muere termina el juego
				if(Muerte.muerto(oponente)==true)
				{
					System.out.println(oponente.getNombre() + " ya esta muerto, solo que no le han avisado");
					System.out.println("Ganador "+player1.getNombre());
					if(player1.getHealth()<=10)
						System.out.println("Ufff la senti cerca muchachos");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("");
				System.out.println("");
				System.out.println("Turno de "+oponente.getNombre());
				System.out.println("Oponente ha regenerado "+oponente.getRegenHealth()+" puntos de vida");
				oponente.setHealth(oponente.getRegenHealth());
				System.out.println("Vida restante "+oponente.getHealth());
				double a =Ataques.ataques(oponente);
				Daño.hacerDaño(a, player1);
				eleccion--;
				if(Muerte.muerto(player1)==true)
				{
					System.out.println(player1.getNombre() + " perdiste miserablemente");
					System.out.println("Ganador "+oponente.getNombre());
					System.exit(0);
				}
			}
		}
	}
}