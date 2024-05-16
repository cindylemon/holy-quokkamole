import java.util.Random;
import java.util.Scanner;

public class story2 extends battleSystem {
	static questions qtester = new questions();
	public static int pushups;
	public static int enemySpawnChance;
	public static String stock[] = { "Energy Drink", "Quokka Knife", "Glue", "Cookie", "Exit" };
	public static String[] currentStock = new String[stock.length];
	public static boolean buyable = true;
	public static int chosen;
	public static boolean confirmB = true;
	public static int bTracker;

	/**
	 * all the fluff and the story (this is my favourite part i think cus
	 * quokkington is so cute) the first battle part
	 */
	public static void pt2() {
		System.out.println(cyan + "-----DAY 1-----" + reset);
		print(textSpeed, "   Nothing interesting has happened yet.");
		print(textSpeed,
				"   You wipe down the windows in the empty gift shop and grab some things from the staff room that you figure you might need.");

		addInv("Boomerang");
		addInv("Flashlight");
		addInv("Handcuffs");
		addInv("Smokebomb");
		print(textSpeed,
				"   (The boomerang and smokebomb MAY just be for your own entertainment. But hey, you're the boss now, right?)");
		print(textSpeed, "   You head down to the beach.");
		addInv("Seashell");
		seashellCounter++;
		print(textSpeed, "   You draw some stars in the sand and sit by the water.");
		print(textSpeed, "   You head home.");
		paycheck(250);
		System.out.println("END OF DAY 1");
		enter("continue");
		System.out.println(cyan + "-----DAY 2-----" + reset);
		print(textSpeed,
				"   You haven't met any of the quokkas yet, even though this island is supposed to be full of them.");
		print(textSpeed, "   What's going on?");
		print(textSpeed, "   You walk down to the grassy area");
		enter("continue");
		print(textSpeed, "A QUOKKA: Quokkadoodle doo!!!! ");
		print(textSpeed, "YOU: !!???");
		print(textSpeed, "YOU: Am I going insane?");
		print(textSpeed, "A QUOKKA: Good day to you sir. Or ma'am. I'm not quite sure what you are.");
		print(textSpeed, "A QUOKKA: My eyes aren't what they used to be, and they don't make glasses in my size.");
		print(textSpeed,
				"A QUOKKA: I can't seem to find any nice slacks in my size either. Not at an affordable rate at least.");
		print(textSpeed, "A QUOKKA: Alas! Such is life for a simple quokkaholic such as I.");
		print(textSpeed, "A QUOKKA: My --");
		print(textSpeed, "YOU: Um....");
		print(textSpeed,
				"A QUOKKA: Oh my! I apologize for my manners. My name is Sir Quokkington, mayor of all the quokkas.");
		print(textSpeed, "SIR QUOKKINGTON: I was elected due to my extensive knowledge of quokka puns and --");
		print(textSpeed, "SIR QUOKKINGTON: Nevermind, that is not of importance right now.");
		print(textSpeed, "SIR QUOKKINGTON: We need your help.");
		enter("continue");
		print(textSpeed,
				"   You follow Quokkington towards the beach, where you glimpse a shadowy figure looming ahead.");
		print(textSpeed,
				"SIR QUOKKINGTON: Head Chef Carby has been sending his henchchefs to this island to acquire fresh quokka meat for his summer menu.");
		print(textSpeed, "YOU: Chef Carby? From Michellin star-rated restuarant Carbilicious?");
		print(textSpeed, "SIR QUOKKINGTON: The one and only. He's already taken some of us for quokkaccinos!");
		print(textSpeed, "SIR QUOKKINGTON: Please sire, please protect my people.");
		print(textSpeed, "   You hear a loud bang in the distance, coming from near the beach.");
		print(textSpeed, "SIR QUOKKINGTON: The end is nigh. Make haste!");

		battleStart();
		while (force != 1) { // FORCES the person to play the battle
			System.out.println("You should help Sir Quokkington.");
			battleStart();
		}
		enter("continue");
		print(textSpeed,
				"SIR QUOKKINGTON: We will all be indebted to you. We trusted you when we saw your drawings in the sand.");
		print(textSpeed, "SIR QUOKKINGTON: Your shift is over, please rest well. A war awaits.");
		print(textSpeed, "YOU: ......");
		print(textSpeed, "   Quokkington has taken a liking to you. Your charisma increases by 1 point");
		charisma++;
		paycheck(250);
		firstSmokebomb = false; //turns off the forcing
		System.out.println("END OF DAY 2");
		enter("continue");

	}

