package application;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	MyFrame() {
		this.setVisible(true);
		this.setSize(420, 420);
		this.setTitle("GUI test");
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(0, 0, 0));
	}
}
