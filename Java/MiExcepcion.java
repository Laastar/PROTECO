public class MiExcepcion extends Exception
{
	@Override
	public String toString()
	{
		return "Mi propia excepcion";
	}

	@Override
	public String getMessage()
	{
		return "Es nuestro propio mensaje";
	}

	public void hola()
	{
		System.out.println("Hola mundo desde la excepcion");
	}
}