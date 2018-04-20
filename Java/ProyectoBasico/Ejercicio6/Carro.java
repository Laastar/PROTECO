class Carro
{
	//Atributos del carro
	private double peso;
	private double altura;
	private boolean encendido;

	//Constructor de carro
	Carro(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
		encendido = false;
	}

	//Metodos que nos dicen el estado del carro
	public void apagar()
	{
		encendido = false;
		System.out.println("Carro apagandose");
	}

	public void encender()
	{
		encendido = true;
		System.out.println("Carro prendiendose");
	}

	public void estado()
	{
		if(encendido == true)
		{
			System.out.println("Esta encendido");
		}
		else	
		{
			System.out.println("Esta apagado");	
		}
	}

	//Getters de los atributos del carro
	public double getPeso()
	{
		return Double.valueOf(peso);
	}

	public double getAltura()
	{
		return Double.valueOf(altura);
	}

	//Metodo para imprimir un objeto junto con sus atributos
	public String toString()
	{
		apagar();
		encender();
		estado();
		return String.format("El peso es: %f kilos\nLa altura es: %f metros", peso, altura);
	}
}