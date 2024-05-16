import java.util.Random;
import java.util.Scanner;

public class battleSystem extends storyAndStart {

	public static int enemyCharisma;
	public static int enemyAD;
	public static int enemySpeed;
	public static int enemyHealth;
	public static int ADdone;
	public static String enemyNames[] = { "Evil Ryan", "Evil Cindy", "Evil Yuan", "Evil Anna", "Normal Billy", "Jayden",
			"April", "Lalalala", "Loopsy", "Brian", "Erin", "Larry", "Kaikai", "Sam", "Jollibee Jonny",
			"Italian Valeria" };
	public static String enemyName;
	public static int dropsCounter = 0;
	public static String possibleItems[] = new String[100]; // so i can put in more items
	public static int itemTracker;
	static boolean confirm = true;
	public static int choice;
	public static int fcounter; // flashlight cooldown calculator
	public static int ecounter = 3; // energy drink ticker
	public static int etracker;
	public static int force; // checks if this is the first battle
	public static boolean firstSmokebomb = true; // makes it so you cant use the smokebomb the first time
	public static int IPcounter = 0;
	public static int cookieCounter = 0;
	public static int seashellCounter = 0;
	public static int kcounter = 3;
	public static double dmg;
	public static String weird;
	public static int actualHeat;
	public static int gcounter;
	public static int search;
	public static boolean energy;

	/**
	 * starts the battle, calling the abilities and initializes everything needed in
	 * the battle.
	 */
	public static void battleStart() {
		fcounter = 2;
		kcounter = 3;
		health = maxHealth;
		heat = 0;
		if (bossFight != true) {
			Random enemyRandom = new Random();
			int choose = enemyRandom.nextInt(enemyNames.length);
			enemyName = enemyNames[choose];
			System.out.println(red + "You spot a henchchef! Their nametag reads " + enemyName + reset);
			System.out.println(yellow + "Would you like to fight them?");
			System.out.println("   [1] Fight");
			System.out.println("   [2] Flee");
			Scanner battleQ = new Scanner(System.in);
			numbers(battleQ, 1, 2, "Please choose your response: " + reset);
			force = number;
			if (number == 1) {
				health = 50;
				enemyStats();
				if (enemySpeed > speed) {
					System.out.println("The enemy's speed stat is higher than yours. They will go first.");
					enemyTurn();
				} else {
					System.out.println("Your speed stat is higher than your enemy's. You will go first.");
					yourTurn();
				}
			} else {
				// print(textSpeed, "You run away");
			}
		} else {
			System.out.println("FIGHT HEAD CHEF CARBY!");
			carby();
			print(textSpeed,
					"   He is a large and buff man, so while his damage output is high, his speed is lower than yours. "
							+ "\nYou will go first.");
			yourTurn();
		}
	}

	/**
	 * sets the enemy's stats to always be a mixture of 30 power points placed
	 * between the three stats
	 */
	public static void enemyStats() {
		Random AD = new Random();
		Random speed = new Random();
		int totalPoints = 30;
		enemyAD = AD.nextInt(14);
		enemyAD++; // so enemy attack damage will never be 0
		totalPoints = (totalPoints - enemyAD);
		int temp = totalPoints / 2; // ensures a more balanced distribution of points so the speed or damage isnt
									// always like
									// >15 and op
		enemySpeed = speed.nextInt(temp);
		totalPoints = totalPoints - enemySpeed;
		enemyCharisma = totalPoints;
		enemyHealth = 50;

	}

	/**
	 * outputs the inventory through the for loop. has the specific formatting that
	 * i use for every user input
	 */
	public static void printInv() {
		itemTracker = 0;
		for (int i = 0; i < possibleItems.length; i++) {
			if (possibleItems[i] != null) {
				System.out.println("   [" + (itemTracker + 1) + "]" + possibleItems[i]);
				itemTracker++;
			}
		}
	}

	/**
	 * this is just for when the inventory is initially created. its only called
	 * once throughout the game. this sets up the addInv() method because it makes
	 * everything null
	 */
	public static void initializeInv() {
		for (int i = 0; i < possibleItems.length; i++) {
			possibleItems[i] = null;
		}
	}