	/**
	 * starts the third part of the story, more self-led
	 */
	public static void pt3() {

		System.out.println(cyan + "-----DAY 3-----" + reset);
		print(textSpeed,
				"   The island is characteristically empty, but Sir Quokkington greets you in front of the giftshop.");
		print(textSpeed, "SIR QUOKKINGTON: I had a map drawn for you, " + name + ".");
		print(textSpeed,
				"SIR QUOKKINGTON: I can not stay for long. We are all in hiding, as the island is crawling with henchchefs.");
		print(textSpeed,
				"SIR QUOKKINGTON: Please be safe. The Head Chef may become enraged and try to get rid of you himself.");
		print(textSpeed, "   Sir Quokkington scampers off towards the grass.");
		print(textSpeed, "   The following is a map of the island, with building A representing the gift shop: ");
		image2();
		moving();
	}

	/**
	 * always will send u back to the "home base" of the gift shop. this is like the bread and butter of the second part
	 * asks you where you want to go, etc.
	 */
	public static void moving() {
		enter("continue"); // just to add a bit of extra dimension/chunking to my game
		System.out.println(yellow
				+ "Right now you are outside the gift shop. What would you like to do?  (HINT: look for Sir Quokkington after defeating a few enemies)");
		System.out.println("   [1] Enter the gift shop");
		System.out.println("   [2] Check out the beach, where a boat you haven't seen before hovers at the shoreline");
		System.out.println("   [3] Check for more quokkas in the grass");
		Scanner pt3 = new Scanner(System.in);
		numbers(pt3, 1, 3, "What would you like to do?" + reset);
		if (number == 1) {
			print(textSpeed, "   You walk into the gift shop.");
			giftShop();
		} else if (number == 2) {
			print(textSpeed, "   You walk to the beach.");
			beach();
		} else if (number == 3) {

			print(textSpeed, "   You walk to the grassy area.");
			grass();
		}
	}

	/**
	 * what happens when youre in the gift shop
	 */
	public static void giftShop() {
		print(textSpeed, "\nWelcome to the gift shop!");
		System.out.println(yellow + "What do you want to do?"); //all your options when youre in the gift shop
		System.out.println("   [1] Check out the catalogue");
		System.out.println("   [2] Exit the gift shop");
		System.out.println("   [3] Look at your inventory");
		System.out.println("   [4] Check your stats");
		System.out.println("   [5] Do some pushups");
		Scanner buy = new Scanner(System.in);
		numbers(buy, 1, 5, "Please choose an option" + reset);
		if (number == 1) {
			print(textSpeed, "   You look at the options available to you in the gift shop.");
			print(textSpeed, "   Even for a tourist trap, these prices seem a bit... absurd..."); //i just thought this was funny
			buy();
		} else if (number == 2) {
			moving(); //go back to the main place
		} else if (number == 3) {
			print(textSpeed, "These items are in your inventory:");
			printInv(); //shows the inventory
		} else if (number == 4) {
			print(textSpeed, "These are your current stats:");
			System.out.println("Max Health: " + maxHealth);
			System.out.println("Max Heat: " + maxHeat);
			System.out.println("Strength Stat: " + strength);
			System.out.println("Speed: " + speed);
			System.out.println("Charisma: " + speed);
		} else if (number == 5) { //i love the pushups because i think its so fun that you can have a chance to reset from going to the beach
			if (pushups == 0 && strength < 25) { //max the pushups at 25
				print(textSpeed, "   You do some pushups.");
				System.out.println(green + "Your strength increased by 5 points!" + reset);
				System.out.println(red + "You're feeling tired, so your speed decreases by 2 point" + reset);
				strength = strength + 5;
				speed = speed - 2;
				pushups++;
			} else {
				print(textSpeed, "You're feeling a little bit sore right now."); //so you cant just spam pushups
			}
		}
		giftShop(); //resets after
	}

