package eulerProject;

import java.math.BigInteger;

public class Problem16 
{
	public static void main(String[] args)
	{
		//The sum
				BigInteger result =  BigInteger.valueOf(0);
				
				BigInteger big = BigInteger.valueOf(2);
				
				//2^1000
				big = big.pow(1000);
				
				//BigInteger representation of 0
				BigInteger cero = BigInteger.valueOf(0);
				
				//BigInteger representation of 10
				BigInteger ben = BigInteger.valueOf(10);
				
				//System.out.println(big);
				
				while (big.compareTo(cero) >0)
				{
					result = result.add(big.mod(ben));
					big = big.divide(ben);
					
					//System.out.println(result);
				}
				
				System.out.println(result);
	}

}