	/**
	 * 
	 * @param item --> the item to be added into the inventory. needs to be the
	 *             exact same as the item in the work if/else statements... uses the searchinv and checkinv to ensure theres no repeats
	 */
	public static void addInv(String item) {
		searchInv(item);
		if (search == 1) {
			checkInv(item);
		} else {
			for (int i = 0; i < possibleItems.length; i++) {
				if (possibleItems[i] == null) {
					itemTracker++;
					possibleItems[i] = item;
					break;
				}
			}
			System.out.println(green + "   " + item + " has been added to your inventory!" + reset);
		}
	}

	/**
	 * checks the inventory, adding a counter for the repeated item (after being checked for repeating in the searchinv)
	 * @param item --> the item being added
	 */
	public static void checkInv(String item) {
		if (item == "Cookie") {
			cookieCounter++;

		} else if (item == "Seashell") {
			seashellCounter++;

		} else if (item == "Ice Pack") {
			IPcounter++;

		} else if (item == "Energy Drink") {
			etracker++;
		} else if (item == "Glue") {
			gcounter++;
		}
	}

	/**
	 * searches through the array to see if the added item is already in the array
	 * @param item --> the item that youre trying to add
	 * @return --> returns the value of the search
	 */
	public static int searchInv(String item) {
		for (int i = 0; i < possibleItems.length; i++) {
			if (possibleItems[i] == item) {
				search = 1;
				break;
			} else {
				search = 0;
			}
		}
		return search;
	}

	/**
	 * starts your turn but doesnt run any of the calculations or anything
	 */
	public static void yourTurn() {
		if(enemyHealth > 0) {
			System.out.println(green + "----- YOUR TURN -----" + reset);
			System.out.println("Here is your inventory:");
			printInv();
			Scanner pick = new Scanner(System.in);
			numbers(pick, 1, itemTracker, "What items/abilities would you like to view?");
			choice = number - 1; //sets this so that i can use this in the array and accosss all the methods
			work(possibleItems[choice]);

			// enter("continue");
			if (possibleItems[choice] != "Smokebomb" && enemyHealth > 0) { //doesnt run enemy turn if its a smokebomb or if the guy is dead
				enemyTurn();
			}
		}

		if (ecounter > 3 && energy==true) { //to make the energy drinks work
			speed = speed / 2;
			System.out.println("Your energy drink wore off!");
			energy = false;
		}
	}
	// }

	/**
	 * starts the enemys turn
	 */
	public static void enemyTurn() {
		if (enemyHealth <= 0) {
			battleWon();
		} else {

			System.out.println(red + "\n----- " + enemyName.toUpperCase() + "'S TURN -----" + reset);
			// Random enemyAbility = new Random();
			double chance = Math.random() * 100;
			double mods = 1 + (enemyAD / 10);
			if (chance <= 40) {
				enemyAbility(2, "eggs");
			} else if (chance < 50) {

				enemyAbility((int) (2 * (mods + dropsCounter)), "butter knife");
			} else if (chance <= 60) {
				enemyAbility((int) (5 * (mods + dropsCounter)), "paring knife");
			} else if (chance <= 65) {
				enemyAbility((int) (10 * (mods + dropsCounter)), "butcher's knife");
			} else if (chance <= 70) {
				enemyAbility((int) (15 * (mods + dropsCounter)), "hot oil");
			} else {
				enemyAbility((int) (10 * (mods + dropsCounter)), "meat cleaver");
			}

			enter("continue");
			if (health > 0) {

				yourTurn();
			}
		}
		if (health <= 0) { //what happens if u die
			if (bossFight == true) {
				System.out.println(red + "You were defeated! You will respawn at the gift shop." + reset);

				story2.moving();
			} else {
				System.out.println("You were defeated!");
				System.out.println("You will be redirected back to the fight.");
				battleStart();
			}
		}
	}

	/**
	 * uses the enemy's ability
	 * 
	 * @param damage      --> how much base damage the ability does
	 * @param abilityName --> gets the name of the ability
	 */
	public static void enemyAbility(int damage, String abilityName) {
		// Random dodgeChance = new Random();
		double dc = Math.random(); //
		dc = dc + (speed / 100);// calculates your dodge chance based on speed
		System.out.println(enemyName + " used " + abilityName + "!");
		if (dc > 0.75) { // if dodge chance is higher than this then itll be good yay
			System.out.println(magenta + "You dodged the attack!" + reset);
		} else {
			health = health - damage;

			ADdone = damage;
			System.out.println(cyan + "You took " + ADdone + " damage. You have " + health + " health left." + reset);
			fcounter++;
			ecounter++;
		}
	}

