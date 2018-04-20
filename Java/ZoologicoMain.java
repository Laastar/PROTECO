public class ZoologicoMain
{
	public static void main(String[] args) 
	{
		Zoologico z = new Zoologico();
		z.agregarAnimal(new Jirafa());
		z.agregarAnimal(new Leon());
		//z.agregarAnimal(new Elefante());
		//For mas rapido que for each
		for (int i = 0; i <z.numero; i++) 
		{
			Animal a = z.animales[i];
			a.alimentar(new Carne());
			a.alimentar(new Manzana());
			if(a instanceof Leon)
			{
				Leon l = (Leon) a;
				l.rugir();
			}
		}
	}	
	//Hicimos un upcast
}