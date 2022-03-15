/*
 * Written by Nick Arboscello
 */

import java.util.Scanner;
import java.util.Random;

public class D6RollV1 {

	public static void main(String[] args) {
		
		//Allowing machine to take user input, as well as declaring a random variable
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		//Declaring each number on the dice
		int n, num, ones, twos, threes, fours, fives, sixes;
		ones = twos = threes = fours = fives = sixes = 0;
		
		System.out.println("Enter the number of times a 6 sided die should be rolled");
		
		n = keyboard.nextInt();
		for(int i = 0; i < n; i++)
		
		{
			num = generator.nextInt(6)+1;
			
			//Printing each time it is rolled
			System.out.println(num+" was rolled");
		
			//Allowing machine to track each number rolled
			if(num == 1)
				ones++;
			else if(num == 2)
				twos++;
			else if(num == 3)
				threes++;
			else if(num == 4)
				fours++;
			else if(num == 5)
				fives++;
			else 
				sixes++;
			
		}
		
		//Printing each number of dice rolled
		System.out.println("One:"+ones);
		System.out.println("Two:"+twos);
		System.out.println("Three:"+threes);
		System.out.println("Four:"+fours);
		System.out.println("Five:"+fives);
		System.out.println("Six:"+sixes);
		
	}

}
