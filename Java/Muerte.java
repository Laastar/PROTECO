class Muerte
{
	public static boolean muertoFis(Fisicos fisico)
	{
		if(fisico.getHelth()<1)
		{
			return true;
		}
		return false;
	}
}