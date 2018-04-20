class Rectangulo
{
	private double base;
	private double altura;

	Rectangulo(){
	}

	Rectangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}

	public double getBase()
	{
		return base;
	}

	public double getAltura()
	{
		return altura;
	}

	public void setBase(double base)
	{
		this.base = base;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public Rectangulo agrandar(int x, Rectangulo rect)
	{
		Rectangulo rect2 = new Rectangulo(0,0);
		double h = rect.getAltura();
		double b = rect.getBase();
		rect2.setBase(b * x);
		rect2.setAltura(h *x);
		return rect2;
	}
}
