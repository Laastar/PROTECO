import java.lang.Math;

class Circulo
{
	//Se delcara pi como constante porque pi es un numero que no cambia
	final static double PI = 3.1415;

	//Atributos del criculo
	private int radio;
	private double perimetro;
	private double area;
	private double diametro;

	//Constructor del circulo
	Circulo(int radio)
	{
		this.radio = radio;
	}

	//Metodos para establecer algunos atributos del circulo
	public void getPerimetro()
	{
		diametro = 1.0*(Math.multiplyExact(radio, 2));
		perimetro  = PI * (double)diametro;
		System.out.println("El perimetro es: "+perimetro);
	}

	public void getArea()
	{
		area = PI * 1.0 *Math.multiplyExact(radio, radio);
		System.out.println("El area es: "+area);
	}
}