import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class Servidor extends Thread
{
	private String nombreCliente;
	private BufferedReader entrada;

	public Servidor(Socket s) throws IOException
	{
		entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
		nombreCliente = s.getInetAddress().getCanonicalHostName();
		System.out.println("Conexion aceptada desde: " + s.getRemoteSocketAddress());
	}

	public String recibir() throws IOException
	{
		String str = entrada.readLine();
		return str;
	}

	public void cerrar()
	{
		entrada.close();
	}

	@Override
	public void run()
	{
		try
		{
			String cadena = "";
			do
			{
				recibir();
				System.out.println(nombreCliente + " dice: " + cadena);
			} while(!cadena.equals("salir"));
		}
		catch (IOException e) {}

		finally
		{
			try
			{
				cerrar();
			}
			catch (IOException e) {	}
		}
	}
}

class Cliente
{
	private PrintStream ps;
	private String mensaje;

	public Cliente()
	{
		
	}

	public void setHost()
	{
		this.host = host;
	}

	public void setPort()
	{
		this.port = port;
	}

	public void conectar() throws IOException
	{
		Socket s = new Socket(host, port);
		ps = new PrintStream(s.getOutputStream());
	}

	public void enviar(String mensaje) throws IOException
	{
		ps.println(mensaje);
	}

	public void cerrar() throws IOException
	{
		ps.close();
	}

	public static void main(String[] args) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Cliente cliente = new Cliente();
		System.out.println("Host: ");
		Cliente.setHost(teclado.readLine());
		System.out.println("Puerto: ");
		Cliente.setPort(Integer.parseInt(teclado.readLine()));
		cliente.conectar();
		String cadena = "";

		while(!cadena.equals("salir"))
		{
			System.out.print("Mensaje: ");
			str = teclado.readLine();
			cliente.enviar(cadena);
		}
		cliente.cerrar();
	}
}

public class Chat
{
	public static void main(String[] args) 
	{
		ServerSocket ss;
		ss = new ServerSocket(0);
		System.out.println("Servidor aceptando conexiones en el puerto: " + ss.getLocalPort());
		while(true)
		{
			Socket cliente = ss.accept();
			Servidor hilo = new Servidor(cliente);
			hilo.start();
		}
	}
}