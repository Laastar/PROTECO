import java.util.Scanner;
import java.lang.Boolean;
class Pokemon
{
	private String nombre;
	private String tipo;
	private int vida;
	private int nivel;

	Pokemon(int seleccion)
	{
		if(seleccion == 1)
		{
			nombre = "Blastoise";
			tipo = "Agua";
			//ataque1 = 
		}
		else
		{
			nombre = "Charizard";
			tipo = "Fuego";
		}
		vida = 20;
		nivel = 1;
	}

	public String getName()
	{
		return nombre;
	}

	public int getVida()
	{
		return vida;
	}

	public void setVida(int vida)
	{
		this.vida = vida;
	}

	public String getTipo()
	{
		return tipo;
	}
}