	/**
	 * actually does all the work, doing all the items and abilities
	 * 
	 * @param freak --> the name of the ability (returned in the array)
	 */
	public static void work(String freak) {

		// System.out.println(crit);
		double mods = 1 + (strength / 10); //calculate the mods based on the strength
		double damage = 0;
		weird = freak;
		confirm = true;
		if (enemyHealth > 0) { //looks for the value of the array part chosen (the thing to use) and sets its damage output and heat value
			if (freak == "Boomerang") {
				damage = 5;
				if (confirm == true) {
					System.out.println(
							"Boomerang: throw your boomerang at your opponent, damaging them. +1 heat point, 5 base damage");
					itemInfo();
				}

				actualHeat = 1;
				dmg = damage;
				working();

			} else if (freak == "Flashlight") {
				if (confirm == true) {
					damage = mods * 10;
					System.out.println(
							"Flashlight: hit your opponent with your flashlight. +3 heat points, 1 turn cooldown, "
									+ damage + " damage");
					itemInfo();
				}
				if (fcounter >= 2) {
					dmg = damage;
					actualHeat = 2;
					working();
					fcounter = 0;
				} else {
					System.err.println("This item is on cooldown");
					yourTurn();
				}

			} else if (freak == "Handcuffs") {
				if (confirm == true) {
					System.out.println("Handcuffs: arrest your opponent after knocking them out.");
					itemInfo();
				}
				System.out.println("You can't use that right now!");
				yourTurn();
			} else if (freak == "Energy Drink") {
				if (confirm == true) {
					System.out.println(
							"Energy drink: double your speed for 3 turns. You have " + etracker + " cans left.");
					itemInfo();
				}
				if (ecounter >= 3) { // sets the counter to 0 and resets when it reaches 3
					speed = 2 * speed;
					ecounter = 0;
					energy = true;
				}

				etracker--;
				if (etracker == 0) {
					possibleItems[choice] = null;
					itemTracker--;
				}
				System.out.println("Your speed has been doubled.");
				yourTurn();
			} else if (freak == "Quokka Knife") {
				damage = mods * 20;

				if (confirm == true) {
					System.out.println("Quokka Knife: Slash at your opponent. +5 heat points, 3 turn cooldown, "
							+ damage + " damage.");
					itemInfo();

					if (kcounter >= 3) {
						dmg = damage;
						working();
						kcounter = 0;
					} else {
						System.err.println("This item is on cooldown");
						yourTurn();
					}
				}
			} else if (freak == "Ice Pack") {
				if (confirm == true) {
					System.out
							.println("Ice Pack: Reduces your heat by 5 points. You have " + IPcounter + " ice packs.");
					itemInfo();
					if (heat > 5) {
						heat = heat - 5;
					} else {
						heat = 0;
					}
					IPcounter--;
					if (IPcounter == 0) {
						possibleItems[choice] = null;
						itemTracker--;
					}
					System.out.println(cyan + "Your heat has been reduced by 5 points! It is now: " + heat + reset);
					yourTurn();
				}
			} else if (freak == "Cookie") {
				System.out.println("hi");
				if (confirm == true) {
					System.out.println("Cookie: Gives you 10 more health. You have " + cookieCounter + " cookies.");
					itemInfo();
				}
				health = health + 10;
				cookieCounter--;
				if (cookieCounter == 0) {
					possibleItems[choice] = null;
					itemTracker--;
				}

				System.out.println(cyan + "Your health has increased by 10 points. Now, it is: " + health);
				yourTurn();

			} else if (freak == "Smokebomb") {
				if (confirm == true) {
					System.out.println("Smokebomb: Use when you want to run away.");
					itemInfo();
					if (firstSmokebomb == true) {
						System.out.println("You can't use this right now!");
						yourTurn();
					}
				}

			} else if (freak == "Seashell") {
				if (confirm == true) {

					System.out.println(
							"Seashell: Increases your charisma by 1 point. You have " + seashellCounter + " Seashells");
					itemInfo();
				}
				charisma++;
				seashellCounter--;
				if (seashellCounter <= 0) {
					possibleItems[choice] = null;
					itemTracker--;
				}
				System.out.println(cyan + "Your charisma has increased by 1 points. Your total charisma is now: "
						+ charisma + reset);
				yourTurn();

			} else if (freak == "Glue") {
				if (confirm == true) {
					System.out.println(
							"Glue: Reduces your enemy's speed by 1/2. You have " + gcounter + " Glue Sticks left.");
					itemInfo();
				}
				enemySpeed = enemySpeed / 2;
				gcounter--;
				if (gcounter == 0) {
					possibleItems[choice] = null;
					itemTracker--;
				}
				yourTurn();
			} else {

				System.out.println("You can't use this right now!");
				yourTurn();
			}

		}
	}

