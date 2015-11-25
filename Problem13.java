package eulerProject;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem13 
{
	public static void main(String[] args) throws IOException
	{
		
		File file = new File("problem13.txt");
		
		if(!file.exists())
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);
		
		/*
		 * Contains each line as a string
		 */
		ArrayList<String> list = new ArrayList<>(20);
		
		while(inputFile.hasNextLine())
		{
			list.add(inputFile.nextLine());
		}
		
		inputFile.close();
		
		/*
		 * Contains each line as a char array
		 */
		ArrayList<char[]> list2 = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			list2.add(list.get(i).toCharArray());
		}
		
		ArrayList<Long> list3 = new ArrayList<>(13);
		
		for (int i = 0; i < list2.size(); i++)
		{
			//Get the first 13 digits as an array 
			int[] array = new int[list2.get(i).length];
			long gig = 0;
			
			for(int j = 0; j < array.length; j++)
			{
				array[j] = Integer.parseInt(Character.toString(list2.get(i)[j]));
				
				System.out.println(array[j]);
				
				gig += array[j] * Math.pow(10, 13-j);
				
				//System.out.println(gig);
			}
			System.out.println(gig);
			
			list3.add(gig);
		}
		
		long sum = 0;
		
		for(int i = 0; i < list3.size(); i++)
		{
			sum += list3.get(i);
		}
		
		System.out.println(sum);
	}

}
