/*
 * Written by Nick Arboscello
 */
package exam01;
import java.util.Scanner; 

public class DoublesArrayV1 {

	public static void main(String[] args) {
		//Declaring variables
		int size, count = 0;
		double sum = 0, average = 0.0;
		Scanner keyboard = new Scanner(System.in);
		//Asking user for size
		System.out.println("Enter the size of your array");
		size = keyboard.nextInt();
		
		//Checking if size is positive
		if(size > 0)
		{
			double []array = new double[size];
			System.out.println("Enter the values for your array one by one.");
			
			for(int i = 0; i < size; i++)
			{
				//Adding only positive values
				array[i] = keyboard.nextDouble();
			}
			
			for(int i = 0; i < size; i++)
			{
				if(array[i] > 0)
				{
					//Adding values and counting number of times
					sum = sum + array[i];
					count = count + 1;
				}
			}
			
			//Checking sum
			if(sum > 0)
			{
				average = sum/count;
			}
			
			//Print to user
			System.out.println("Average: " +average);
			
		}
		
		else {
			System.out.println("Invalid size for array");
			System.exit(0);
		}
		
		
		}
	
		
	}


