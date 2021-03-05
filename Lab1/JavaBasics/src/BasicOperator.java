import javax.swing.JOptionPane;

public class BasicOperator {
	public static void main(String[] args) {
		Double num1,num2;
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
		System.out.println("Sum of two numbers : " + num1);
		System.out.println("Difference between two numbers: " + Math.abs(num1-num2));
		System.out.println("Product of two numbers: " +  num1*num2);
		if(num2 == 0) {
			System.out.println("Can not be divided by 0");
		}else {
			System.out.println("Quotient of two numbers: " + num1/num2);
		}
	}
}
