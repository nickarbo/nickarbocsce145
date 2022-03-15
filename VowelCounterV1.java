/*
 * Written by Nick Arboscello
 */
import java.util.Scanner;

public class VowelCounterV1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Taking user input from phrase
		System.out.println("Enter Phrase: ");
		String phrase = keyboard.nextLine();
		
		//Count array for storing number of vowels
		int[] count = new int[5];
		char[] vowels = {'a','e','i','o','u'};
		
		//Starting count at 0
		for(int i = 0; i < 5; i++)
			count[i] = 0;
		
		//Looking for vowels in array and increasing their count
		for(int i = 0; i < phrase.length(); i++)
		{
			char ch = phrase.charAt(i);
			if(ch == 'A' || ch == 'a')
				count[0]++;
			else if(ch == 'E' || ch == 'e')
				count[1]++;
			else if(ch == 'I' || ch == 'i')
				count[2]++;
			else if(ch == 'O' || ch == 'o')
				count[3]++;
			else if(ch == 'U' || ch == 'u')
				count[4]++;
		}
	
		for(int i = 0; i < count.length; i++)
		{
			for(int j = 0; j < count.length - 1; j++)
			{
				if(count[j] > count[j+1])
				{
					int temp = count[j];
					count[j] = count[j + 1];
					count[j + 1] = temp;
					
					char temp1 = vowels[j];
					vowels[j] = vowels[j + 1];
					vowels[j + 1] = temp1;
				}
			}
		}
		//Printing vowels and count
		System.out.println("\nThe vowels and their count");
		for(int i = 0; i < count.length; i++)
		{
			System.out.println(vowels[i] + " : " + count[i]);
		}
	}

}
