class Naruto
{
	//Variable de los objetos tipo naruto
	private int ninjutsu;

	//Constructor de naruto
	Naruto(int ninjutsu)
	{
		this.ninjutsu = ninjutsu;
	}

	//Metodo getter del atributo ninjutsu
	public int getNinjutsu()
	{
		return ninjutsu;
	}

	//Metodos para incrementar el ninjutsu
	public void incrementarNinjutsu()
	{
		this.ninjutsu++;
	}	
}