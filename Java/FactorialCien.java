import java.math.BigInteger;

public class FactorialCien
{
	public static void main(String[] args) 
	{
		BigInteger fact = FuncionFact.factorial(100);
		System.out.println("Factorial de 100 es: " + fact);
	}
}

class FuncionFact
{
	public static BigInteger factorial(long n)
	{
		BigInteger resultado = BigInteger.ONE;
		for(long i = 2; i <= n; i++) 
		{
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
		return resultado;
	}
}