package eulerProject;
import java.math.BigInteger;

public class Scratchpad
{
	public static void main(String[] args)
	{
		//System.out.println(Problem14.collatz(13));
		
		
		
	}
	
	public static int digitSum(int n)
	{
		double index = Math.log10(n);
		int sum = 0;
		
		for(int i = 0; i < index; i++)
		{
			sum += Math.pow(10, -i) * (n % Math.pow(10, i + 1) - n % Math.pow(10, i));
		}
		
		return sum;
	}
	
	public static int charToInt(char c)
	{
		int n = Integer.parseInt(Character.toString(c));
		
		return n;
	}
	
	public static BigInteger gamma(BigInteger b)
	{
		BigInteger big;
		if(b.compareTo(BigInteger.valueOf(0))==0)
			big = BigInteger.valueOf(1);
		
		else
			big = b.multiply(gamma(b.subtract(BigInteger.valueOf(1))));
		
		return big;
	}

}