	/**
	 * when the stuff is actually working, actually doing the damage (unless its dodged)
	 */
	public static void working() {

		double crit = Math.random();
		crit = (charisma / 70) + crit; //calculates the chance that itll crit
		if (enemyHealth > 0) {
			if (weird != "Smokebomb") {
				double dc = Math.random();
				dc = dc + (enemySpeed / 100); //calculates the percent of the dodge chance
				heat = heat + actualHeat;
				if (dc > 0.75) { //dodge chance of the enemy
					System.out.println(magenta + enemyName + " dodged the attack!" + reset);
				} else {
					enemyHealth = (int) (enemyHealth - dmg);
					System.out.println("You dealt " + dmg + " damage.");

					System.out.println(cyan + enemyName + " is now at " + enemyHealth + " health." + reset);
					if (enemyHealth <= 0) {
						enemyTurn();
					}
				}
				if (crit >= 0.5 && enemyHealth > 0) { //charisma doing damage
					System.out.println("\nYour charisma deals an extra 10 damage.");
					enemyHealth = enemyHealth - 10; //constant damage based on charisma
					if (enemyHealth <= 0) {
						enemyTurn();
					}
				}
				if (heat > maxHeat && enemyHealth > 0) { //the heat maxxing
					health = health - 5;
					System.err.println("\nYour heat is maxed. You lose 5 health points to the heat exhaustion.");
				} else {
					System.out.println("You are at " + heat + "/" + maxHeat + " heat points.");

				}

			}
//		} else {
//			enemyTurn();

		}
		fcounter++; //adds to the cooldown trackers
		kcounter++;
	}

	/**
	 * enables you to look at what item is in your inventory before you choose it
	 */
	public static void itemInfo() {
		if (enemyHealth > 0) {
			System.out.println("\nYou are hovering " + possibleItems[choice]);
			System.out.println("   [1] Use this item");
			System.out.println("   [2] Back to options");
			Scanner confirmation = new Scanner(System.in);
			numbers(confirmation, 1, 2, "Do you want to use this item?");
			if (number == 1) {
				confirm = false;
			} else {
				confirm = true;
				yourTurn();
			}
		}
	}

	/**
	 * What prints out after you win the battle
	 */
	public static void battleWon() {
		if (bossFight != true) {
			System.out.println(green + "You have defeated " + enemyName + "!" + reset);
			System.out.println("You used your handcuffs to arrest them.");
			System.out.println("They dropped:");
			dropsCounter++; // counts the battles won
			// if (dropsCounter <= 2) {
			System.out.println("   x1 Ice pack");
			IPcounter = 1;
			System.out.println("   $5");
			System.out.println("   x1 cookie");
			cookieCounter = 1;
			System.out.println("   50XP");
			money = money + 5;
			addInv("Ice Pack");

		//	IPcounter++;
			addInv("Cookie");

		//	cookieCounter++;
			addXp(50);

			// }
		} else {
			System.out.println(green + "---YOU HAVE DEFEATED HEAD CHEF CARBY!---" + reset);
			print(textSpeed, "SIR QUOKKINGTON: Surely he will never touch this island ever again!");
			print(textSpeed, "SIR QUOKKINGTON: Thank you so much. We will forever be in your debt.");
			print(textSpeed,
					"SIR QUOKKINGTON: We will discuss with Bibi about more benefits for you. You can relax now.");
			paycheck(250);
			System.out.println("END OF DAY 3"); //the end!
			leave();
		}
	}

	/**
	 * the final boss fight!!!!!
	 */
	public static void carby() {
		enemyName = "Head Chef Carby";
		enemyHealth = 100;
		enemyAD = 20;
		enemySpeed = 5; //low speed cus u buff
		enemyCharisma = 10;
	}
}
