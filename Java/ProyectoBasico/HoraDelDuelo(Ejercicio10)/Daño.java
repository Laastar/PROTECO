import java.util.Scanner;

class Daño
{
	//Ambos metodos hacen uso de polimorfismo
	//Hacen el calculo del daño y la vida restante y lo muestran en pantalla
	public static void hacerDaño(double dañoHecho, Fisicos oponente)
	{
		double dañoFinal = dañoHecho * ( 1 - (oponente.getDefensa() / 100) );
		oponente.hacerDaño(dañoFinal);
		System.out.println("Realizado " + dañoFinal+ " puntos de daño");
		Scanner s = new Scanner(System.in);
		System.out.println("Press a key to proceed...");
		s.nextLine();
	}

	public static void hacerDaño(double dañoHecho, Magicos oponente)
	{
		double dañoFinal = dañoHecho * ( 1 - (oponente.getDefensa() / 100) );
		oponente.hacerDaño(dañoFinal);
		System.out.println("Realizado " + dañoFinal+ " puntos de daño");
		Scanner s = new Scanner(System.in);
		System.out.println("Press a key to proceed...");
		s.nextLine();
	}
}