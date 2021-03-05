import java.util.Scanner;

public class DisplayDay {
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		String monthString;
		int year;
		System.out.println("Enter the month:");
		monthString = keyboardScanner.nextLine();
		System.out.println("Enter the year:");
		year = keyboardScanner.nextInt();
		
		switch (monthString) {
		case "1":
		case "Jan":
		case "Jan.":
		case "January":
			System.out.println("31");
			break;
		case "2":
		case "Feb":
		case "Feb.":
		case "February":
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
				System.out.println("29");
			}else System.out.println("28");
			break;
		case "3":
		case "Mar":
		case "Mar.":
		case "March":
			System.out.println("31");
			break;
		case "4":
		case "Apr":
		case "Apr.":
		case "April":
			System.out.println("30");
			break;
		case "5":
		case "May":
			System.out.println("31");
			break;
		case "6":
		case "Jun":
		case "Jun.":
		case "June":
			System.out.println("30");
			break;
		case "7":
		case "Jul":
		case "Jul.":
		case "July":
			System.out.println("31");
			break;
		case "8":
		case "Aug":
		case "Aug.":
		case "August":
			System.out.println("31");
			break;
		case "9":
		case "Sept":
		case "Sept.":
		case "September":
			System.out.println("30");
			break;
		case "10":
		case "Oct":
		case "Oct.":
		case "October":
			System.out.println("31");
			break;
		case "11":
		case "Nov":
		case "Nov.":
		case "November":
			System.out.println("30");
			break;
		case "12":
		case "Dec":
		case "Dec.":
		case "December":
			System.out.println("31");
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		keyboardScanner.close();
	}
}
