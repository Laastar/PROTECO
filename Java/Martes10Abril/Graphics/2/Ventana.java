import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
	public Ventana()
	{
		super("Linea en Java 2D");

		Lienzo lienzo = new Lienzo();
		this.add(lienzo);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ventana();
	}
}