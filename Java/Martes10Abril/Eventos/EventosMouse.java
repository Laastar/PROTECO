import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class EventosMouse extends JFrame
{
	private JPanel mousePanel;
	private JLabel barraEstado;;

	public static void main(String[] args) 
	{
		EventosMouse mouse = new EventosMouse();
		mouse.setVisible(true);
		mouse.setSize(600, 600);
		mouse.setResizable(true);
		mouse.setLocation(300, 300);
		mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public EventosMouse()
	{
		super("Demostrando eventos del mouse");
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.BLACK);
		add(mousePanel, BorderLayout.CENTER);

		barraEstado = new JLabel("Mouse fuera del panel");
		add(barraEstado, BorderLayout.SOUTH);

		MouseHandler manejador = new MouseHandler();
		mousePanel.addMouseListener(manejador);
		mousePanel.addMouseMotionListener(manejador);
	}

	private class MouseHandler implements MouseListener, MouseMotionListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			barraEstado.setText(String.format("Click en [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			barraEstado.setText(String.format("Presionado en [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			barraEstado.setText(String.format("Soltado en [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			mousePanel.setBackground(Color.BLUE);
		}

		@Override
		public void mouseDragged(MouseEvent e)
		{
			barraEstado.setText(String.format("Arrastrado en [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			barraEstado.setText(String.format("Movido en [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			barraEstado.setText(String.format("Salido en [%d, %d]", e.getX(), e.getY()));
			mousePanel.setBackground(Color.BLACK);
		}
	}
}