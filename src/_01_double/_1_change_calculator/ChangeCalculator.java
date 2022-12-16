package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");	 
int nicklesInt = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String quarters = JOptionPane.showInputDialog("How many quarters do you have?");	 
int quartersInt = Integer.parseInt(quarters);
		// Ask the user how many quarters they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");	 
int dimesInt = Integer.parseInt(dimes);
		// Calculate how much money the user has.  Hint: Use a double variable 
JOptionPane.showMessageDialog(null, 0.10*dimesInt + 0.25*quartersInt + 0.05*nicklesInt);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

