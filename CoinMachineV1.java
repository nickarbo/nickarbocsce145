/*
 * Written by Nick Arboscello
 */
//Scanner allows for user input
import java.util.Scanner;
public class CoinMachineV1 {

	public static void main(String[] args) {
	
		//Assigns number values to the names 
	int amount, originalAmount, quarters, dimes, nickels, pennies;
	
	//Prints the arguement to the user
	System.out.println("Enter a whole number 1 to 99.");
	System.out.println("The machine will determine a combination of coins.");
	
	//Allows for the machine to understand the user input
	Scanner keyboard = new Scanner(System.in);
	amount = keyboard.nextInt();
	
	/*Machine converts original amount into coins by dividing 
	 * and using the mod operator to find the remainder */
	
	originalAmount = amount; 
	quarters = amount / 25;
	amount = amount % 25;
	
	dimes = amount / 10;
	amount = amount % 10;
	
	nickels = amount / 5;
	amount = amount % 5;
	
	pennies = amount;
	
	//Prints the number of coins to the user
	System.out.println(originalAmount + " cents in coins:");
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickels + " nickels");
	System.out.println(pennies + " pennies");
	}
	

}
