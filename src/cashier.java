import javax.swing.JOptionPane;

public class cashier {
public static void main(String[] args) {
	String money= JOptionPane.showInputDialog(null, "how much money do you have?");
String cash =	JOptionPane.showInputDialog(null, "how much does your item cost?");
	int myMom= Integer.parseInt(money);
	int dollers = Integer.parseInt(cash);
	int total = myMom-dollers;
	System.out.println(total);
	if(total>=0){
		JOptionPane.showMessageDialog(null, "your change is " + total);
	}
}
}

