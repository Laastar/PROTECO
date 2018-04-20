import java.io.File;
import java.util.Date;

public class UsoFile
{

	File f;

	public UsoFile(String ruta)
	{
		f = new File(ruta);

		if (f.exists()) 
		{
			System.out.println("\nNombre archivo: " + f.getName());
			System.out.println("\nTamano: " + f.length());
			System.out.println("\nRuta absoluta: " + f.getAbsolutePath());
			System.out.println("\nPuede leerse: " + f.canRead());
			System.out.println("\nPuede editarse: " + f.canWrite());
			System.out.println("\nEs archivo: " + f.isFile());
			System.out.println("\nModificado por ultima vez: " + new Date(f.lastModified()));
			System.out.println("\nEs directorio: " + f.isDirectory());
			if(f.isDirectory())
			{
				System.out.println("\nContenido de la carpeta: ");
				System.out.println("---------------------------");
				String[] list = f.list();
				for (String archivo : list) 
				{
					System.out.println("->" + archivo);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		UsoFile archivo = new UsoFile("/home/azurefang/java/Lunes2Abril/PruebaLectura");
		UsoFile archivo2 = new UsoFile("/home/azurefang/java/Lunes2Abril/");
	}
}