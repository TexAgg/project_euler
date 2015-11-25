package eulerProject;

public class EvenFibonacci //Problem 2
{

	public static void main(String[] args)
	{
		long count = 0;
		long sum = 0;
		
		while (fib(count) <= 4000000)
		{
			if (fib(count) % 2 == 0)
				sum += fib(count);
			
			count++;
		}
		
		System.out.println(sum);
	}
	
	public static long fib(long n)
	{
		int fib1 = 1;
		int fib2 = 2;
		
		if (n == 0)
			return (long)0;
		else if (n == 1)
			return (long)fib1;
		else if (n == 2)
			return (long)fib2;
		else 
			return fib(n - 1) + fib(n - 2);
	}
	
}
