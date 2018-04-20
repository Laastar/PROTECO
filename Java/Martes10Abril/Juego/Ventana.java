import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
	public Ventana()
	{
		super("Juego Palabras en Java 2D");

		Lienzo lienzo = new Lienzo();
		this.add(lienzo);

		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		Thread t = new Thread(lienzo);
		t.start();
	}

	public static void main(String[] args) 
	{
		new Ventana();
	}
}