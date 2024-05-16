import java.util.Scanner;

public class storyAndStart extends errorCheckings {
	static battleSystem battleTest = new battleSystem();
	static story2 second = new story2();
	public static String name;
	public static int textSpeed;
	// character stats:

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// battleTest.battleStart();
		start();
	}

	/**
	 * starts the game off. starts the story and initializes some of the stats
	 */
	public static void start() {
		// initializing everything, setting everything to the basic/first settings
		health = maxHealth;
		money = 0;
		xp = 0;
		level = 1;
		battleTest.initializeInv();
		battleTest.IPcounter = 0;
		battleTest.cookieCounter = 0;
		battleTest.seashellCounter = 0;
		battleTest.dropsCounter = 0;
		battleTest.gcounter = 0;
		battleTest.etracker = 0;
		battleTest.bossFight = false;
		character();//call all the creation stuff
		preferences();
		enter("start");
		seperator();
		image1();
		System.out
				.println(bold + cyan + "WELCOME TO AUSTRALIA'S ROTTNEST ISLAND, HOME OF THE QUOKKAS!" + bReset + reset);
		while (true) { //loops so that if you spell your name wrong or something then you can re type it
			print(textSpeed, "???: What's your name? ");
			System.out.print("You: ");
			Scanner object = new Scanner(System.in);
			name = object.nextLine();
			System.out.println("Is " + name + " your name?"); 
			System.out.println("   [1] Yes");
			System.out.println("   [2] No");
			numbers(object, 1, 2, "Please confirm");
			if (number == 1) {
				break;
			}
		}
		if (name.equalsIgnoreCase("Carby")) {
			name = "Good Carby";
		}
		print(textSpeed, "???: Welcome " + name + "!");
		print(textSpeed, "YOU: Hello...");
		print(textSpeed, "???: I'm your big boss, Bibi. Nice to meet you!");
		print(textSpeed, "BIBI: Is this your first day on the job?");
		tutorialQuestion();
		print(textSpeed, "BIBI: Alright, sounds like you're ready to rumble.");
		print(textSpeed, "BIBI: You know what?");
		print(textSpeed, "BIBI: You seem like a good kid. Why don't you take the role of acting manager?");
		print(textSpeed, "YOU: What!?");
		print(textSpeed,
				"BIBI: Management is all taking a trip to the arctic for our bonding trip. We leave tomorrow, so we'll need someone to hold down the fort.");
		print(textSpeed, "   Bibi's phone rings.");
		print(textSpeed, "BIBI: Alright, I'm going to take off. See you in a bit!");
		print(textSpeed, "   She rushes away.");
		print(textSpeed,
				"   You seem to be the only employee -- maybe even the only person -- on the island. This is NOT how you expected your first summer job to go.");

		enter("continue");
		story2.pt2();
		story2.pt3();
	}

	/**
	 * runs the character creation using the error checking
	 */
	public static void character() {
		System.out.println(
				"The damage you do is based on your strength stat. Your dodge chance is based off of your strength stat. Your crit/extra damage is based off of your charisma.");
		System.out.println("Choose your character (names can be changed):");
		System.out.println("   [1] Yuan: 15 strength points, 10 speed points, 5 charisma points.");
		System.out.println("   [2] Cindy: 10 strength points, 10 speed points, 10 charisma points.");
		System.out.println("   [3] Ryan: 5 strength points, 15 speed points, 10 charisma points.");
		System.out.println("   [4] Anna: Choose your own stats!");
		Scanner characterChoice = new Scanner(System.in);
		numbers(characterChoice, 1, 4, "Who would you like to choose?");
		if (number == 1) {
			System.out.println("You have chosen Yuan!");
			strength = 15; //the game is sooo much easier if you get alot of strength btw lmao
			speed = 10;
			charisma = 5;
		} else if (number == 2) {
			System.out.println("You have chosen Cindy!");
			strength = 10;
			speed = 10;
			charisma = 10;

		} else if (number == 3) {
			System.out.println("You have chosen Ryan!");
			strength = 5;
			speed = 15;
			charisma = 10;
		} else if (number == 4) {
			System.out.println(
					"You have chosen Anna, the custom character! You have a total of 30 stat points you can set. ");

			while (true) {
				int selfStrength;
				int totalPoints = 30;
				Scanner stats = new Scanner(System.in);

				System.out.println("-----SET YOUR CUSTOM CHARACTER!-----");
				System.out.println(
						"You have 30 total points to use however you'd like. Any unused points will be wasted.");
				System.out.println(
						"You can set a max of 15 points per stat, and must have a minimum of 5 points per stat.\n");
				System.out.println("How many stat points would you like to alot to strength?");
				numbers(stats, 5, 15, "Please choose your strength. You have " + totalPoints + " points remaining.");
				totalPoints = totalPoints - number - 5;
				strength = number;
				System.out.println("How many stat points would you like to alot to speed?");
				numbers(stats, 5, totalPoints - 5,
						"Please choose your speed. You have " + totalPoints + " points remaining.");
				speed = number;
				if (totalPoints > 0) { //making sure theres more than 0 poils left
					System.out.println("How many stat points would you like to alot to charisma?");
					totalPoints = totalPoints - number;
					numbers(stats, 5, totalPoints,
							"Please choose your charisma. You have " + totalPoints + " points remaining.");
					totalPoints = totalPoints - number;
					charisma = number;

				}
				System.out.println("Your current stats are: ");
				System.out.println(magenta + "Strength: " + strength + " points");
				System.out.println("Speed: " + speed + " points");
				System.out.println("Charisma: " + charisma + " points" + reset);
				Scanner customChar = new Scanner(System.in);
				System.out.println("Are you SURE you are satisfied with your choices?");
				System.out.println("   [1] Yes");
				System.out.println("   [2] Take me back!");
				numbers(customChar, 1, 2, "Please indicate a response: ");

				if (number == 1) { // so the method will loop until it gets confirmation of the stats
					break;
				}
			}
		}
	}

	/**
	 * this sets the text print speed by setting the previously declared printing
	 * speed. the print method is found in the errorCheckings class
	 */
	public static void preferences() {
		System.out.println("\nChoose your text print speed: ");
		System.out.println("   [1] Instant: LALALALALALALALALALALALA");

		print(15, "   [2] Fast: LALALALALALALALALALALALA");

		print(30, "   [3] Normal: LALALALALALALALALALALALA");

		Scanner printPref = new Scanner(System.in);
		numbers(printPref, 1, 3, "Choose a text print speed. (1-3)");
		if (number == 3) { //i used to have 1 be normal thats why its descending
			System.out.println("You have chosen normal speed.");
			textSpeed = 30; //sets them as a variable so that i can later access the same number for everything
		} else if (number == 2) {
			System.out.println("You have chosen fast speed.");
			textSpeed = 15;
		} else if (number == 1) {
			System.out.println("You have chosen the instant speed.");
			textSpeed = 0;
		}
	}

	/**
	 * i like making extra methods instead of giant whole methods
	 */
	public static void tutorialQuestion() {
		System.out.println(yellow + "Possible responses:"); //you can choose for tutorial cus ik sometimes if you dont want to watch a tutorial and they make you watch it its really annoying
		System.out.println("   [1] Yes it is! Please give me a tutorial.");
		System.out.println("   [2] I've been here before. I know what's going on.");
		Scanner tutQuestions = new Scanner(System.in);
		numbers(tutQuestions, 1, 2, "How would you like to respond?" + reset);
		if (number == 1) { // if the response is wanting a tutorial. otherwise will just exit the method
							// and return to where it was before
			tutorial();
		}
	}

	/**
	 * prints out a silly overview of the objectives of the game. very vague on
	 * purpose because i want it to be a silly surprise
	 */
	public static void tutorial() {
		System.out.println("-----THE RUNDOWN-----");
		System.out.println(
				"‪‪♡‬ You have to do whatever it takes to protect and care for the quokkas. There may be people like crazed tourists that try to harm them.");
		System.out.println(
				"♡ If any hooligans try to terrorize the quokkas, use your items/abilities to immobilize and arrest them. Stay safe! They may put up a fight.");
		System.out.println(
				"♡ The gift shop is like your home base. You will always be safe there, and you can check your stats there.");
		System.out.println("♡ In battle, the faster person attacks first.");
		System.out.println(
				"♡ Be careful of heat stroke! Using some of your items/abilities will accumulate heat points, while others do not.");
		System.out.println("♡ Max out these heat points and you'll start losing health over time.");
		System.out.println("♡ Talk to the locals to improve your charisma, which can help you do more damage.");
		System.out.println("♡ Feel free to buy upgrades and items from the gift shop.");
		System.out.println("♡ Your paycheck will come at the end of every day.");
		System.out.println("Good luck!");
		enter("continue");
	}

	/**
	 * used this to test something and i just never deleted it lol
	 */
	public static void hello() {
		System.out.println("this is wokring!!!!");
	}

}
