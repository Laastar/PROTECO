class Auto
{
	//Variables de cada auto
	private String nombre;
	private String color;
	private int costo;

	//Constructores de autos
	Auto()
	{

	}

	Auto(String nombre, String color, int costo)
	{
		this.nombre = nombre;
		this.color = color;
		this.costo = costo;
	}

	//Getters y setters de los atributos del auto
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void setCosto(int costo)
	{
		this.costo = costo;
	}

	public int getCosto()
	{
		return costo;
	}

	//Metodos que nos dicen el estado del auto
	public static void hablame(Auto auto)
	{
		System.out.println(auto.getNombre()+"...lo saluda");
	}

	public static void abrePuerta(Auto auto)
	{
		System.out.println(auto.getNombre()+"...esta abriendo puerta...");
	}

	public static void enciende(Auto auto)
	{
		System.out.println(auto.getNombre()+"...Initiating startup...");
	}
}