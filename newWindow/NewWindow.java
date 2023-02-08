package newWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
	JFrame f = new JFrame();
	JLabel l = new JLabel("LO LO CC");
	NewWindow(){
		l.setBounds(100, 100, 100, 100);
		f.setTitle("HELLO");
		f.add(l);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
