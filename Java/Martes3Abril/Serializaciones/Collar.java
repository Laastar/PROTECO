import java.io.Serializable;

class Collar implements Serializable
{
	String placa;

	public Collar(String placa)
	{
		this.placa = placa;
	}

	public String getPlaca()
	{
		return placa;
	}

	public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	@Override
	public String toString()
	{
		return "Collar{ placa = " + placa + "}";
	}
}