import java.util.Scanner;

class SeleccionUnidad
{
	public static void selectUnit(int eleccion, String nombre)
	{
		//Se hace la eleccion de si mandar al usuario a la seleccion de la nunidad general o avanzada
		switch(eleccion)
		{
			case 1:
				UnidadGeneral.selectGeneral(nombre);
				break;
			case 2:
				UnidadAvanzada.selectAdvanced(nombre);
				break;
		}
	}
}