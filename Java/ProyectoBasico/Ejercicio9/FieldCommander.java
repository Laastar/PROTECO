/**
*@author LaastarMach
*@version 1.0
*@since 1997
*/

class FieldCommander extends BarracksUnit
{
	/**
	* Variable escudo que denomina que la unidad Comandante de Campo posee un escudo
	*/
	private double shield;

	/**
	*Declaracion del constructor
	*<p>
	*Se declara la unidad con ayuda del constructor del padre
	*Se le da un escudo base
	*/
	FieldCommander()
	{
		super();
		shield = 150;
	}

	/**
	*Regresa el valor del escudo
	*
	*@return Valor actual del escudo
	*/
	public double getShield()
	{
		return shield;
	}

	/**
	*Debido que son unidades avanzadas poseen una formacion de defensa mas poderosa
	*Nos dice que formacio se adoptó
	*/
	@Override
	public void formacion()
	{
		System.out.println("Formacion Diamante adoptada");
	}
}