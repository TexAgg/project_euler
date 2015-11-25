package eulerProject;
import java.util.ArrayList;

public class Problem14 
{
	public static void main(String[] args)
	{
		//System.out.println(collatz(13));
		
		//Contains the size of each chain
		ArrayList<ArrayList<Integer>> collect = new ArrayList<>();
		ArrayList<Integer> sizes = new ArrayList<>();
		
		/*
		for(int i = 0; i < 1000000; i++)
		{
			collect.add(1);
		}
		*/
		
		collect.add(collatz(0));
		collect.add(collatz(1));
		
		for(int i = 0; i < 999999; i++)
		{	
			if (!hyperBelong(i, i, collect))
			{
				collect.add(collatz(i));
				
				sizes.add(collatz(i).size());
			}
			
			//collect.set(i, collatz(i).size());
			
			System.out.println(i + ": " + collect.get(i));
		}
		
		System.out.println(getMaxPlace(sizes));
	}
	
	public static ArrayList<Integer> collatz(int n)
	{
		ArrayList<Integer> chain = new ArrayList<>();
		
		chain.add(n);
		
		do 
		{
			if (n == 0)
				n = 0;
			else if (n%2 == 0)
				n = n/2;
			else
				n = 3 * n + 1;
			
			chain.add(n);
		}
		while(n != 1);
		
		return chain;
	}
	
	public static boolean belongs(int n, ArrayList<Integer> list)
	{
		boolean flag = false;
		int i = 0;
		
		while (i < list.size() && !flag)
		{
			if(list.get(i) == n)
				flag = true;
			i++;
		}
		
		return flag;
	}
	
	public static boolean hyperBelong(int n, int count, ArrayList<ArrayList<Integer>> list)
	{
		boolean flag = false;
		int i = 0;
		
		while (i < count && !flag)
		{
			if (belongs(n, list.get(i)))
				flag = true;
			i++;
		}
		
		return flag;
	}
	
	public static int getMaxPlace(ArrayList<Integer> object)
	{
		int max = object.get(0);
		int place = 0;
		
		for(int i = 1; i < object.size(); i++)
		{
			if(object.get(i) >= max)
			{
				max = object.get(i);
				place = i;
			}
		}
		
		return place;
	}

}
