class Persona
{
	//Atributos de las persona
	private String nombre;
	private int edad;
	private double estatura;
	private double peso;

	//Constructor vacio ya que se nos pide hacer uso de los setters para establecer los atributos
	Persona(){}

	//Getters y setter de los atributos de la persona
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setEdad(int edad)
	{
		this.edad = Integer.valueOf(edad);
	}

	public void setEstatura(double estatura)
	{
		this.estatura = Double.valueOf(estatura);
	}

	public void setPeso(double peso)
	{
		this.peso = Double.valueOf(peso);
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getEdad()
	{
		return Integer.valueOf(edad);
	}

	public double getEstatura()
	{
		return Double.valueOf(estatura);
	}

	public double getPeso()
	{
		return Double.valueOf(peso);
	}
}