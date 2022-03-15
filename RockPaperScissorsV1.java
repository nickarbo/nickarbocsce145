/*
 * Written by Nick Arboscello
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsV1 {

	public static void main(String[] args) {
		
		//Allowing user input and random variable
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		//Defining each string for user and machine choices, Defining valid choices
		String choice = null;
		String userchoice = null, compchoice = null;
		String compchoicearray[] = {"Rock", "Paper", "Scissors"};
		
		int computer_score, user_score;
		
		System.out.println("Welcome to Rock, Paper, Scissors. Best 2 out of 3, Good Luck!");
		
		do
		{
			computer_score = 0;
			user_score = 0;
			System.out.println("");
			
			for(int i = 1; i <= 3; i++)
			{
				System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
				
				userchoice = keyboard.nextLine();
				
				if(!(userchoice.equals("Rock") || userchoice.equals("Paper") || userchoice.equals("Scissors")))
				{
					System.out.println("Not a valid choice. Computer wins");
						computer_score++;
				}
				else
				{
					//Defining a tie to the machine
					compchoice = compchoicearray[r.nextInt(3)];
					System.out.println(compchoice + " vs " + userchoice + "!");
					if(compchoice.equals(userchoice))
					{
						System.out.print("Tie!");
						System.out.println("");
					}
					else
					{
						//Defining which outcomes Player wins and Computer wins
						if((compchoice.equals("Rock") && userchoice.equals("Paper") || (compchoice.equals("Paper")&&
								userchoice.equals("Scissors") || (compchoice.equals("Scissors") && userchoice.equals("Rock")))))
							{
							user_score++;
							System.out.print("Player Wins!");
							System.out.println("");
							}
						else
						{
							computer_score++;
							System.out.println("Computer Wins!");
							System.out.println("");
						}
					}
				}
				//Printing the results of the game
				System.out.println("Player has won " + user_score +" times and the computer"
						+ " has won " + computer_score +" times");
			}
			if(user_score == computer_score)
				System.out.println("Game is tied.");
			
			else if(user_score > computer_score)
				System.out.println("Player Wins!");
			
			else
				System.out.println("Computer Wins!");
			
			System.out.println("Play again? \"Yes\" or \"No\"");
			choice = keyboard.nextLine();
		}
		while(choice.equals("Yes") || choice.equals("YES") || choice.equals("yes"));
		
	}

}
