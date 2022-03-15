
/*
 * Written by Nick Arboscello
 */
import java.util.Scanner;

class DateAndTimeTester {
	
	public void run()
	{
		Scanner keyboard = new Scanner(System.in);
		String inp = "";
		
		while(inp.equals("quit")== false)
		{
			System.out.println("Enter a date and time MM/DD hh:mm and I will determine if it is valid.");
			inp = keyboard.nextLine();
			
			//Print if valid or not
			DateAndTimeTester dtTester = new DateAndTimeTester();
			if(dtTester.isValid(inp)) {
				System.out.println("The date and time is valid!");
			}
			else {
				System.out.println("The date and time is not valid");
			}
			System.out.println("Would you like to continue or exit? Press enter to continue");
			inp = keyboard.nextLine();
		}
	}
	
	public boolean isValid(String dateTime)
	{
		String[] split = getSplit(dateTime,"");
		if(split == null) {
			return false;
		}
		else {
			return isValidDate(split[0]) && isValidTime(split[1]);
		}
	}
	
	public boolean isValidDate(String date)
	{
		//Validate getMonth and getDate methods
		int month = getMonth(date);
		int day = getDate(date);
		if(month == -1 || day == -1 || (month == 2 && day > 28)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isValidTime(String time)
	{
		//Validate getHour and getMinute methods
		int hour = getHour(time);
		int minute = getMinute(time);
		if(hour == -1 || minute == -1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int getMonth(String month)
	{
		//Split from the getSplit() function
		String[] split = getSplit(month, "/");
		
		if(split == null) {
			return -1;
		}
		else {
			month = split[0];
			if(month.length() <= 1 || month.length() > 2) {
				return -1;
			}
			try {
				int months = Integer.parseInt(month);
				//Check if month is valid
				if(months > 12 || months <=0) {
					return -1;
				}
			return months;
				}
			catch(Exception e) {
				return -1;
			}
		}
	}
	
	public int getDate(String day)
	{
		String[] split = getSplit(day, "/");
		
		if(split == null) {
			return -1;
		}
		else {
			day = split[1];
			
			if(day.length() <=1 || day.length() > 2) {
				return -1;
			}
			try {
				int days = Integer.parseInt(day);
				//Check if day is valid
				if(days > 31 || days <= 0) {
					return -1;
				}
				return days;
			}
			catch(Exception e) {
				return -1;
			}
		}
	}
	
	public int getHour(String hour)
	{
		String[] split = getSplit(hour, ":");
		
		if(split == null) {
			return -1;
		}
		else {
			hour = split[0];
			
			if(hour.length() < 1 || hour.length() > 2) {
				return -1;
			}
			try {
				int hours = Integer.parseInt(hour);
				//Check if hour is valid
				if(hours > 12 || hours <= 0) {
					return -1;
				}
				return hours;
			}
			catch(Exception e) {
				return -1;
			}
		}
	}
	
	public int getMinute(String min)
	{
		String[] split = getSplit(min, ":");
		
		if(split == null) {
			return -1;
		}
		else {
			min = split[1];
			
			if(min.length() <= 1 || min.length() > 2) {
				return -1;
			}
			try {
				int minute = Integer.parseInt(min);
				//Check is minute is valid
				if(minute > 59 || minute < 0) {
					return -1;
				}
				return minute;
			}
			catch(Exception e) {
				return -1;
			}
		}
	}
	
	public String[] getSplit(String str, String splitAt)
	{
		String[] split = str.split(splitAt);
		if(split.length == 2) {
			return split;
		}
		else {
			return null;
		}
	}
	}
