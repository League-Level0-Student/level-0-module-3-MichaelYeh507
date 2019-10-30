package _07_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		int currentYear = 2020;
		int myBirthYear = 2006;
		while (myBirthYear != currentYear) {
			JOptionPane.showMessageDialog(null, myBirthYear);
			myBirthYear += 1;
		}
	}
}
