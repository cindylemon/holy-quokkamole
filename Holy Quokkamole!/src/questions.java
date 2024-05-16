import java.util.Scanner;

public class questions extends story2{
	public static int correct;
	
	/**
	 * the first question
	 */
	public static void question1() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("What do quokkas eat?");
		System.out.println("   [1] Cookies");
		System.out.println("   [2] Bananas");
		System.out.println("   [3] Meat");
		System.out.println("   [4] Vegetables");
		numbers(q1, 1, 4, "Please indicate a response: ");
		if(number == 1 || number ==2 || number ==3) {
			System.out.println("Wrong answer!");
			correct = 0; //if they get the questions wrong the value of correct is set to 0
		}else {
			correct = 1; //if they get the questions wrong the value of correct is set to 1
		}
	}
	
	/**
	 * the second question,, uses the same conventions as the first questions
	 */
	public static void question2() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("When are quokkas active?");
		System.out.println("   [1] Night");
		System.out.println("   [2] Day");
		System.out.println("   [3] Both Night and Day");
		System.out.println("   [4] Whenever they feel like it");
		numbers(q1, 1, 4, "Please indicate a response: ");
		if(number == 2 || number ==3 || number ==4) {
			System.out.println("Wrong answer!");
			correct = 0;
		}else {
			correct = 1;
		}
	}
	
	/**
	 * the third question, formatted and used the same as the other 2
	 */
	public static void question3() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("What is not part of quokka's main threats?");
		System.out.println("   [1] Human activities");
		System.out.println("   [2] Introduced predators");
		System.out.println("   [3] Habitat loss");
		System.out.println("   [4] Bacteria in water");
		numbers(q1, 1, 4, "Please indicate a response: ");
		if(number == 2 || number ==3 || number ==1) {
			System.out.println("Wrong answer!");
			correct = 0;
		}else {
			correct = 1;
		}
	}
	
	/**
	 * fourth 
	 */
	public static void question4() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("Can Quokkas climb?");
		System.out.println("   [1] Yes");
		System.out.println("   [2] No");
		System.out.println("   [3] Small trees and shrubs");
		System.out.println("   [4] If they feel like it, but they are generally very lazy.");
		numbers(q1, 1, 4, "Please indicate a response: ");
		if(number == 1 || number ==2 || number ==4) {
			System.out.println("Wrong answer!");
			correct = 0;
		}else {
			correct = 1;
		}
	}
	
	public static void question5() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("How big do quokkas get?");
		System.out.println("   [1] Around 3 feet tall");
		System.out.println("   [2] Under 1 foot tall");
		System.out.println("   [3] Around 2 feet tall");
		System.out.println("   [4] About 4 feet tall");
		numbers(q1, 1, 4, "Please indicate a response: ");
		if(number == 2 || number ==4 || number ==1) {
			System.out.println("Wrong answer!");
			correct = 0;
		}else {
			correct = 1;
		}
	}
	
	/**
	 * the result of the questions!!!!
	 * uses the value of correct to see if its correct or not and then add things from there
	 */
	public static void result() {
		if(correct ==1) {
			System.out.println("Congrats! You got the correct answer!");
			
			System.out.println("You got a cookie and five dollars!");
			System.out.println("Your charisma has increased by 2 points.");
			charisma = charisma +2;
			addXp(10);
			addInv("Cookie");
			money = money +5;
		}
	}

}
