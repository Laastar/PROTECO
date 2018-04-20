public class PruebaPersona
{
	public static void main(String[] args) 
	{
		Persona persona1 = new Persona();
		Perro perro1 = new Perro("Firulais", 10);
		Perro perro2 = new Perro();
		persona1.nombre="asd";
		persona1.edad=10;
		persona1.peso=65.7;
		/*System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		System.out.println(persona1.peso);*/
		persona1.caminar();
		persona1.dormir();
		System.out.println(perro1.getNombre());
		perro1.traer("Pelota");

	}
}