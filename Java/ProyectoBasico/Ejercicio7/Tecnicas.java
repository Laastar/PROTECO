abstract class Tecnicas implements Ninjutsu
{
	//Metodos de la interfaz con contenido
	public static void rasenShuriken(Naruto naruto)
	{
		if(naruto.getNinjutsu()>5)
		{
			naruto.incrementarNinjutsu();
			System.out.println("Utilizando RasenShuriken...");
		}
		else 
		{
			System.out.println("Fallo la tecnica");
		}
	}

	public static void rasengan(Naruto naruto)
	{
		naruto.incrementarNinjutsu();
		System.out.println("Utilizando Rasengan...");
	}

	public static void odamaRasengan(Naruto naruto)
	{
		if(naruto.getNinjutsu()>3)
		{
			naruto.incrementarNinjutsu();
			System.out.println("Utilizando Odama Rasengan...");
		}
		else 
		{
			System.out.println("Fallo la tecnica");
		}
	}
}
