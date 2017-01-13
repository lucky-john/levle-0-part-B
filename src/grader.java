import javax.swing.JOptionPane;

public class grader {
	public static void main(String[] args) {
		String grade = JOptionPane.showInputDialog(null, "what grade do you have");
		int score = Integer.parseInt(grade);
		if (score < 60) {
			JOptionPane.showMessageDialog(null, "You have an F hahahahahhaha");
		} else if (score < 70) {
			JOptionPane.showMessageDialog(null, "You got a D");
		} else if (score < 80) {
			JOptionPane.showMessageDialog(null, "You have a C");
		} else if (score < 90) {
			JOptionPane.showMessageDialog(null, "You have a B");
		} else if (score < 101) {
			JOptionPane.showMessageDialog(null, "You have an A");
		}
	}
}
 