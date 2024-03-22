package application;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Program {
	public static void main(String args[]) {

		JLabel label = new JLabel();
		ImageIcon icon = new ImageIcon("C:/temp/gui-java-course/java_GUI/src/application/logo.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
		
		label.setText("Bro, do you even code?");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setForeground(Color.GREEN);
		label.setIconTextGap(-25);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0, 0, 400, 700);

		JFrame frame = new JFrame();
		//frame.setSize(420, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI test");
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}
}
