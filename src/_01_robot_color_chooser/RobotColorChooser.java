//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot

		
		Robot rob = new Robot();
		while (true) {
			
		//3. Ask the user what color they would like the robot to draw
		String answer = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (answer.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if (answer.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if (answer.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else if (answer.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		} else if (answer.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		} else {
			rob.setRandomPenColor();
		}
		
        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setSpeed(50);
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		}
	}
}
