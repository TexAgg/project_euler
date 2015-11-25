package eulerProject;
import java.util.ArrayList;

public class PrimeTest //Problem 7
{
	public static void main(String[] args)
	{		
		ArrayList<Long> primes = new ArrayList<>(10001);
		
		int count = 0;
		int i = 2;
		
		while(count <= 10001)
		{
			if (isPrime(i))
			{
				primes.add((long)i);
				count++;
			}
			i++;
		}
		
		//System.out.println(primes);

		
		for(int b = 0; b < primes.size(); b++)
		{
			System.out.println(b + "___" + primes.get(b));
		}
		
	}
	
	public static boolean isPrime(long n)
	{
		boolean boole = false;
		
		ArrayList<Long> list = PrimeFactors.getPrimeFactors(n);
		//System.out.println(list.size());
		
		if(list.size() == 1)
		{
			boole = true;
		}
		
		return boole;
	}

}
