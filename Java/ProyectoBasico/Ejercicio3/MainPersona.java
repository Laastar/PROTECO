import java.util.Scanner;

public class MainPersona
{
	public static void main(String[] args) 
	{
		//Se declara una nueva persona
		Persona persona = new Persona();
		//Se declara un scanner para poder leer desde consola
		Scanner scanner = new Scanner(System.in);

		//Se piden los atributos de la persona
		System.out.println("Introduce el nombre");
		String nombre = scanner.next();
		persona.setNombre(nombre);

		System.out.println("Introduce la edad");
		int edad = Integer.valueOf(scanner.next());
		persona.setEdad(edad);

		System.out.println("Introduce la estatura");
		double estatura = Double.valueOf(scanner.next());
		persona.setEstatura(estatura);

		System.out.println("Introduce el peso");
		double peso = Double.valueOf(scanner.next());
		persona.setPeso(peso);

		System.out.println("");

		//Con los getter de la persona de da a conocer sus atributos
		System.out.println("Nombre de la persona: "+ persona.getNombre());
		System.out.println("Edad: "+ persona.getEdad());
		System.out.println("Esatura: "+ persona.getEstatura()+" (m)");
		System.out.println("Peso: "+ persona.getPeso()+" (kg)");
	}
}