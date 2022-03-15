/*
 * Written by Nick Arboscello
 */

import java.util.Scanner;

public class MatrixSubtractionV1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Take user input of rows and columns in matrix(a)
		System.out.println("Enter number of rows in the first matrix(a) :");
		int m = keyboard.nextInt();
		System.out.println("Enter number of columns in the first matrix(a) :");
		int n = keyboard.nextInt();
		
		//Declaring matrix(a)
		int a[][] = new int[m][n];
		
		//Take user input of rows and columns in matrix(b)
		System.out.println("Enter number of rows in the second matrix(b) :");
		int p = keyboard.nextInt();
		System.out.println("Enter number of columns in the second matrix(b) :");
		int q = keyboard.nextInt();
		
		//Declaring matrix(b)
		int b[][] = new int[p][q];
		
		//Declaring matrix(c)
		int c[][] = new int[p][q];
		
		System.out.print("Enter the elements in the first matrix(a) :");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = keyboard.nextInt();
			}
		}

		System.out.println("Enter the elements in the second matrix(b) :");
		for(int i = 0; i < p; i++)
		{
			for(int j = 0; j < q; j++)
			{
				b[i][j] = keyboard.nextInt();
			}
		}
		
		//If rows and columns of matrix(a) and matrix(b) are equal then create matrix(c)
		if(m == p && n == q)
		{
			for(int i = 0; i < p; i++)
			{
				for(int j = 0; j < q; j++)
				{
					c[i][j] = a[i][j] - b[i][j];
				}
			}
		}
		
		//If rows and columns aren't equal then print error 
		else
		{
			System.out.println("Error. Dimensions of two matrix must be the same.");
			System.exit(0);
		}
		
		//Print the output
		System.out.println("Elements of first matrix(a) :");
		for(int i =0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("Elements of second matrix(b) :");
		for(int i = 0; i < p; i++)
		{
			for(int j = 0; j < q; j++)
			{
				System.out.print(b[i][j]+"\t");			
			}
			System.out.println("\n");
		}
		
		System.out.println("Elements of third matrix(c) :");
		for(int i = 0; i < p; i++)
		{
			for(int j = 0; j < q; j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}

}
