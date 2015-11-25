package eulerProject;
import java.util.ArrayList;

public class Problem4 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int a = 0; a < 10; a++)
		{
			for(int b = 0; b < 10; b++)
			{
				for(int c = 0; c < 10; c++)
				{
					for(int d = 0; d < 10; d++)
					{
						for(int e = 0; e < 10; e++)
						{
							for(int f = 0; f < 10; f++)
							{
								int product = (100 * a + 10*b + c) * (100*d + 10*e + f);
								if (isPalindrome(product))
									list.add(product);
							}
						}
					}
				}
			}	
		}
		
		//System.out.println(list);
		System.out.print(getMax(list));
	}
	
	public static boolean isPalindrome(int p)
	{
		char[] c = Integer.toString(p).toCharArray();
		boolean flag = true;
		
		int i = 0;
		while(flag && i < c.length)
		{
			if(c[i] != c[c.length - 1 - i])
				flag = false;
			
			i++;
		}
		
		return flag;
	}
	
	public static int getMax(ArrayList<Integer> object)
	{
		int max = object.get(0);
		
		for(int i = 1; i < object.size(); i++)
		{
			if(object.get(i) >= max)
				max = object.get(i);
		}
		
		return max;
	}

}
