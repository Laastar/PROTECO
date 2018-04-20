public class MainAuto
{
	public static void main(String[] args) 
	{	
		//Generamos diferentes autos con diferenste constructores
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Mustang", "Amarillo", 300000);
		Auto auto3 = new Auto();

		//Se utilizan los metodos de la clase auto para colocacion de atributos
		auto3.setNombre("Cadillac");
		auto3.setColor("Negro");
		auto3.setCosto(90000000);
		auto1.setNombre("Mini Cooper");

		//Nos dice los atributos de los autos
		System.out.println("Nombre del auto 3: "+auto3.getNombre());
		System.out.println("Color del auto 3: "+auto3.getColor());
		System.out.println("Costo del auto 3: "+auto3.getCosto());
		System.out.println("Nombre del auto 2: "+auto2.getNombre());

		//Algunos metodo que nos dicen el estado del auto
		Auto.abrePuerta(auto3);
		Auto.enciende(auto1);
		Auto.hablame(auto2);
	}
}