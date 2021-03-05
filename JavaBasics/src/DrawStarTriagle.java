import java.util.Scanner;

public class DrawStarTriagle {
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		int n,height;
		System.out.println("Enter the height of triagle:");
		n = keyboardScanner.nextInt();
		int ground = n*2 + 1;
		height = 0;
		int middle = n + 1;
		while(height < n ) {
			
			for(int i = 1 ; i <= ground ;i++) {
				if(i >= middle - height && i <= middle + height) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			height++;
			System.out.print("\n");
		}
		keyboardScanner.close();
	}
}
