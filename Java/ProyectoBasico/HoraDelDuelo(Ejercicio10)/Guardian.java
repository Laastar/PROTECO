class Guardian extends Fisicos
{
	//Copnstructor del Guardian que contiene diferentes stats
	Guardian(String nombre)
	{
		super(nombre);
		super.setDefensa(20);
		super.setRegenHealth(15);
	}
}
