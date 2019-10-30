package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happyOrNot = JOptionPane.showInputDialog("Are you happy?");
		if (happyOrNot.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing.");
		} else {
			String yesOrNo = JOptionPane.showInputDialog("Do you want to be happy?");
			if (yesOrNo.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		
			
		}
	}
}
