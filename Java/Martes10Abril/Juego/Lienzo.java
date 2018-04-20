import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JComponent;

public class Lienzo extends JComponent implements Runnable
{
	Map<String, Point> palabras;
	List<String> lista = new ArrayList<String>();
	String palabraUsuario;
	int score;

	public Lienzo()
	{
		setPreferredSize(new Dimension(800, 600));
		palabras = new HashMap<String, Point>();
		palabraUsuario = "";
		setFocusable(true);
		requestFocus();
		llenarLista();
		Collections.shuffle(lista);

		addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				switch (e.getKeyCode()) {
					case KeyEvent.VK_ENTER:
						compararPalabra();
						break;
					default:
						palabraUsuario += e.getKeyChar();
				}
			}
		});
	}

	private void llenarLista()
	{
		lista.add("hola1");
		lista.add("hola2");
		lista.add("hola3");
		lista.add("hola4");
		lista.add("hola5");
	}

	private void compararPalabra()
	{
		if(palabras.containsKey(palabraUsuario))
		{
			score++;
			palabras.remove(palabraUsuario);	
		}
		palabraUsuario = "";
	}

	private void agregarPalabra()
	{
		if(lista.size() > 0)
		{
			String s = lista.get(0);
			lista.remove(0);
			int x = new Random().nextInt(600);
			palabras.put(s, new Point(x, 0));
		}
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.drawString("Score: " + score, 10, 10);
		//g2d.drawString("", 100, 100);

		for (String s : palabras.keySet()) 
		{
			g2d.setColor(Color.BLACK);
			g2d.fillRect(palabras.get(s).x, palabras.get(s).y, s.length()*20, 40);
			g2d.setColor(Color.orange);
			Font f = new Font("Arial", Font.PLAIN, 24);
			g2d.setFont(f);
			g2d.drawString(s, palabras.get(s).x+20, palabras.get(s).y+20);
		}
	}

	@Override
	public void run()
	{
		long referencia = new Date().getTime();
		while (true) 
		{
			for(String s : palabras.keySet())
			{
				palabras.get(s).y += 2;
			}

			if(new Date().getTime() - referencia >= 1500)
			{
				agregarPalabra();
				referencia = new Date().getTime();
			}

			if(palabras.get(s).y > 600)
			{

			}

			repaint();

			try
			{
				Thread.sleep(40);
			}
			catch (InterruptedException e) { }
		}
	}
}