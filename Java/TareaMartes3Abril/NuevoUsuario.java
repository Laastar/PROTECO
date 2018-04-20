import java.util.Scanner;
import java.io.Serializable;

class NuevoUsuario implements Serializable
{
	String usuario;
	String pass;
	String nombre;
	double altura;
	int edad;

	NuevoUsuario(String nombre, String usuario, String pass, double altura, int edad)
	{
		this.nombre = nombre;
		this.usuario = usuario;
		this.pass = pass;
		this.altura = altura;
		this.edad = edad;
	}

	public String getPass()
	{
		return pass;
	}

	@Override
	public String toString()
	{
		return "Que bueno tenerte de vuelta " + nombre + ", usuario = " + usuario + ", pass = " + pass + ",	edad = " + edad + ", altura = " + altura + "}";
	}
}