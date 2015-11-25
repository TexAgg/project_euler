package eulerProject;
import java.math.BigInteger;

public class Problem25 
{
	public static void main(String[] args)
	{
		int count = 1;
		do
		{
			System.out.println(count + "___ val: " + madness(fib(count)));
			count++;
		}
		while(madness(fib(count))<1);
	}
	
	public static BigInteger fib(int n)
	{
		BigInteger fib1, fib2;
		
		fib1 = BigInteger.valueOf(1);
		fib2 = BigInteger.valueOf(2);
		
		if (n==1)
			return fib1;
		else if (n==2)
			return fib2;
		else
				return fib(n-1).add(fib(n-2));
	}
	
	public static int madness(BigInteger fat)
	{
		BigInteger thin;
		BigInteger k = BigInteger.valueOf(10);
		int val;
		
		k = k.pow(999);
		
		thin = fat.divide(k);
		
		val = thin.intValue();
		
		return val;
	}

}
