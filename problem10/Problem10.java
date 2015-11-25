package eulerProject;
import java.util.ArrayList;

public class Problem10 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>(); 
		
		int i = 2;
		
		for(int k = 0; k < 2000000; k++)
		{
			if(PrimeTest.isPrime(i))
				list.add(i);
			i++;
		}
		
		System.out.println(listSum(list));
	}
	
	public static long listSum(ArrayList<Integer> object)
	{
		long sum = 0;
		
		for(int i = 0; i < object.size(); i++)
		{
			sum += object.get(i);
		}
		
		return sum;
		
	}

}
