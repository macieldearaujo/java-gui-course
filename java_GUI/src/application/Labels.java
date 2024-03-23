package application;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon image = new ImageIcon("C:/temp/gui-java-course/java_GUI/src/application/thumbsup.png");
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);	
		greenPanel.setLayout(new BorderLayout());
		greenPanel.add(label);
		
		JFrame frame = new JFrame();
		frame.setSize(750, 750);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}
