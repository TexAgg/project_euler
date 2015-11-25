package eulerProject;

public class SmallestMultiple //Problem 5
{
	public static void main(String[] args)
	{
		boolean flag = false;
		int i = 20;
		
		
		do
		{
			flag = isDivisible(i);
			System.out.println(i);
			i += 20;
		}
		while(!flag);
		
		
		//System.out.println(isDivisible(2520));
	}
	
	public static boolean isDivisible(int n)
	{
		boolean flag = true;
		int count = 1;
		
		while (flag && count <= 20)
		{
			if (n%count != 0 )
				flag = false;
			count++;
		}
		
		return flag;
	}

}
