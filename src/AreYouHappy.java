import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
String Happy =	JOptionPane.showInputDialog("Are you happy? ");
if(Happy.equals("yes"))
	JOptionPane.showMessageDialog(null, "congrats");
else if(Happy.equals("no")){
	JOptionPane.showInputDialog(null, "do you want to be happy?");
	if(Happy.equals("no")){
	JOptionPane.showMessageDialog(null, "good for you!!!!!!!!!!");
	}
	else{
		JOptionPane.showInputDialog(null, "do you want to be happy?");
		
	}
}
else if(Happy.equals("who cares")){
		JOptionPane.showMessageDialog(null, "bye ugly");
  }
}
}