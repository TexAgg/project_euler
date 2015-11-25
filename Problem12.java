package eulerProject;
import java.util.ArrayList;

/*
 * Really fucking slow
 */

public class Problem12 
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		
		//System.out.println(nT(2));
		
		int k = 0;
		
		
		do
		{
			long a = nT(k); 
			list.add(getFactors(a));
			
			System.out.println("N: " + k + "____T(n): " + nT(k) + 
					"____factors: " + list.get(k).size());
			
			k++;
		}
		while(list.get(k-1).size() < 500);
		
		
	}
	
	public static ArrayList<Long> getFactors(long n)
	{
		ArrayList<Long> fac = new ArrayList<>();
		
		for (long i = 1; i <= n; i++)
		{
			if(n%i == 0)
				fac.add(i);
		}
		
		return fac;
	}
	
	//The nth triangular number
	public static long nT(long n)
	{
		return (n + 1) * n * 1/2;
	}

}
