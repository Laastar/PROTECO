class Guerrero extends Fisicos
{
	//Copnstructor del Guerrero que contiene diferentes stats
	Guerrero(String nombre)
	{
		super(nombre);
		super.setDamage(30);
		super.setHealth(50);
	}
}