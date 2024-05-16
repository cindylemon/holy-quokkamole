import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class errorCheckings {
	public static String reset = "\u001B[0m";
	public static String red = "\u001B[31m";
	public static String green = "\u001B[32m";
	public static String cyan = "\u001B[36m";
	public static String magenta = "\u001B[35m";
	public static String yellow = "\u001B[33m";
	public static String blue = "\u001B[34m";
	public static String bold = "\033[0;1m";
	public static String bReset = "\033[0;1m";
	public static char quotes = '"';
	public static int number;
	public static int maxHealth = 50;
	public static int health;
	public static int xp;
	public static int strength;
	public static int speed;
	public static int speedChance;
	public static int charisma;
	public static int friendship;
	public static int level=1;
	public static int money;
	public static int heat;
	public static int maxHeat=10;
	public static boolean bossFight = false;

	/**
	 * my numbers error checking method!!!! my favourite method ever i love this so much
	 * so useful and so versatile and amazing and i used it literally every 3 lines in my code i think
	 * @param scan --> the scanner that will be used (not sure if it needed to be a new scanner every time but it just felt safer)
	 * @param min --> the minimum value that the user can choose
	 * @param max --> the maximum value that the user can choose
	 * @param text --> text that will be output when the error checking runs
	 * @return
	 */
	public static int numbers(Scanner scan, int min, int max, String text) {
		number = 0; //the number that will say what the user picked
		while (true) {
			System.out.println(text); //the text that will output -- if the user gets it out of range it will say it again
			if (scan.hasNextInt()) { //makes sure the input is an integer
				number = scan.nextInt(); //sets the number as the int
				if (number < min || number > max) { // checks the range of the input
					System.err.println("ERROR. INPUT IS NOT IN RANGE."); //if input is not in range will output error message and loop again
					// scan.next();
					// continue;
				} else {
					break; //breaks out when its in range
				}
			} else {
				System.err.println("ERROR. INVALID INPUT."); //if its not an int it will output this
				scan.next();

			}
		}
		return number;
	}

	/**
	 * my text error check! i never used this but i made it just in case and will keep it for just in case (also bc i relaly like this idea)
	 * @param scan --> the scanner that will be used in the method
	 * @param expected --> the expected string
	 * @param text --> the text that will be outputted when asking for the text
	 * @return --> returns the string that the person inputs if its the expected string
	 */
	public String words(Scanner scan, String expected, String text) {
		while (true) {
			System.out.println(text);
			String hi = scan.nextLine();
			if (hi.equalsIgnoreCase(expected)) {
				return hi;
			} else {
				System.err.println("ERROR, INVALID INPUT.");
			}
		}
	}

	/**
	 * allows the cool print slowly thing
	 * @param speed --> the speed at which was set earlier (i could have just set it in here instead of
	 * having it at every print method but its ok
	 * @param message --> the text that needs to be printed out
	 */
	public static void print(int speed, String message) {
		try {

			char[] array = message.toCharArray();
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				TimeUnit.MILLISECONDS.sleep(speed);
			}

		} catch (Exception e) {

		}
		System.out.println("");
	}

	public static void enter(String action) {
		System.out.println("Press enter to " + action + "...");
		Scanner hey = new Scanner(System.in);
		String butt = hey.nextLine(); 
		butt=null;//JUST IN CASE it actually stored anything
		}

	/**
	 * used to print a seperation
	 */
	public static void seperator() {
		System.out.println("---------------------------------- \n");
	}

	/**
	 * prints out the title image, it's a bit blurry but thats ok
	 * !!!I DID NOT MAKE THIS IMAGE!!!!!! i couldnt find the original creator, just places like amazon and displate selling the design
	 */
	public static void image1() {
		System.out.println(
				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..@@@..........@@@@.......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......-+++++++=......%*..@*.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...+++++++++++++++=:@...@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@.=.....:++=.....-..:@@..-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....:..@@@#..:=@@@@@=++=:#..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...+++..@@@@@@@@.=.....=+++==*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..-++++.@@@@@@@@@.+++++++++++=..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.=++=....@@@@@@@..=+++++++++++-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..++++@@:...@@@..=@=++++++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..+++=:..@@....=@@.++++++++++++++.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=.-+++++:..-===:..=+++++++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:..:+++=...::+++++++++++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#...=+*@.@...:.....+++++=....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.-+...@.@@%.@.@.:+=.:.@@@...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....@.....@..@...@@.....=...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@.=.@=...@@@....++++++=..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.........%.==#.@@@@..@@:.++++++++..%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+@...:@.===-:.---..*....@%@.=++++++++:..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@@.................:@@@@@.=+++++++++=..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@..@@@@@@@@@@@@@@@@@@@@@@@@+@@.+++++++++++=.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@..+%@#@@@@%%%%%%@@@@@@##@@@@@%=+*+++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@..=@+##############%#@@@.....=+++++++++++=.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**#%%%%%%%%%%%%%#@...-===----=++++++++.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*#%%%%%%%%%#+@@@@@##%@@@@%++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..@@@@%++++#@@@@@...-==-----=++++++++.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@....%@@@@@@@.....=+++++++++++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..-.........+++++++++++++++++++++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..=+++++++++++++++++++++++++++...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*++:::+++++++++++++++++++=....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..:=:@.......:---==++++=....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......@@@@@.....+#=+++..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.....@@@.....@@@@@.......@@@@@..........:@@@@.....@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@..-..@@@...........@@@.--.@@..-..@@@+.-..@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@.---.@@.....@@@..:..@@.--.@@...-.-@@.....@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@.---.@..-.@@@@@@..-.@@.--.@@@..........@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@.--:.@.--.@@@@@@..-.=@.--.@@@@@@..--..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.....--..@.--.@@@@@@..-.@@.--.@@@@@@@.:-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@.:-..@..-..@@@@..-..@@.--.@@@@@@@..-..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.---.@@@..-..@@..-......:..@@@.--.....@@@..-..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@.....@@@.....@@@..........@@@@........@@@.....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@....@@..@@..@@....@..@.....@...@..@@..@@@..@@....@@..@@......@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@..@@..#..@@..@.@@@.@....@@....@@.-%.@...@...@..@@..@..@@.@@@..@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@.:@@..@..@@..@.@@@.@....@@....@@....@.....@....@@..@.@@@.@@@..@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@.....@@.....@@.....@..@..@..@....@@.@..@@@@..@....@@...@....#.@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	/**
	 * prints out the map, drawn in jspaint and put through art to ascii
	 */
	public static void image2() {
		System.out.println("                                                   G@B!                                                                                                                                                \r\n"
				+ "                        :.                     .Y~  ^5@@P^                                                  J5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY57                                                          \r\n"
				+ "                       7@5                      ~G5   ~B@&^                ^7JYYY7^                        .@5:^^^^^^^^^^^:::^^^^^^^^^^^^^^:BG                                                          \r\n"
				+ "       Y5:            ~@@~                 ~P.    G5   :@@&~            ~5B&BPJJ5#@Y                       .&J            ~7:               GG                                                          \r\n"
				+ "       Y@G           7&&7                  .#7    :&~  .#@@P            J@&^     ?@B                       .&Y           5@@&!              GG                                                          \r\n"
				+ "       .#@!   .:    J@B:                    PP     G5   Y@@&.            G@Y?YB@G~                         .&Y          Y@P7@&~             GG                                                          \r\n"
				+ "        7@#: !#@P^ !@&:                     P5     JG   J@@@!            ^@@: ?YG@G^                       .&Y         7@#: !@@!            GG                                                          \r\n"
				+ "         Y@GJ@#J&@5#@7                     :&!     JG   J@@@!             P@5:   ~&@!                      .&Y        ~&@#B#B#@@!           Y&.                                                         \r\n"
				+ "          ?@@G^ .?#B7                      G5     .#J   J@@@!             .P&@#Y~?@&^                      .&Y       !@@?!!^..~&@7          ?@.                              ^5#G7                      \r\n"
				+ "                                          5B.     YB    Y@@#.               :^?GBBJ:                       .&Y      ~@@!       ^&@7         ?@.                             7@#7P@G.                    \r\n"
				+ "             ^G5^                       .5B:     J#:    #@@J                                               .&Y      :J^         ^5!         ?@.                             ?@#  #@~                    \r\n"
				+ "             P@@@5:                    !GY      !&~    !@@@~                                               .&J                              ?@.                              !#@  &:                    \r\n"
				+ "            J@B J&&?                  ^5^      ^&!     P@@P                       ..                       .&G!7777!7???????????????JYYYYYYYG&.           ^~^                 :B@@&P7^.  BY             \r\n"
				+ "          :5@@G55#@@#~                         GP     ~@@@!               :~~75PGB&J                                                                   .J#&B&B^                #@!   ##G @5.            \r\n"
				+ "          J@#7777!^J@#                       :PP.    ^#@#~                5@@G5?7~^.                                                           ^~~^    J@G.                    5@B7   @&YG              \r\n"
				+ "         ^@#^       7!                      !#?     ^&@Y:                 :&@~                                                               7#&BBG:   J@B??5PP5!               ~5####Y:  .     .7??:   \r\n"
				+ "                                            !^     ?@@?                    J@5                                                               #@!        !Y5YY!7G@B^                .:.         7&&PY^   \r\n"
				+ "                                                 ~B@P:                     ?@&##BBPY~                                              .YPGY     Y@B?~~77!:    :^:  5@Y                     :7^    B@J      \r\n"
				+ "                                    ::         .J@@!                       ?@P:.                                         :YPP5~    .P@&&&J:   :YGGGGP@&J. .5B&BP#&7                     ~@@7   ~B@GYY?^ \r\n"
				+ "           :JPPB#&#BB#P.           7#!        :B@#~                        ?@5 ...                                      7&@??#@5.   ~@#  @@P~        :5@#:   ^!7!:                ~!     7@#:   .7JJ5@@?\r\n"
				+ "           ~5Y77#@?  ..           YB^   Y?   :#@@~                         ?@&#BBB!                            ^!7!.  ^G@#    B@!    B@@&5J#@G!   !BBGB&P.              .        .&@~     G@?        :&@\r\n"
				+ "               ~@#.              PG.   5B.   P@@Y                          .7^:...                           ~B@BPP:  .J@&~ !P@G:    B@J.   !GG.  .^^^^.       .         &YJ7     ?@#:    ~@@:       ^&@\r\n"
				+ "               Y@5              GP    !@:   ~@@G.                                                           ~@@!        !@&#@@7     :@&.                    ^J#&!        @&@B?.   Y@P     B@^.      P@B!\r\n"
				+ "              .&@~            .GP.   ^&7   .#@@^                              ~Y7:                          G@?   ?G&@P. P@YJ##GJ!:  ~~                  .7G&BJ!.        !@B  @G!  .G@P:  ~@@:  &BB&G7  \r\n"
				+ "              ~@#.           .BP     B5    7@@P                              7@&#@P~                       .&@!   ~5B&P~ J@5 .~JG#P.               ^?5Y  B@&             .#@JB&&@5:  Y&&P5&@7           \r\n"
				+ "              7@P            GP     7&.    G@@Y                             !@&:  P@G7                      7&@5^   :B@5 ^GY                 .^75GB#BY7. ^G@Y ^Y#&BY      B@&Y:.?@&7  .!??7:            \r\n"
				+ "                            5G     :&7    ?@@@Y                            ?@@     J@@5                      .?B&#YP&#?                   ^JG##B5B@P      .#@#&G?:        B@~    :P@J                   \r\n"
				+ "                           !&^     YB     Y@@@Y                           5@BYJJYGGGY#@!                        :?JJ!.                   .5G     .B@Y      ^#@?           #@^      ^.                   \r\n"
				+ "          .B@5?7JJ5PBBJ    Y5     :&!     !&@@G                          Y@G.        ?@#.                                          .PBY^          .P@P      7@#:    .^.   ~7.           .       .       \r\n"
				+ "          ^@#              ..     7#       P@@@Y                        ^&&^          B@~                                          :&@@@5^          G@5      Y@G!YPBB&7    .     .     ^.   :.  ~  :    \r\n"
				+ "          ^@# .~777?!             GY       ~@@@@7                        :.           .:                                .YJ.        ?@P G@B7        :&@!      P@&P?!^:    ~.~^ .^^...^^:...^~..~^.^~    \r\n"
				+ "          ^@@B#&G55PJ             PP        5@@@@7                                                                ~PBBJ. 5@B.       !@P~G@#@B?.      !5^      .^. 7GGGGGGBBG#BGB#BBBB#BBBBB#BBB#B###!   \r\n"
				+ "          ?@#7^:                  .PG~       ~P@@@P.                          :75GGP~                          !BG@G!J@&! P@5       7@@&5^ ^5@&J:                J@#~^^^^^^^^~~^^::::::::::::::::^:^.   \r\n"
				+ "          &@~                       !GP!.      ?&@@#~                       .Y@&57J&J                          !@@!   5@P .G@J      7@G.     :?G!               ?@B:                                    \r\n"
				+ "          @B:^!JPGB####~              ^YJ       :YB@@P:                    ?&@Y.   .                            P@J !#@P^  ~@&:     !@B                        !@@^                                     \r\n"
				+ "          B&#BBPJ7~^:.                             ~P@@Y:                .P@P:                                  !@&#&P^     P@Y                               7@&~                                      \r\n"
				+ "                                                     ^J&@Y.              G@Y                                    ^@@7.       ^@@   .#P:                       ?@#^                                       \r\n"
				+ "                                              .        .5@G:            :@@!                                     P@J         G@@BJ^                         J@G:                                        \r\n"
				+ "            ~~:~~~:                          .PY:        J@#^            ^5@#?:..:7G@7                           ~@&:        :7^           .        :   .^. .~                    ..           ^        \r\n"
				+ "           ^@@##G#@5:              .J~         7#7        ?@&~             ^J##BB##5~.                            Y@B.               .    :^       :^  .^                    ..   ~.    ^    :7~!^.     \r\n"
				+ "           5@P.. .?@&^              ~#J         ^#?       ^@@B                                                             ::::.^::^?~^^^^?^^::::^7!^:^!..              :   .:   ^  .^~J?J5PB##B#Y.     \r\n"
				+ "          .&@^     B@7               .#?         ?#       :&@@~          .!.                                            :J##BBB##B##BGBBBBBB#BBBB#BGB##BBB!      .!7777J?77?J7?JPBGB#&BGP5Y?J^. ~.      \r\n"
				+ "          ?@@      @5.                PY         ?#.       B@@7          7@G        7G^                               :Y@&Y:..^!..^^     :: ....:~   .....      7#@GPPPPPPPPPPP5J?!~^^     ..           \r\n"
				+ "          5@55@&YJJ~                  GY        .#?       ^@@@7          .&@~       P@J                             .Y@&J.    .                               .Y@#^                                     \r\n"
				+ "         .#@~ J@B^                   JG^        J#        5@@@^           7@&^.::::.?@P                           ~5&#Y.                                     ~#@J                                       \r\n"
				+ "         ~@&.  7@&7.                 :.        J#^       7@@@#.            5@&BBBBBB#@P                        :JG@G7.                                    .7B@G~                                        \r\n"
				+ "         ~#Y    :G@5                         :PP^       ^&@@@?             ?@G      ?@P                       ^#&P^                                      J&@P^                                          \r\n"
				+ "                                            7#7        .B@@@Y              ^@#      7@P                        :.                                       .?J^                                            \r\n"
				+ "                                           JB~         Y@@&7               ^@#      7@P                                                                                                                 \r\n"
				+ "                                           ^.         7@@B:                :&G      7@G                                                                                                                 \r\n"
				+ "                                                     ~@@Y.                  :.      ^5J                                                                                                                 \r\n"
				+ "                                                    J@#~                                                                                                                                               ");
		
	}

	/**
	 * adds more salary
	 * @param salary --> how much money to add (just in case i wanted to add more or less), easier way to change it
	 */
	public static void paycheck(int salary) {
		money = money+salary;
		System.out.println("   Your salary of $" + salary + " AUD has come in! Your total balance now is: $" + money);
	}
	
	/**
	 * adds xp to the total xp ammount
	 * @param added --> the xp needed 
	 */
	public static void addXp(int added) {
		xp = xp + added;
		System.out.println(magenta + "You gained " + added + "XP!" + reset);
		System.out.println("Gain " + (100-xp) + " more XP to level up!");
		if(xp>=100) {
			level++;
			System.out.println("YOU LEVELED UP!");
			System.out.println("You are now on level " + level);
			System.out.println("You gained:");
			System.out.println(" ♡ +5 heat capacity");
			maxHeat = maxHeat+5;
			System.out.println(" ♡ +10 health");
			maxHealth = maxHealth +10;
			System.out.println(" ♡ +2 Strength");
			strength = strength + 2;
			System.out.println(" ♡ +2 Speed");
			speed = speed + 2;
			xp=0;
		}
		//enter("continue");
	}

	/**
	 *made this method here cus i planned on having it exit in other places, but decided against it.
	 *never deleted it and left it here so i could just use it when my game ended.
	 */
	public static void leave() {
		System.out.println("----------------------------------------");
		System.out.println("THANK YOU FOR PLAYING HOLY QUOKKAMOLE!");
		System.exit(0);
		
	}
}
