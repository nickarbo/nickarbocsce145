/*
 * Written by Nick Arboscello
 */




import java.util.Date;
import java.util.Random;
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class ChooseYourOwnAdventureV1 {

	
	public static void main(String[] args) {
		
		//Assigns Random, Scanner, and String functions. 
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String playagain="";
		
		//This is an adventure where you can fight enemies, make decisions, or even die. Have fun! 
		
		
		{while(true)
			
			{
				JOptionPane.showMessageDialog(null, "All of a sudden your eyes open, your dazed and confused "
						+ "and have no idea how you got "
						+ "there.\nYour mind is wired to fight, "
						+ "and the only thing you can see near you is a lantern and \n "
						+ "you only have 1 live left, good luck.");
				
				//Defines number of lives
				int life = 1;
						System.out.println("Press any button to begin");
				
						String a = keyboard.nextLine();
						
						//Prints to user what choices they have
						System.out.println("You see a house on the top of a hill. \nYou can keep going past the hill by "
								+ "pressing q or you could stop at the house to see what is inside by pressing o"
								+ "\nWhat choice will you make?");
						String choice = keyboard.nextLine();
						
						if(choice.equals("q"))
						{life++;
							System.out.println("You walked past the hill and picked up a life!\nYou have "
									+life+"lives\n Press any key to go back to the house on the hill");
							
							String b = keyboard.nextLine();
								System.out.println("You have entered the house on the top of the hill. There are 3 rooms unlocked.\nPress "
										+ "1 to enter the first Room, Press 2 to enter the second Room or Press 3 to enter the third room.\nMake "
										+"your decision quickly");
						}
						else if(choice.equals("o"))
						{
							System.out.println("You have entered the house on the top of the hill. There are 3 rooms unlocked.\nPress "
									+ "1 to enter the first Room, Press 2 to enter the second Room or Press 3 to enter the third room.\nMake "
									+"your decision quickly");
						}else {
							System.out.println("You pressed the wrong key, your player has died. Please try again");
								break;
						
						}
						Date time1 = new Date();
						
						//Assigning each string to each variable
						String decision = keyboard.nextLine();
						Date time2 = new Date();
						String back = ("");
						String desk = ("");
						String room = ("");
						String inventory = ("");
						String lantern = ("");
						String eat = ("");
						String advance = ("");
						boolean berry = false;
						int timer = time2.getSeconds()-time1.getSeconds();
						
						if(timer<11) {
							if(decision.equals("1"))
							{
								life = 0;
								System.out.println("You entered the first Room which leads you nowhere and you "
										+"fall and busted your head. \nYou have now lost all your lives");
									break;
							}
							{
							if(decision.equals("2"))
							{
								System.out.println("You entered the second Room and discover a desk. \nWould you like to open up the desk? "
									+"1 for yes or 2 for no. \nChoose wisely");
								
								desk = keyboard.nextLine();
						
							}
							else if(decision.equals("3"))
							{
								life++;
								System.out.println("You have found an extra life! You now have "+life+" lives left "
										+ "\nWould you life to enter through the door.\n1 for yes or 2 for no");
								room = keyboard.nextLine();
							}
							else {
								System.out.println("You pressed the wrong key, so your player has died. Try again.");
								break;
								}
							} 
								if(room.equals("1")) {
									life = 0;
									System.out.println("You opened the door and lost your lives because of a fire breathing dragon in the room.\n"
											+ "Please try again.\n(Hint: try the other door.)");
									break;
								}
								else if(room.equals("2"))
								{
									life = 0;
									System.out.println("You entered the door and got sucked into the universe by a blackhole."
											+ "\nYou are now lost at space, you are now declared dead.\n(Hint: try the other door.");
									break;
								}if(desk.equals("1")) {
									System.out.println("You have found a hidden room. "
											+ "Would you like to enter the room or stay?\n3 for enter or 4 for no");
								}
								else if(desk.equals("2"))
								{
									life = 0;
									System.out.println("By not opening the desk in time, it released a laser beam and you died.");
									break;		
								}
								back = keyboard.nextLine();
								
								if(back.equals("3"))
								{
									life++;
									System.out.println("You entered a tunnel and gained a life. You now have "+life+" lives left.\nType i to open your inventory.");
									inventory = keyboard.nextLine();
								}
								if(back.equals("4"));
								{
									life--;
									System.out.println("You chose to stay and it had a bomb inside.\nYou lost a life and now have "
											+life+" lives left");
								}if(inventory.equals("i"));
								{
									System.out.println("You have opened your inventory and see a lantern and "+life+" lives left. Press l to open your lantern.");
									lantern = keyboard.nextLine();
								}
								if(lantern.equals("l"));
								{
									life++;
									System.out.println("You turned on the lantern and found a life and a mysterious berry.\nYou now have "+life+" lives left. "
											+ "Would you like to eat the berry now or save it.\nPress 1 to eat it now or 2 to save it");
									eat = keyboard.nextLine();
								}
								if(eat.equals("1"))
								{
									life++;
									System.out.println("You chose to eat the berry which gave you an extra life You now have "
											+life+" lives left.\nPress any button to move on.");
									eat = keyboard.nextLine();
									berry = true;
								}
								else if(eat.equals("2"))
								{
									System.out.println("You chose to save the berry for later. Press any button to continue.");
									eat = keyboard.nextLine();
								}
								if(advance.equals(""))
								{
									System.out.println("You continued and ran into your best friend when you were a kid who has turned into Frankenstein.\nType fight to fight him");
									keyboard.nextLine();
									
									//assign lives to player and frankenstein
									int frankensteinlives = 3;
									int frankensteinNumber = 0;
									int playerNumber = 0;
									while(frankensteinlives > 0 && life > 0)
									{
										frankensteinNumber = r.nextInt(10);
										System.out.println("Which attack will you perform?\n1 to kick him, 2 to punch him or 3 to use the berry on him if you have it still.");
										String attack = keyboard.nextLine();
										if (attack.equals("1"))
										{
											playerNumber = 3;
										} else if(attack.equals("2"))
										{
											playerNumber = 5;
										} else if(attack.equals("3")&& berry == true)
										{
											playerNumber = 8;
										} else {
											playerNumber = r.nextInt(10);
										}
										if(playerNumber > frankensteinNumber)
										{
											frankensteinlives--;
											System.out.println("Your attack caused Frankenstein to lose a life!");
										} else
										{
											life--;
											System.out.println("Your attack was blocked and you got hit by Frankenstein! You now have "
													+life+ " lives left.");
										}
									}
									if(life == 0)
									{
										System.out.println("Sorry you ran out of lives.");
										break;
									} else {
										System.out.println("You defeated your best friend who turned into Frankenstein and returned him to normal.\nYou talk to him and he tells you that your plane had crashed "
												+"and you were declared missing.\nThe week after you went missing aliens came to earth and released a gas that turned everyone into mutant forms. "
												+"\nAfter you defeated your best friend it freed the world of mutants. Thanks for playing!");
										break;
									}
								}
								if(life == 0)
								{
									System.out.println("You have ran out of lives.");
									break;
								}
								System.out.println("Press any button to continue");
								room = keyboard.nextLine();
							
								break;
			}
		} System.out.println("Would you like to play again? Type yes or no");
		playagain = keyboard.nextLine();
		while(playagain.toLowerCase().equals("yes"));
	
	
		}
}
}