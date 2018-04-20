import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
	public static void main(String[] args) throws IOException
	{
		//Paso 1 crear un socket servidor

		ServerSocket ss = new ServerSocket(0);

		String cadena = "";

		System.out.println("Esperando la conexion en el puerto...");

		//Paso 2 Esperar conexion

		Socket s = ss.accept();

		System.out.println("Conexino establecida desde " + s.getInetAddress() + " " + s.getInetAddress().getCanonicalHostName());

		//Paso 3 Obtener flujos de I/O del Socket

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//Paso 5 Realizar procesamiento

		while(!cadena.equals("quit"))
		{
			cadena = br.readLine();
			System.out.println(cadena);
		}

		//Paso 6 Cerrar la conexion

		br.close();

		s.close();

		ss.close();
	}
}