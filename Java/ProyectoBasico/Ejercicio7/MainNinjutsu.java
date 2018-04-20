public abstract  class MainNinjutsu implements Ninjutsu
{
	public static void main(String[] args) 
	{
		//Se declara un objeto tipo naruto con ninjutsu 4
		Naruto naruto = new Naruto(4);

		//Se llama a las tecnicas que posee naruto
		Tecnicas.rasengan(naruto);
		Tecnicas.rasenShuriken(naruto);
		Tecnicas.odamaRasengan(naruto);
	}
}