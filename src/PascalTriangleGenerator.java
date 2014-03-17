import java.math.BigInteger;
public class PascalTriangleGenerator {
	
	
	public BigInteger factorial(BigInteger i)
	{
		if(i.equals(BigInteger.ZERO))
			return BigInteger.ONE; 
		else 
			return factorial(i.subtract(BigInteger.ONE)).multiply(i);	
	}
	
	public BigInteger binomialCoefficient(BigInteger n, BigInteger k) throws Exception 
	{
		BigInteger nFact = factorial(n); 
		BigInteger kFact = factorial(k); 
		BigInteger y = n.subtract(k); 
		BigInteger factNMinusK = factorial(y); 
		BigInteger demon = kFact.multiply(factNMinusK);
		return nFact.divide(demon); 
	}
	//lksajf
	public String generatePascalTriagle(int x) throws Exception
	{
		String result = ""; 
		for(int i = 0; i <= x; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				result = result+ binomialCoefficient(new BigInteger(i+""), new BigInteger(j+""))+ "<";			
			}
			result = result+ "\n"; 
		}
		return  result; 
	}
}
