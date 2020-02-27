import java.util.Scanner;

public class Cyoa {
	
	private boolean hasBell;
	private boolean hasKey;
	private Scanner s1 = new Scanner(System.in);
	
	public Cyoa() {
		hasBell = false;
		hasKey = false;
	}
	
	public static void main(String[] args) {
		Cyoa game = new Cyoa();
		game.printInstructions();
		game.startGame();
	}
	
	public void printInstructions() {	
		System.out.println("Pax the Cat");
		System.out.println("");
		System.out.println("Once upon a time, there was a pedigree cream British Shorthair named Pax. \nPax's favourite toy is a yellow rope. Pax can't go anywhere without his yellow rope.");
		System.out.println("However, after a trip back from Alberta, Pax can no longer find his favourite yellow rope. Can you help Pax find his favourite toy?");
		System.out.println("Explore the house with Pax and choose your paths wisely. To pick a path, enter in the letter(s) enclosed in brackets.");
	}
	
	public void startGame() {
		System.out.println("");
		System.out.println("To start the game, please press \"B\"");
		System.out.print(">");
		String begin = s1.nextLine();
		if (begin.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			startGame();
		}
	}
	
	public void inKitchen() {
		System.out.println("");
		System.out.println("Let's begin! Pax is in the kitchen right now. Where do you think the rope could be at? \nCould it be in the (B)bowl or the (W)washing machine?");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inBowl();
		} else if (input.equalsIgnoreCase("w")) {
			inWashingMachine();
		} 
		else {
			System.out.println("Invalid input, please try again.");
			inKitchen();
		}
	}
	
	public void inBowl() {
		System.out.println("");
		System.out.println("Pax hopped into the bowl. However, unfortunately no rope was there. So He curled up and had a little rest." + 
						   "\nAfter his rest he wondered what to do next. Maybe having a (D)drink or something to (E)eat would help.");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("d")) {
			haveDrink();
		} else if (input.equalsIgnoreCase("e")) {
			haveFood();
		} else {
			System.out.println("Invalid input, please try again.");
			inBowl();
		}
	}
	
	public void inWashingMachine() {
		//System.out.println("");
		System.out.println("Pax looked in the washing machine. There was an odd sock but no rope.\r"+
						   "Pax is tired now and wants to take a nap, where should he sleep? In the (W)washing machine or on a (S)shoe?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("w")) {
			sleepInWM();
		} else if (input.equalsIgnoreCase("s")) {
			sleepOnShoe();
		} else {
			System.out.println("Invalid input, please try again.");
			inWashingMachine();
		}
	}
	
	public void haveDrink() {
		System.out.println("Pax had a drink from his water fountain. Then he carried on looking. \r\n" +
					       "Where should he look next? In the (D)dishwasher or in a (P)plastic pottle?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("d")) {
			inDishwasher();
		} else if (input.equalsIgnoreCase("p")) {
			inPottle();
		} else {
			System.out.println("Invalid input, please try again.");
			haveDrink();
		}
	}
	
	public void haveFood() {
		System.out.println("Pax ate his dinner then he carried on looking." + 
				"\nWhere should he look next? In a (Ba)bag or in a (Bo)box?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("ba")) {
			inBag();
		} else if (input.equalsIgnoreCase("bo")) {
			inBox();
		} else {
			System.out.println("Invalid input, please try again.");
			haveFood();
		}
		
	}
	
	public void sleepInWM() {
		System.out.println("Oh no! Pax's master did not see Pax sleeping in the washing machine so she dumped her clothes in and turned the washing machine on!"+
						   "Should Pax (C)cry out loud to get his master's attention or try to (E)escape himself?");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("c")) {
			cryHelp();
		} else if(input.equalsIgnoreCase("e")){
			escapeHimself();
		} else {
			System.out.println("Invalid input, please try again.");
			sleepInWM();
		}
	}
	
	public void cryHelp() {
		System.out.println("Unfortunately, Pax's master did not hear his cry. RIP Pax..."+
					 	   "\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			cryHelp();
		}
	}
	
	public void escapeHimself() {
		System.out.println("Unfortunately it was too late. The door of the washing machine was shut and Pax was burried by all the clothes."+
						   "RIP Pax..."+
						   "\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			escapeHimself();
		}
		
	}
	
	public void sleepOnShoe() {
		System.out.println("Pax had a little sleep on the shoe then carried on looking." + 
				"\nWhere should he look next? In the (D)dishwasher or in a (P)plastic pottle?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("d")) {
			inDishwasher();
		} else if (input.equalsIgnoreCase("p")) {
			inPottle();
		} else {
			System.out.println("Invalid input, please try again.");
			sleepOnShoe();
		}
	}
	
	public void inDishwasher() {
		System.out.println("Pax jumped into the dishwasher and there was no rope in there so Pax decided to jumped back out."
							+"\nHowever, on his way out, his leg got cut by one of the knives in the dishwasher so his master had to take him to the hospital."
							+"\nThat was the end of Pax's rope search."+
							"\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			inDishwasher();
		}
	}
	
	public void inPottle() {
		System.out.println("It wasn't in the plastic pottle so he carried on looking." + 
				"\nWhere should he look next? In the (S)suitcase or underneath the (T)table?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("s")) {
			inSuitcase();
		} else if (input.equalsIgnoreCase("t")) {
			underTable();
		} else {
			System.out.println("Invalid input, please try again.");
			inPottle();
		}
	}
	
	public void inBag() {
		System.out.println("The yellow rope was not in the bag, but there was a big bundle of yellow yarn in the bag that Pax's master bought home."+
						   "\nPax fell in love with his new toy so he no longer wants to find the rope."+
							"\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			inBag();
		}
	}
	
	public void inBox() {
		System.out.println("There was nothing in the box besides a (B)brass bell and a (H)hammer.");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			picksBell();
		} else if (input.equalsIgnoreCase("h")) {
			picksHammer();
		} else {
			System.out.println("Invalid input, please try again.");
			inBox();
		}
	}
	
	public void inSuitcase() {
		System.out.print("The suitcase is locked,");
		if (hasKey == true) {
			System.out.println(" but the fortunate thing is, Pax has the key to unlock the suitcase!");
			if(hasBell == true) {
				System.out.println("So Pax used the brass bell to attract his master's attention."+
								   "His master walked over, picked up the key, and opened the suitcase."+
								   "Inside the suitcase was the yellow rope! Congradulations, you found Pax's favourite toy! Thanks to you, Pax is very happy~");
				System.out.println("Would you like to restart the game and explore other available endings? To restart the game, press \"B\"");
				System.out.print(">");
				String input = s1.nextLine();
				System.out.println("");
				if (input.equalsIgnoreCase("b")) {
					inKitchen();
				} else {
					System.out.println("Invalid input, please try again.");
					inSuitcase();
				}
			} else {
				System.out.println("But the unfortunate thing is, Pax is a cat so he doesn't know how to unlock the suitcase."+
								   "\nIs there anything Pax can use to attract his master's attention?"+
								   "\nWhere should he look? Inside a (Ba)Bag or a (Bo)Box?");
				System.out.print(">");				   
				String input = s1.nextLine();
				System.out.println("");
				if (input.equalsIgnoreCase("ba")) {
					inBag();
				} else if (input.equalsIgnoreCase("bo")) {
					inBox();
				} else {
					System.out.println("Invalid input, please try again.");
					inSuitcase();
				}
			}
		} else {
			System.out.println(" and Pax unfortunately do not have the key to unlock the suitcase."+
						  	   "\nMaybe you left out a detail somewhere along the way? To restart the game, press \"B\"");
			System.out.print(">");
			String input = s1.nextLine();
			System.out.println("");
			if (input.equalsIgnoreCase("b")) {
				inKitchen();
			} else {
				System.out.println("Invalid input, please try again.");
				inSuitcase();
			}
		}
	}
	
	public void underTable() {
		System.out.println("Underneath the table, Pax saw an unknown shinning object."+
						   "\nShould he walk up to take a closer look? (Y)Yes or (N)no?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("y")) {
			System.out.println("Pax walked up and the shinning object that he just saw was a key!"+
							   "\nShould Pax pick up the key? (Y)Yes or (N)no?");
			System.out.print(">");				   
			String input2 = s1.nextLine();
			System.out.println("");
			if (input2.equalsIgnoreCase("y")) {
				hasKey = true;
				System.out.println("Pax picked up the key. Where should he look next? On the (C)computer or in the (S)suitcase?");
				System.out.print(">");				   
				String input3 = s1.nextLine();
				System.out.println("");
				if (input3.equalsIgnoreCase("s")) {
					inSuitcase();
				} else if (input3.equalsIgnoreCase("c")) {
					onComputer();
				} else {
					System.out.println("Invalid input, please try again.");
					underTable();
				}
			} else if (input2.equalsIgnoreCase("n")) {
				System.out.println("Pax walked away from the table. Where should he look next? On the (C)computer or in the (S)suitcase?");
				System.out.print(">");				   
				String input3 = s1.nextLine();
				System.out.println("");
				if (input3.equalsIgnoreCase("s")) {
					inSuitcase();
				} else if (input3.equalsIgnoreCase("c")) {
					onComputer();
				} else {
					System.out.println("Invalid input, please try again.");
					underTable();
				}
			} else {
				System.out.println("Invalid input, please try again.");
				inSuitcase();
			}
			
		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("Pax walked away from the table. Where should he look next? On the (C)computer or in the (S)suitcase?");
			System.out.print(">");				   
			String input3 = s1.nextLine();
			System.out.println("");
			if (input3.equalsIgnoreCase("s")) {
				inSuitcase();
			} else if (input3.equalsIgnoreCase("c")) {
				onComputer();
			} else {
				System.out.println("Invalid input, please try again.");
				underTable();
			}
		} else {
			System.out.println("Invalid input, please try again.");
			underTable();
		}
	}
	
	public void picksBell() {
		hasBell = true;
		System.out.println("Pax picked up the brass bell. Where should he look next? In the (S)suitcase or underneath the (T)table?");
		System.out.print(">");				   
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("s")) {
			inSuitcase();
		} else if (input.equalsIgnoreCase("t")) {
			underTable();
		} else {
			System.out.println("Invalid input, please try again.");
			picksBell();
		}
	}
	
	public void picksHammer() {
		System.out.println("Pax picked up the hammer, but because it was too heavy, he dropped the hammer on himself."+
						   "\nRIP Pax..."+
		           		   "\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			picksHammer();
		}
	}
	
	public void onComputer() {
		System.out.println("Pax hopped on to the computer. He accidentally steeped on the \"Delete\" key and deleted his master's unsaved work."+
						   "\nPax's master got very angry and she banned Pax from walking around the house for the week."+
						   "Should Pax try to escape through the (W)window? Create (N)noises to attract his master's attention? Or (G)give up the rope search?");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("w")) {
			throughWindow();
		} else if (input.equalsIgnoreCase("n")) {
			makeNoise();
		} else if (input.equalsIgnoreCase("g")) {
			giveUp();
		} else {
			System.out.println("Invalid input, please try again.");
			onComputer();
		}
	}
	
	public void throughWindow() {
		System.out.println("It was rainning outside so the walls were very slippery. \nPax fell from the window and broke his leg so his master had to take him to the hospital"+
						   "\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			throughWindow();
		}
	}
	
	public void makeNoise() {
		System.out.println("The noises that Pax made was ignored by his master. \nWhat should he do now? Escape through the (W)window or (G)give up?");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("w")) {
			throughWindow();
		} else if (input.equalsIgnoreCase("g")) {
			giveUp();
		} else {
			System.out.println("Invalid input, please try again.");
			onComputer();
		}
	}
	
	public void giveUp() {
		System.out.println("Pax had given up. Without his favourite toy, Pax commited suicide two days later."+
						   "\nRIP Pax..."+
         		           "\rTo restart the game, press \"B\"");
		System.out.print(">");
		String input = s1.nextLine();
		System.out.println("");
		if (input.equalsIgnoreCase("b")) {
			inKitchen();
		} else {
			System.out.println("Invalid input, please try again.");
			giveUp();
		}
		
	}
}
