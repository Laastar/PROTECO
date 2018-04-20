public class MainControl
{
	public static void main(String[] args) 
	{
		//Se crean una unidad general y una avanzada
		BarracksUnit unidadbase = new BarracksUnit();
		FieldCommander unidadavanzada = new FieldCommander();

		//Se llama al mismo metodo de las unidades pero usando polimorfismo
		//Los metodos realizas diferentes acciones
		unidadbase.formacion();
		unidadavanzada.formacion();
	}
}