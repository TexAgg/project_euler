package eulerProject;

public class Problem9 
{
	public static void main(String[] args)
	{
		boolean flag = false;
		
		
		for(int a = 1; a <= 990; a++)
			for(int b = 1; b <= 990; b++)				
				for(int c = 1; c <= 990; c++)
				{
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000)
						System.out.println(a *b*c);
				}
	
	}

}
