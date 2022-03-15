/*
 * Written by Nick Arboscello
 */
import java.util.Scanner;
public class ValidDateV1 {

	public static void main(String[] args) {
		
		
		int month,day,year;
		int daysInMonth = 0;
		
		//True if input from user is valid
		boolean monthValid, yearValid, dayValid;
		boolean leapYear;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date in the format month/date/year.");
		String line = keyboard.nextLine();
		
		//Split the date into month,day, and year using split
		String[] items = line.split("/");
		
		//Define Arguements
		month = Integer.parseInt(items[0]);
		day = Integer.parseInt(items[1]);
		year = Integer.parseInt(items[2]);
		
		//Checking if the month and year is valid
		monthValid = (month >= 1 && month <= 12);
		yearValid = (year >= 1492 && year <= 2400);
		leapYear = ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0));
		
		//Assigning number of days to each month
		if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10|| month == 12)
			daysInMonth = 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			daysInMonth = 30;
		if (month == 2)
		{
			if (leapYear)
				daysInMonth = 29;
			else
				daysInMonth = 28;
		}
			
		//Checking if date is valid
		dayValid = (1 <= day);
		dayValid = (day <= daysInMonth);
		
		if (dayValid == true)
		{
			if (monthValid == true)
			{
				if (yearValid == true)
				{
					System.out.println("\nDate is valid!");
				}
				else
				{
					System.out.println("\nYear is invalid!");
				}
			}
			else
			{
				System.out.println("\nMonth is invalid!");
			}
		}
		else 
		{
			System.out.println("\nDate is invalid!");
		}
		
		
	
		
	}
	

}
