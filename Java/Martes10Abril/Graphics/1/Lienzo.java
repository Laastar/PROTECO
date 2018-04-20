import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel
{
	@Override
	public void paintComponent(Graphics g)	
	{
		super.paintComponent(g);	//Linea para pintar en el panel

		Graphics2D g2s = (Graphics2D) g;

		g2s.drawString("Hola Mundo", 10, 20);
	}
}