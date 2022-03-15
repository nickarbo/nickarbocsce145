/*
 * Written by Nick Arboscello
 */
import java.util.Scanner;

public class AverageTemperatureV1 {

	public static void main(String[] args) {
		
		//Allows user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the above average temperature tester.");
		
		//Allows temperature to have a decimal value
		double temp[] = new double[10];
		
		//Next values will be the temperature for each day
		for(int i = 0; i < temp.length; i++) {
			System.out.println("Please enter the temperature for day "+ (i+1) +":");
			temp[i] = keyboard.nextDouble();
		}
		//Adding all temperatures together
		double sumTemp = 0;
		
		for(int i = 0; i < temp.length; i++) {
			sumTemp = sumTemp + temp[i];
		}
		//Getting the average temperature by dividing the sum temperature by number of days
		double averageTemp = sumTemp/temp.length;
		
		System.out.println("The average temperature was " +averageTemp);
		System.out.println("The days above average were:");
		
		for(int i = 0; i < temp.length; i++) {
			if(averageTemp < temp[i]) {
				System.out.println("Day "+ (i+1) +" with " +temp[i]);
			}
		}
	}

}
