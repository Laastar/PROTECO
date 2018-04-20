import java.lang.reflect.Field;

public class Alv
{
	public static void main(String[] args) throws Exception
	{	
		//Tres objetos: HolaXD, adios, HolaXD adios
		//Strings son inmutables, no puedes cambiar su contenido
		String s1 = "HolaXD";
		String s2 = "HolaXD";
		Field f = String.class.getDeclaredField("value");
		f.setAccessible(true);
		f.set(s1, "ppcdsalvc".toCharArray());

		//s1 = s1 + " adios";
		System.out.println(s2);
		System.out.println(s1);
	}
}