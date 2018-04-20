class LimpiarPantalla
{
	public static void limpiezaPorfavor()
	{
		//Imprime espacios en la pantalla
		for (int i = 0; i < 15; i++) 
		{
			System.out.println("\f");
		}
	}
}