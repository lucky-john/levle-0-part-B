import javax.swing.JOptionPane;

public class TeamProject {
	public static void main(String[] args) {
		String bill = "1.enter one of these 4 options \n" + "2.add two numbers \n" + "3.print message \n" + "4.exit";
		String option = JOptionPane.showInputDialog(bill);
		int JynErso = Integer.parseInt(option);
		if (JynErso < 1) {
			JOptionPane.showMessageDialog(null, "ERROR!!!!!!!!!!!!!!!");
		} else if (JynErso > 4) {
			JOptionPane.showMessageDialog(null, "ERROR!!!!!!!!!!!!!!!");
		}

		if (JynErso == 1) {
			String NienNumb= JOptionPane.showInputDialog("enter the first number");
			int lol = Integer.parseInt(NienNumb);
			String Bossk = JOptionPane.showInputDialog("enter the second number");
			int Ig_88 = Integer.parseInt(Bossk);
			int greedo = Ig_88+lol;
			JOptionPane.showMessageDialog(null, "the sum of the two numbers is"  + greedo);
			
			
		}
	}
}
