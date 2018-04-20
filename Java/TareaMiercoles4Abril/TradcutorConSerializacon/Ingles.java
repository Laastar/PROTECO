import java.io.Serializable;

class Ingles implements Serializable
{
	String palabra;

	Ingles(String palabra)
	{
		this.palabra = palabra;
	}

	public String getPalabra()
	{
		return palabra;
	}
}