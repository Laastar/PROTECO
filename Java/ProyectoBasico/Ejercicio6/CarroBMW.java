class CarroBMW extends Carro
{
	//Se declara una variable particular
	private String modelo;

	//Constructor de la subclase
	CarroBMW(double peso, double altura)
	{
		super(peso, altura);
		modelo = "BMW";
	}

	//Metodo particular de la subclase
	public void activarTurbo()
	{
		System.out.println("Activando turbo...");
	}

	//Metodo que nos dice los atributos y el estado del objeto de la subclase
	public String toString()
	{
		apagar();
		encender();
		estado();
		System.out.println("Tengo Turbo");
		activarTurbo();
		return String.format("El peso es: %f kilos\nLa altura es: %f metros\nEl modelo es: %s", getPeso(), getAltura(), modelo);
	}
}