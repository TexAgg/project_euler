package eulerProject;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("1000digitnum.txt");
		
		if(!file.exists())
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);
		
		//ArrayList 1
		ArrayList<String> list = new ArrayList<>(20);
		
		while(inputFile.hasNextLine())
		{
			list.add(inputFile.nextLine());
		}
		
		//ArrayList 2
		ArrayList<char[]> list2 = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			list2.add(list.get(i).toCharArray());
		}
		
		/*
		for(int i = 0; i < list2.get(0).length; i++)
			System.out.println(list2.get(0)[i]);
		*/
		
		//ArrayList3
		ArrayList<Character> list3 = new ArrayList<>(1000);
		
		for(int a = 0; a < list2.size(); a++)
			for(int b = 0; b < list2.get(a).length; b++)
			{
				list3.add(list2.get(a)[b]);
			}
		
		//System.out.println(list3);
		
		//ArrayList 4
		ArrayList<Integer> list4 = new ArrayList<>(1000);
		
		for(int i = 0; i < list3.size(); i++)
		{
			list4.add(Integer.parseInt(Character.toString(list3.get(i))));
		}
		
		//System.out.println(list4);
		
		//System.out.println(list.size() + "\n" + list);
		//System.out.println(list2.size() + "\n" + list2);
		
		ArrayList<Long> list5 = new ArrayList<>();
		
		for(int i = 0; i < 988; i++)
		{
			list5.add((long)list4.get(i) * list4.get(i + 1) * list4.get(i + 2) * list4.get(i + 3) * list4.get(i +4) * 
					list4.get(i + 5) * list4.get(i + 6) * list4.get(i + 7) *
					list4.get(i + 8) * list4.get(i + 9) * list4.get(i + 10) * list4.get(i + 11) * list4.get(i+12));
		}
		
		System.out.println(getMax(list5));
		
	}
	
	public static long getMax(ArrayList<Long> object)
	{
		long max = object.get(0);
		
		for(int i = 1; i < object.size(); i++)
		{
			if(object.get(i) >= max)
				max = object.get(i);
		}
		
		return max;
	}

}
