import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente
{
	public static void main(String[] args) throws IOException
	{
		//Paso 1 crear un socket para conectar con servidor

		Socket s = new Socket("192.168.1.197", 9999);

		String cadena = "";

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		//Paso 2 Obtener flujos de entrada o salida

		PrintStream ps = new PrintStream(s.getOutputStream());

		//Paso 3 Realizar procesamiento

		while(!cadena.equals("quit"))
		{
			cadena = teclado.readLine();
			ps.println(cadena);
			ps.flush();
		}

		//Paso 5 Cerrar la conexion

		ps.close();

		teclado.close();

		s.close();
	}
}