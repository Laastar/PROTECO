import java.lang.Boolean;
class Muerte
{
	public static boolean muerto(Pokemon poke)
	{
		if(poke.getVida()<1)
		{
			return true;
		}
		return false;
	}
}