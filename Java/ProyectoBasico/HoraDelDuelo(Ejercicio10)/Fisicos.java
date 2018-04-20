class Fisicos //extends Personajes
{
	//Atributos de los personajes basados en ataque fisico
	private double health;
	private double damage;
	private double regenHealth;
	private double defensa;
	private String nombre;

	//Construcor base de los personajes fiscos
	Fisicos(String nombre)
	{
		health = 200;
		damage = 30;
		regenHealth = 25;
		defensa = 20;
		this.nombre = nombre;
	}

	//Getters de los atributos
	public double getHealth()
	{
		return health;
	}

	public double getDamage()
	{
		return damage;
	}

	public double getRegenHealth()
	{
		return regenHealth;
	}

	public double getDefensa()
	{
		return defensa;
	}

	public String getNombre()
	{
		return nombre;
	}

	//Modificadores de los atributos
	public void setHealth(double health)
	{
		this.health += health;
	}

	public void setDamage(double damage)
	{
		this.damage += damage;
	}

	public void setDefensa(double defensa)
	{
		this.defensa += defensa;
	}

	public void setRegenHealth(double regenHealth)
	{
		this.regenHealth += regenHealth;
	}

	public void hacerDaño(double daño)
	{
		this.health -= daño;
	}
}
