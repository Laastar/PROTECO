public class Barco extends VehiculoAcuatico
{
	public Barco(String nombre)
	{
		super(nombre);
	}

	public void encenderMotores()
	{
		System.out.println("Turning on engines");
	}
	@Override
	public void navegar()
	{
		System.out.println("Soy un barco y mi nombre es " + nombre);
	}
}
