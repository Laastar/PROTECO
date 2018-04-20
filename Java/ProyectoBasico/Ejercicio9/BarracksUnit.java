 class BarracksUnit
{
	//Se declaran los atributos de una unidad general
	private double damage;
	private double health;

	//Constructor de una unidad general
	BarracksUnit()
	{
		health = 100;
		damage = 20;
	}

	//Getters para los atributos de la unidad
	public double getDamage()
	{
		return damage;
	}

	public double getHealth()
	{
		return health;
	}

	//metodo de la unidad general para realizar una formacion
	public void formacion()
	{
		System.out.println("Los soldados estan desorganizados");
	}
}