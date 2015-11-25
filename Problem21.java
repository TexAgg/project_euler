package eulerProject;
import java.util.ArrayList;

public class Problem21 
{
	public static void main (String[] args)
	{	
		ArrayList<Integer> amicable = new ArrayList<>();
		
		for(int a = 2; a < 10000; a++)
			for(int b = a; b < 10000; b++)
			{
				int x, y;
				
				x = sumElements(getProperFactors(a));
				
				y = sumElements(getProperFactors(b));
				
				if (x==b && y==a && a!=b)
				{
					amicable.add(a);
					amicable.add(b);
					
					System.out.println(a + ", " + b);
				}
			}
		
		System.out.println(sumElements(amicable));
	}
	
	public static ArrayList<Integer> getProperFactors(int n)
	{
		ArrayList<Integer> fac = new ArrayList<>();
		
		for (int i = 1; i < n; i++)
		{
			if(n%i == 0)
				fac.add(i);
		}
		
		return fac;
	}
	
	public static int sumElements(ArrayList<Integer> array)
	{
		int sum = 0;
		
		for(int i = 0; i < array.size(); i++)
		{
			sum += array.get(i);
		}
		
		return sum;
	}

}
