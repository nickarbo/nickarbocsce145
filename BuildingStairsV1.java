/*
 * Written by Nick Arboscello
 */

package exam01;
import java.util.Scanner;

public class BuildingStairsV1 {

	public static void main(String[] args) {
		
		//Using for stairs
		int number;
		if(args == null || args.length == 0)
		{
			//Machine understands value from user
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a value to build stairs");
			number = keyboard.nextInt();
			keyboard.nextLine();
			while(number <= 0) {
				System.out.println("Invalid Input");
				number = keyboard.nextInt();
			}
		}
		
		else
		{
			//Converting the number to an integer
			number = Integer.parseInt(args[0]);
		}
	
		//Outmost loop iterates for 3 boxes
		for(int i = 0; i < 3; i++)
		{
			//Loops print a box of length and the width
			for(int j = 0; j < number; j++)
			{
				for(int k = 0; k < number; k++)
					System.out.print("*");
				
				System.out.println();
				
			}
			
			//Increment number for next iteration
			number += 1;
			
		}
		
	}

}
