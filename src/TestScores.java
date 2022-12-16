import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
		
	
	
	
String score = JOptionPane.showInputDialog("Please give me your test scores.");

double scoreInt = Double.parseDouble(score);

if (scoreInt < 40) {
	
	JOptionPane.showMessageDialog(null,"OOF. Study harder next time, please.");
}

if (scoreInt >40 && scoreInt <80) {
	JOptionPane.showMessageDialog(null,"Pretty good!.");
}	
	
if (scoreInt >80 && scoreInt<100) {
	JOptionPane.showMessageDialog(null,"WOW! Awesome ;D");
}
	
if (scoreInt >100) {
	JOptionPane.showMessageDialog(null,"mhm, sure. You are lying!");
}
	
	
	
	
}
}
