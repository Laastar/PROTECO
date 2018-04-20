public class Perro
{
	private String nombre;
	private int edad;

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setEdad(int edad)
	{
		if(edad > 0)
		{
			this.edad = edad;
		}
	}

	public String getNombre()
	{
		//System.out.println(nombre);
		return nombre;
	}

	Perro(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}

	Perro()
	{
	}

	public void traer()
	{
		System.out.println("Ahhh prro trais el ocnitrix");
	}

	public void traer(String cosa)
	{
		System.out.println("Ahhh prro trais el "+ cosa);
	}
}