	/**
	 * what happens when youre in the beach, different things running based on stats
	 */
	public static void beach() {
		if (bossFight != true) { //runs if this isnt the boss fight
			double enemyChance = Math.random(); //finds the chance that itll be an enemy
			if (enemyChance > 0.5) { //theres a 50 percent chance that an enemy will spawn
				battleStart();
				print(textSpeed, "   Rattled by your encounter, you return to your post outside the gift shop.");
				moving(); //go back to the options
			} else {
				print(textSpeed, "   It's a quiet, peaceful day.");
				print(textSpeed, "   You sit and listen to the waves lapping over the shore.");
				double restChance = Math.random();
				if (restChance > 0.7) { //theres a slight chance that the pushups will reset
					pushups = 0;
					print(textSpeed, "You feel rested and relaxed...");
				}
				print(textSpeed, "   But you can't seem to shake the feeling that someone else is here...");
				double itemChance = Math.random();
				if (itemChance > 0.8) { //a slighter chance that a seashell will be found
					print(textSpeed, "   You find a nice seashell.");
					System.out.println(green + "   Seashell has been added to your inventory!" + reset);
					if (seashellCounter == 0) {
						addInv("Seashell");
						seashellCounter++;
					} else if (seashellCounter > 0) {
						seashellCounter++;
					}
				}
				print(textSpeed, "   You return back to the gift shop.");
				moving();

			}
		} else { //bossfight time!!!!
			print(textSpeed, "CARBY: Well, well, well....");
			print(textSpeed, "CARBY: So you're the one always foiling my plans, huh?");
			print(textSpeed, "CARBY: Maybe I'll have to make you the appetizer for my next dinner party!");
			battleStart();
		}
	}

	/**
	 * what happens in the grassy area
	 */
	public static void grass() {
		double enemyChance = Math.random();
		if (enemyChance > 0.7) { //a 30 percent chance an enemy will spawn in this area
			battleStart();
			System.out.println(yellow + "Would you like to stay in the grassy area or return to the gift shop?");
			System.out.println("   [1] Stay");
			System.out.println("   [2] Return to the gift shop");
			Scanner back = new Scanner(System.in);
			numbers(back, 1, 2, "Where would you like to go?" + reset); //choose to stay in the grass(talk to the guy) or go back to the big options
			if (number == 1) {
				grass();
			} else {
				print(textSpeed,
						"You are pretty shaken up after your encounter and return to your post at the gift shop.");
				moving();
			}
		} else {
			if (bossFight == true) {
				print(textSpeed, "Sir Quokkington and his quokkas have gone into hiding."); //if u try to talk to quokkington when boss fight is active
			} else {
				if (dropsCounter >= 3) { // after youve fought 3 enemies
					print(textSpeed, "   You hear rustling in the trees and grass.");
					print(textSpeed, "SIR QUOKKINGTON: Hello " + name + ".");
					print(textSpeed,
							"SIR QUOKKINGTON: I hope you have been resting well. We have recieved some troubling news...");
					print(textSpeed,
							"SIR QUOKKINGTON: Head Chef Carby has become impatient. He has left for the island to gather his ... newest dishes on his own. ");
					print(textSpeed, "   Looking towards the water, you spot movement on the mysterious boat.");
					print(textSpeed, "   Prepare for battle and head back to the beach when you're ready!");
					bossFight = true;
					moving();
				} else {
					//i loveee this part it is so much fun it adds another dimension to the game imo
					print(textSpeed, "SIR QUOKKINGTON: Nice to see you, " + name + "!");
					print(textSpeed, "SIR QUOKKINGTON: We thought it would be fun if we did a bit of quokka trivia.");
					System.out.println(yellow + "Would you like to participate?");
					Scanner hi = new Scanner(System.in);
					System.out.println("   [1] Yes");
					System.out.println("   [2] No");
					numbers(hi, 1, 2, "Please indicate a response" + reset);
					System.out.print(reset);
					if (number == 1) {
						Random random = new Random();
						int question = random.nextInt(4); //will choose a random number correlating to a question
						if (question == 0) {
							qtester.question1();
						} else if (question == 1) {
							qtester.question2();
						} else if (question == 2) {
							qtester.question3();
						} else if (question == 3) {
							qtester.question4();
						} else if (question == 4) {
							qtester.question5();
						} else {
							print(textSpeed, "SIR QUOKKINGTON: Never mind! Sorry, we seem to have nothing right now."); //i just have this for just in case
						}
						qtester.result(); //if they get it right itll go to the results page and give you loot
					}
					print(textSpeed, "You return to the gift shop."); //return to the gift shop no matter if u get it right or not
					moving();

				}
			}
		}
	}

