import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class clicker  implements KeyListener,ActionListener{
public static void main(String[] args) {
	new clicker().run();
}
JFrame window = new JFrame();

Timer t = new Timer(5000,this);

int buttonCount=0;
void run(){
window.setVisible(true);
	window.setSize(500, 500);
	window.addKeyListener(this);
	t.start();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getKeyCode()==KeyEvent.VK_SPACE){System.out.println("Darth Vader");}  
	buttonCount= buttonCount+1;
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Luke Skywalker");
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("Han Solo");
	JOptionPane.showMessageDialog(null, ""+buttonCount);
}
}

