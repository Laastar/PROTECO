import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class EscrituraLecturaBytes
{
	public static void main(String[] args) 
	{
		int contador = 0;
		int[] datos = new int[80596];
		try
		{
			FileInputStream arch_lectura = new FileInputStream("/home/azurefang/Downloads/Fractal.jpg");
			boolean final_arch = false;
			while(!final_arch)
			{
				int byte_entrada = arch_lectura.read();

				if(byte_entrada == -1)
				{
					final_arch = true;
				}
				else
				{
					datos[contador] = byte_entrada;
				}
				contador++;
				//System.out.println(byte_entrada);
			}
			System.out.println(contador);
			arch_lectura.close();
		}
		catch (Exception e) 
		{
			
		}

		crea_imagen(datos);
	}

	public static void crea_imagen(int[] datos)
	{
		try
		{
			FileOutputStream nuevaImagen =  new FileOutputStream ("/home/azurefang/Downloads/FractalNUEVO.jpg");
			for (int i = 0; i < datos.length ; i++) 
			{
				nuevaImagen.write(datos[i]);
			}
			nuevaImagen.close();
		}
		catch(IOException e)
		{

		}
	}
}