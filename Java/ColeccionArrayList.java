import java.util.ArrayList;

public class ColeccionArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> elementia = new ArrayList<String>();
		elementia.add("rojo");
		elementia.add(0, "black");
		for (int i = 0; i < elementia.size(); i++) 
		{
			System.out.printf("%s\n", elementia.get(i));
		}
		elementia.remove("rojo");
		System.out.println("");
		for (int i = 0; i < elementia.size(); i++) 
		{
			System.out.printf("%s\n", elementia.get(i));
		}
		elementia.get(5);
	}
}