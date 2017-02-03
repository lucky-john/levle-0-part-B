import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotName {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
	String bob = JOptionPane.showInputDialog("enter your name");
	if(bob.equals("Jonathan")){
		r2d2.setSpeed(100000);
		r2d2.turn(-90);
		r2d2.move(300);
		r2d2.penDown();
		r2d2.move(60);
		r2d2.turn(90);
		r2d2.move(70);
		r2d2.turn(180);
		r2d2.move(70);
		r2d2.turn(-90);
		r2d2.move(60);
		r2d2.turn(-90);
		r2d2.move(200);
		r2d2.turn(90);
		r2d2.move(50);
		r2d2.turn(-180);
		r2d2.move(100);
		r2d2.hide();
		
	}
	else {
	r2d2.turn(10000);
	}

	
	
	

	
}
}
