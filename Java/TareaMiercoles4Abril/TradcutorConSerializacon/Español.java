import java.io.Serializable;

class Español implements Serializable
{
	String palabra;

	Español(String palabra)
	{
		this.palabra = palabra;
	}

	public String getPalabra()
	{
		return palabra;
	}
}