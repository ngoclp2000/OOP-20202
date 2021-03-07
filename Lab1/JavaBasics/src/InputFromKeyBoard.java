import java.util.Scanner;

public class InputFromKeyBoard {
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String  strNameString = keyboardScanner.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboardScanner.nextInt();
		System.out.println("How tall are you ?");
		double dHeight = keyboardScanner.nextDouble();
		
		System.out.println("Mr/Mrs. " + strNameString + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
		keyboardScanner.close();
	}
}
