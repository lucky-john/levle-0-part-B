import javax.swing.JOptionPane;

public class sleepingIn {
public static void main(String[] args) {
	String noob = JOptionPane.showInputDialog("what time is it?");
	int time =Integer.parseInt(noob);
	if(time>700 && time<1000){
		JOptionPane.showMessageDialog(null, "GO TO SLEEP!!!!!!!!!!");
	}
		else
          JOptionPane.showMessageDialog(null, "PARTY!!!!!!!!!!!!!!!!");
	
}

}
