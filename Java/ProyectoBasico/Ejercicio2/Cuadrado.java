import java.lang.Math;

class Cuadrado
{
	//Atributos del cuadrado
	private int lado;
	private int perimetro;
	private int area;

	//Constructor del cuadrado
	Cuadrado(int lado)
	{
		this.lado = lado;
	}

	//Metodos para establecer algunos atributos del cuadrado
	public void getPerimetro()
	{
		perimetro = Math.multiplyExact(lado, 4);
		System.out.println("Perimetro es: "+perimetro);
	}

	public void getArea()
	{
		area = Math.multiplyExact(lado, lado);
		System.out.println("El area es: "+area);
	}
}