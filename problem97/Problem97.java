package eulerProject;
import java.math.BigInteger;

public class Problem97 
{
	public static void main(String[] args)
	{
		BigInteger big = BigInteger.valueOf(2);
		big = big.pow(27830457);
		big = big.multiply(BigInteger.valueOf(28433));
		big.add(BigInteger.valueOf(1));
		
		BigInteger big2 = BigInteger.valueOf(10);
		big2 = big2.pow(2357207);
		
		big = big.remainder(big2);
		
		System.out.println(big);
	}

}
