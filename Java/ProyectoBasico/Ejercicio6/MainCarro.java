public class MainCarro
{
	public static void main(String[] args) 
	{
		//Se declaran multiples carros de diferentes modelos
		Carro c1 = new CarroBMW(15.6, 17.0);
		System.out.println(c1);
		System.out.println("");
		Carro c2 = new CarroVW(15.6, 17.0);
		System.out.println(c2);
		System.out.println("");
		Carro c3 = new Carro(15.6, 17.0);
		System.out.println(c3);
	}	
}