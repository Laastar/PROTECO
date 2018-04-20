public class ManejoExcepcion
{
	public static void main(String[] args) 
	{
		MetodosExcepcion me = new MetodosExcepcion();

		try
		{
			me.lanzarExcepcion();
		}
		catch (MiExcepcion e) 
		{
			System.out.println(e);
			e.hola();
			e.getMessage();
		}
	}
}