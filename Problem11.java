package eulerProject;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem11 
{
	public static void main(String[] args) throws IOException
	{
		//To hold the numbers as integers
		int[][] matrix = new int[20][20];
		
		ArrayList<Long> products = new ArrayList<>();
		
		//StringTokenizer token = new StringTokenizer();
		
		File file = new File("problem11.txt");
		
		if(!file.exists())
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);
		
		//The rows of the file as strings
		ArrayList<String> list = new ArrayList<>();
		
		while(inputFile.hasNextLine())
		{
			list.add(inputFile.nextLine());
		}
		
		inputFile.close();
		
		for (int i = 0; i < 20; i++)
		{	
			StringTokenizer token = new StringTokenizer(list.get(i));
			
			for (int j = 0; j < 20; j++)
			{
				//matrix[i][j] = Integer.parseInt(Character.toString(list2.get(i)[j]));
				
				//matrix[i][j] = Scratchpad.charToInt(list2.get(i)[j]);
				
				matrix[i][j] = Integer.parseInt(token.nextToken());
			}
		}	
		
		
		long prada = 0;
		
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++)
			{
				//down
				if (i < 17)
				{
					prada = matrix[i][j] * matrix[i+1][j] * matrix[i+2][j] * matrix[i+3][j];
					products.add(prada);
				}
				
				//across
				if (j < 17)
				{
					prada = 0;
					prada = matrix[i][j] * matrix[i][j+1] * matrix[i][j+2] * matrix[i][j+3];
					products.add(prada);
				}
				
				//diagonals
				if (i < 17 && j < 17)
				{
					//top left
					prada = 0;
					prada = matrix[i][j] * matrix[i+1][j+1] * matrix[i+2][j+2] * matrix[i+3][j+3];
					products.add(prada);
				
					//bottom right
					prada = 0;
					prada = matrix[19-i][19-j] * matrix[18-i][18-j] * matrix[17-i][17-j] * matrix[16-i][16-j];
					products.add(prada);
					
					//top right
					prada = 0;
					prada = matrix[i][19-i] * matrix[i+1][18-j] * matrix[i+2][17-j] * matrix[i+3][16-j];
					products.add(prada);
					
					//bottom left
					prada = 0;
					prada = matrix[19-i][j] * matrix[18-i][j+1] * matrix[17-i][j+2] * matrix[16-i][j+3];
					products.add(prada);
				}
				
				System.out.println("(" + (i+1) + "," + (j+1) + ")");
				
			}
		
		System.out.println(Problem8.getMax(products));
	}

}
