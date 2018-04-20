public class VehiculoAcuatico extends Vehiculo
{
	String nombreVehiculo;
	public VehiculoAcuatico(String nombre)
	{
		super(nombre);
	}
	public void navegar()
	{
		System.out.println(super.transportar() + "Acuatico");
	}
}