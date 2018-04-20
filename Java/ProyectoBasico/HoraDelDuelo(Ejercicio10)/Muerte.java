class Muerte
{
	//Los dos metodos checan si la vida del personaje es menor o igual a cero
	public static boolean muerto(Fisicos fisico)
	{
		if(fisico.getHealth()<1)
		{
			return true;
		}
		return false;
	}

	public static boolean muerto(Magicos fisico)
	{
		if(fisico.getHealth()<1)
		{
			return true;
		}
		return false;
	}

}