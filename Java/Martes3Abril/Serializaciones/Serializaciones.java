import java.io.Serializable;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Serializaciones
{
	public static void main(String[] args) 
	{
		Perro p = new Perro("Maltes", "Blanco", "Kimmy", 2, new Collar("Kimmy"));

	try
	{
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File("/home/azurefang/java/Martes3Abril/Serializaciones/Perrisimo")));
		salida.writeObject(p);
		salida.close();
	}
	catch(Exception e)
	{

	}

	try
	{
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(new File("/home/azurefang/java/Martes3Abril/Serializaciones/Perrisimo")));
		Perro p1 = (Perro) entrada.readObject();
		System.out.println(p1);
	}
	catch (Exception e) 
	{
		
	}
	}
}