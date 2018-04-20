class LinkStart
{
	public static void startup(int eleccion, int avanzado, String nombre)
	{
		//Primero checa si se eligio una unidad de tipo avanzado o no
		//Despues checa que clase o subclase se eligio
		if(avanzado == 0)
		{
			switch(eleccion)
			{
				case 1:
					Fisicos player = new Fisicos(nombre);
					Combate.preCombat(player);
					break;
				case 2:
					Magicos player2 = new Magicos(nombre);
					Combate.preCombat(player2);
					break;
			}	
		}
		else
		{
			switch (eleccion) 
			{
				case 1:
					Guardian player = new Guardian(nombre);
					Combate.preCombat(player);
					break;
				case 2:
					Guerrero player2 = new Guerrero(nombre);
					Combate.preCombat(player2);
					break;
				case 3:
					Elementalista player3 = new Elementalista(nombre);
					Combate.preCombat(player3);
					break;
				case 4:
					Nigromante player4 = new Nigromante(nombre);
					Combate.preCombat(player4);
					break;				
			}
			
		}
	}
}