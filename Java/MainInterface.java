public class MainInterface
{
	public static void main(String[] args) 
	{
		ControlRemoto control = new ControlRemoto(new Foco(), new Bomba(), new Foco(), new Bomba());
		control.oprimirBoton1();
		control.oprimirBoton2();
		control.oprimirBoton3();
		control.oprimirBoton4();
	}
}