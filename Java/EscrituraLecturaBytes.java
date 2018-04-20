import java.io.IOException;
import java.io.FileInputStream;

public class EscrituraLecturaBytes
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream arch_lectura = new FileInputStream("/home/azurefang/Downloads/Fractals.jpg")
			boolean final_arch = false;
			while(!final_arch)
			{
				int byte_entrada = arch_lectura.read();

				if(byte_entrada == -1)
				{
					final_arch = true;
				}
			}
		}
		catch (Exception e) 
		{
			
		}
	}
}