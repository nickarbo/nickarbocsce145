/*
 * Written by Nick Arboscello
 */
package exam01;
import java.util.Scanner;

public class EvenOddV1 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	//Size of array
	int n;
	System.out.println("Enter the size of your array");
	n = keyboard.nextInt();
	
	if(n <= 0)
	{
		System.out.println("Invalid array size");
		System.exit(0);
	}
		//Create array of integers of that size
		int array[] = new int[n];
		System.out.println("Enter the values of your array");
		
		for(int i = 0; i < n; i++)
			array[i] = keyboard.nextInt();
		
		//Find Minimum values
		int minEven = 9999;
		int minOdd = 9999;
		
		//Loop to sort odds and evens
		for(int i = 0; i < n; i++)
		{
			if(array[i] % 2 == 0)
			{
				if(minEven > array[i])
					minEven = array[i];
			}
			
			else {
				if(minOdd > array[i])
					minOdd = array[i];
			}
			
		}
		
		//Print results
		if(minEven == 9999)
			System.out.println("\nNo Even Values");
		else
			System.out.println("\nMinimum Even: " +minEven);
		if(minOdd == 9999)
			System.out.println("\nNo Odd Values");
		else 
			System.out.println("Minimum Odd: " +minOdd);
	}

}
