package eulerProject;

public class Problem17 
{
	public static void main(String[] args)
	{
		/*
		 * one->3
		 * two->3
		 * three->5
		 * four->4
		 * five->4
		 * six->3
		 * seven->5
		 * eight->6
		 * nine->4
		 * ten->3
		 * eleven->6
		 * twelve->6
		 * thirteen->9
		 * fourteen->8
		 * 
		 */
		int one = 3;
		int two = 3;
		int three = 5;
		int four = 4;
		int five = 4;
		int six = 3;
		int seven = 5;
		int eight = 5;
		int nine = 4;
		int ten = 3;
		int eleven = 6;
		int twelve = 6;
		int thirteen = 8;
		int fourteen = 8;
		int fifteen = 7;
		int sixteen = 7;
		int seventeen = 9;
		int eighteen = 8;
		int nineteen = 8;
		int twenty = 6;
		int thirty = 6;
		int fourty = 6;
		int fifty = 5;
		int sixty = 5;
		int seventy = 7;
		int eighty = 6;
		int ninety = 6;
		int hundred = 7;
		int and = 3;
		
		long sum = 0;
		
		for (int a = 0; a < 10; a++)
			for(int b = 0; b < 10; b++)
				for(int c = 0; c < 10; c++)
				{	
					if(a!=0 && (b!=0 || c!=0))
						sum+=and;
					
					if (a==0)
						{
						sum+=0;
						//System.out.println("ayyy lmao");
						}
					else if (a==1)
						sum+= one + hundred;
					else if (a==2)
						sum+= two + hundred;
					else if (a==3)
						sum+= three + hundred;
					else if (a==4)
						sum+= four + hundred;
					else if (a==5)
						sum+= five + hundred;
					else if (a==6)
						sum+=six + hundred;
					else if (a==7)
						sum += seven + hundred;
					else if (a==8)
						sum+= eight + hundred;
					else if (a==9)
						sum+=nine + hundred;
					
					if (b != 1)
						{
							if(b == 0)
								sum+=0;
							else if(b==2)
								sum+=twenty;
							else if (b==3)
								sum+=thirty;
							else if(b==4)
								sum+=fourty;
							else if(b==5)
								sum+=fifty;
							else if (b==6)
								sum+=sixty;
							else if (b==7)
								sum+=seventy;
							else if (b==8)
								sum+=eighty;
							else if (b==9)
								sum+=ninety;
							
							if (c==0)
								sum+=0;
							else if (c == 1)
								sum += one;
							else if (c == 2)
								sum += two;
							else if (c==3)
								sum += three;
							else if (c==4)
								sum += four;
							else if (c==5)
								sum+=five;
							else if (c==6)
								sum+=six;
							else if (c==7)
								sum += seven;
							else if (c==8)
								sum +=eight;
							else if (c==9)
								sum += nine;
						}
						
						else if (b ==1)
						{
							if (c==0)
								sum+=ten;
							else if (c==1)
								sum+=eleven;
							else if (c==2)
								sum+=twelve;
							else if (c==3)
								sum+=thirteen;
							else if (c==4)
								sum+=fourteen;
							else if (c==5)
								sum+=fifteen;
							else if (c==6)
								sum+=sixteen;
							else if (c==7)
								sum+=seventeen;
							else if (c==8)
								sum+=eighteen;
							else if (c==9)
								sum+=nineteen;	
						}
				System.out.println(a + "" + b + "" + c + " Sum: " + sum);	
					
				}
		
		System.out.println(sum + one + 8);
		
	}

}
