public class Figuras
{
	public static void main(String[] args) 
	{
		//Se crean dos figuras con determinados atributos
		Circulo criculo1 = new Circulo(4);
		Cuadrado cuadrado1 = new Cuadrado(5);

		//Se hace uso de los metodos de las figuras para conocer su are y perimetro
		criculo1.getPerimetro();
		criculo1.getArea();
		cuadrado1.getPerimetro();
		cuadrado1.getArea();
	}
}