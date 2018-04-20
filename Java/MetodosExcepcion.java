import java.util.Scanner;

public class MetodosExcepcion
{
	public void lanzarExcepcion() throws MiExcepcion
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Persona 1 para lanzar la excepcion");
		int i = sc.nextInt();
		if (i == 1)
		{
			throw new MiExcepcion();
		}
	}
}