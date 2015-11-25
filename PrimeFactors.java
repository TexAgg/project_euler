package eulerProject;
import java.util.ArrayList;

public class PrimeFactors //Problem 3
{
	public static void main(String[] args)
	{
		//A capital L must be added to the end of a long
		long n = 600851475143L;
		
		System.out.println(getPrimeFactors(n));
	}

	public static ArrayList<Long> getPrimeFactors(long n)
	{
		ArrayList<Long> list = new ArrayList<>();
		
		while (n % 2 == 0)
		{
			list.add((long)2);
			n = n / 2;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i = i + 2)
		{
			while (n % i == 0)
			{
				list.add((long)i);
				n = n / i;
			}
		}
		
		if (n > 2)
			list.add((long)n);
		
		return list;
	}
}
