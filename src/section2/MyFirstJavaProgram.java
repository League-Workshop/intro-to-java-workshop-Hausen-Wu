package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		
		// START HERE
		Robot moby = new Robot();

		moby.penDown();
		for(int a=1;a<5;a++)
		{
			moby.setSpeed(a*1000);
			moby.move(200);
			moby.turn(90);	

		}
		

		
		
		
	}

}