	/**
	 * most of this code is reused from my battling methods. it's a simple thing i
	 * think
	 */
	public static void buy() {
		int price = 0;
		bTracker = 0;
		System.out.println("You currently have $" + money);
		System.out.println("Here is what the gift shop has in stock right now (Choose exit to exit) : ");
		for (int i = 0; i < stock.length; i++) {
			currentStock[bTracker] = stock[i];
			if (stock[i] != null) {
				System.out.println("   [" + (bTracker + 1) + "]" + stock[i]);
				bTracker++;
			}
		}
		Scanner buying = new Scanner(System.in);
		numbers(buying, 1, (10), "What would you like to view?");
		chosen = number - 1;
		// all of these if statemetns just take whatever the chosen string value is and
		// spits out a description, sets the value of the prices
		if (currentStock[chosen] == "Glue") {
			System.out.println("Glue: Halves your opponent's speed. $90");
			System.out.println("You currently have " + gcounter + " glue sticks.");
			buyInfo();
			gcounter++;
			price = 40;
		} else if (currentStock[chosen] == "Quokka Knife") {
			System.out.println("Quokka Knife: Meant for display, but does crazy damage if used in battle. $100.");
			buyInfo();

			price = 100;
		} else if (currentStock[chosen] == "Cookie") {
			System.out.println("Cookie: Gives you a bit of extra health.");
			System.out.println("You currently have " + cookieCounter + " cookies.");
			buyInfo();

			price = 40;
			if (cookieCounter == 0) {
				addInv("Cookie");
				cookieCounter++;
			} else if (cookieCounter > 0) {
				cookieCounter++;
			}
		} else if (currentStock[chosen] == "Energy Drink") {
			System.out.println("Energy drink: doubles your speed for 2 turns.");
			System.out.println("You currently have " + etracker + " cans of energy drink.");
			buyInfo();
			price = 45;
			if (etracker == 0) {
				addInv("Cookie");
				etracker++;
			} else if (etracker > 0) {
				etracker++;
			}

		} else if (currentStock[chosen] == "Exit") {
			giftShop();
		}
		if (money >= price) {
			money = money - price;
			System.out.println(green + "Successfully bought " + currentStock[chosen] + "!" + reset);
			System.out.println("Your remaining balance is: $" + money + " AUD");
			addInv(currentStock[chosen]);
			if (currentStock[chosen] == "Quokka Knife") {
				stock[chosen] = null;
			}

		} else

		{
			System.out.println(red + "ERROR. INSUFFICIENT FUNDS." + reset); // ya poor
		}

		buy();

	}

	/**
	 * liek the battleinfo, where it basically just confirms if you want to buy the
	 * item or not.
	 */
	public static void buyInfo() {
		System.out.println("\nYou are hovering " + currentStock[chosen]);
		System.out.println("   [1] Buy this item");
		System.out.println("   [2] Back to options");
		Scanner confirmation = new Scanner(System.in);
		numbers(confirmation, 1, 2, "Do you want to buy this item?");
		if (number == 1) {
		} else {
			buy();
		}
	}
}
