class CarroVW extends Carro
{
	//Se declara una variable particular
	private String modelo;

	//Constructor de la subclase
	CarroVW(double peso, double altura)
	{
		super(peso, altura);
		modelo = "VW";
	}

	//Metodo particular de la subclase
	public void activarFlow()
	{
		System.out.println("Activando el ñengo Flow...");
	}

	//Metodo que nos dice los atributos y el estado del objeto de la subclase
	public String toString()
	{
		apagar();
		encender();
		estado();
		System.out.println("Tengo Flow!!");
		activarFlow();
		return String.format("El peso es: %f kilos\nLa altura es: %f metros\nEl modelo es: %s", getPeso(), getAltura(), modelo);
	}
}