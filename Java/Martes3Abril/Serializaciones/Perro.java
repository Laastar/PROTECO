import java.io.Serializable;

class Perro implements Serializable
{
	private String raza;
	private String color;
	private String nombre;
	private int edad;
	private Collar collar;

	Perro(String raza, String color, String nombre, int edad, Collar collar)
	{
		this.raza = raza;
		this.color = color;
		this.nombre = nombre;
		this.edad = edad;
		this.collar = collar;
	}

	public String getRaza()
	{
		return raza;
	}

	public String getColor()
	{
		return color;
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getEdad()
	{
		return edad;
	}

	public Collar getCollar()
	{
		return collar;
	}

	public void setRaza(String raza)
	{
		this.raza = raza;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public void setCollar(Collar collar)
	{
		this.collar = collar;
	}

	@Override
	public String toString()
	{
		return "Perro{ raza = " + raza + ", color = " + color + ", nombre = " + nombre + ", edad = " + edad + ", collar = " + collar + "}";
	}
}
