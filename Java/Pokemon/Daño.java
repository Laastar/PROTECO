import java.util.Scanner;
class Daño
{
	public static void hacerDaño(int dañoHecho, Pokemon poke)
	{
		int vida = poke.getVida();
		vida = vida - dañoHecho;
		poke.setVida(vida);
		System.out.println("Hiciste " + dañoHecho+ " puntos de daño");
		Scanner s = new Scanner(System.in);
		System.out.println("Press a key to proceed...");
		s.nextLine();
	}
}
