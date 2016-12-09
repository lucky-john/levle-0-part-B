import javax.swing.JOptionPane;

public class CarDealer {
	public static void main(String[] args) {
		String car = JOptionPane.showInputDialog("what car would you like");
		JOptionPane.showMessageDialog(null, car);
		if (car.equals("lambo")) {
			JOptionPane.showMessageDialog(null, "Your lambo is $200,000");
		}
		
	if (car.equals("350Z")){JOptionPane.showMessageDialog(null, "Your 350Z  is $$27,980");}
			
		if (car.equals("ferrari")){
			JOptionPane.showMessageDialog(null, "Your ferrari  is $400,000");
		}
	}

}
