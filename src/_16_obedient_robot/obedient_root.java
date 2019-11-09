package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_root {

	static Robot rob = new Robot();
	static String color = JOptionPane.showInputDialog("Pick a color, blue, red or yellow?");
	static String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
	public static void main(String[] args) {
		setColor();
		if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else {
			drawCircle();
		}
	}
	//draw a square
	static void drawSquare() {
		rob.setSpeed(10);
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	//draw a triangle
	static void drawTriangle() {
		rob.setSpeed(10);
		rob.penDown();
		for (int i = 0; i < 3; i++) {
			rob.turn(120);
			rob.move(100);
		}
	}
	//draw a circle
	static void drawCircle() {
		rob.setSpeed(10);
		rob.penDown();
		for (int i = 0; i < 90; i++) {
			rob.move(4);
			rob.turn(4);
		}
	}
	
	static void setColor() {
		if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else {
			rob.setPenColor(Color.yellow);
		}
	}
}
	
