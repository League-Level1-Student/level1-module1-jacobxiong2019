package _07_binary_converter;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
	JTextField answer = new JTextField(20);
	public void createButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,200);
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(answer);
		JButton button = new JButton();
		panel.add(button);
		button.setText("Convert");
		button.setSize(20, 20);
		button.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String answerString = answer.getText();
		
		answerString = convert(answerString);
		JOptionPane.showMessageDialog(null, answerString);
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

		
	
}
