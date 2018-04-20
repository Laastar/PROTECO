class Cuenta
{
	private int saldo;

	public Cuenta(int saldo)
	{
	this.saldo = saldo;
	}

	public synchronized void retirar(int cantidad) throws InterruptedException
	{
		if(saldo >= cantidad)
		{
			Thread.sleep(new java.util.Random().nextInt(500)+1000);
			saldo -= cantidad;
		}
	}

	public int getSaldo()
	{
		return saldo;
	}
}

class CuentaHabiente extends Thread
{
	private Cuenta cuenta;
	private int retiro;

	public CuentaHabiente(String name, Cuenta cuenta, int retiro)
	{
		super (name);
		this.cuenta = cuenta;
		this.retiro = retiro;
	}

	@Override
	public void run()
	{
		while(cuenta.getSaldo() > retiro)
		{
			try
			{
				cuenta.retirar(retiro);
			}
			catch (InterruptedException e) {}

			System.out.printf("%s retira %d pesos y quedan %d\n", getName(), this.retiro, cuenta.getSaldo());
		}
	}
}

public class Sincronizacion
{
	public static void main(String[] args) 
	{
		Cuenta cuenta = new Cuenta(1000);

		CuentaHabiente p1 = new CuentaHabiente("Erick", cuenta, 100);
		CuentaHabiente p2 = new CuentaHabiente("Hola", cuenta, 50);
		CuentaHabiente p3 = new CuentaHabiente("Hola2", cuenta, 200);

		p1.start();
		p2.start();
		p3.start();
	}

}