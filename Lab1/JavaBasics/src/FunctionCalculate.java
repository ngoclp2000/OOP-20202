import javax.swing.JOptionPane;

public class FunctionCalculate {
	public static void main(String[] args) {
		Double a,b,c,a1,b1,c1,d,dX,dY,delta;
		// First degree one variable
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter the a value of ax + b = 0 function"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter the b value of ax + b = 0 function"));
		if(a == 0) {
			if(b == 0) {
				JOptionPane.showMessageDialog(null,"The function is always true");
			}else {
				JOptionPane.showMessageDialog(null,"The fucntion is always false");
			}
		}else {
			JOptionPane.showMessageDialog(null,"The result of function: " + -b/a);
		}
		// First degree two variable ax + by = c and a1x+b1y =c1
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter the a value of ax + by = c function"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter the b value of ax + by = c function"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Enter the c value of ax + by = c function"));
		a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the a1 value of ax + by = c function"));
		b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the b1 value of ax + by = c function"));
		c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the c1 value of ax + by = c function"));
		
		d = a*b1 - b*a1;
		dX = c*b1 - c1*b;
		dY = a*c1 - a1*c;
		
		if(d == 0) {
			if(dX == 0 && dY == 0) {
				JOptionPane.showMessageDialog(null,"There are infinite solutions");
			}else 	JOptionPane.showMessageDialog(null,"There are no solution");
		}else {
			JOptionPane.showMessageDialog(null,"The result x of function: " + dX/d);
			JOptionPane.showMessageDialog(null,"The result y of function: " + dY/d);
		}
		
		
		// Second degree one variable ax^2 = b
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter the a of the function ax^2 +bx +c = 0"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter the b of the function ax^2 +bx +c = 0"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Enter the c of the function ax^2 +bx +c = 0"));
		
		delta = b*b - 4*a*c;
		
		if(a== 0) {
			if(b != 0)
				JOptionPane.showMessageDialog(null, "The function is reduced to the one degree with one variable, then the solution is: "+ -c/b);
			else {
				if(c== 0) {
					JOptionPane.showMessageDialog(null, "There are infinite solutions");
				}else
					JOptionPane.showMessageDialog(null, "There is no solution");
			}
		}else {
			if(delta < 0) {
				JOptionPane.showMessageDialog(null, "There are no real solution");
			}else {
				if(delta == 0) {
					JOptionPane.showMessageDialog(null, "The solution is: " + -b/(2*a));
				}else {
					JOptionPane.showMessageDialog(null, "The first solution is: " + (-b + Math.sqrt(delta))/(2*a));
					JOptionPane.showMessageDialog(null, "The second solution is: " + (-b - Math.sqrt(delta))/(2*a));
				}
			}
		}
	}
}
