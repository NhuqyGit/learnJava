package swing;

import java.awt.*;
import javax.swing.*;

public class gridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton a = new JButton();
		JLabel b = new JLabel("1");
		JLabel c = new JLabel("JKL");
		
		JPanel d = new JPanel();
		d.add(b);
		d.add(c);
//		b.setVerticalAlignment(JLabel.CENTER);
//		b.setHorizontalAlignment(JLabel.CENTER);
//		c.setVerticalAlignment(JLabel.CENTER);
//		c.setHorizontalAlignment(JLabel.CENTER);
//		b.setBounds(40, 30, 30, 30);
//		c.setBounds(36, 50, 30, 30);

		a.add(d);
		
		f.add(a);
		
		
		f.add(new JButton("1"));
		f.add(new JButton("2"));
		f.add(new JButton("3"));
		f.add(new JButton("4"));
		f.add(new JButton("5"));
		f.add(new JButton("6"));
		f.add(new JButton("7"));
		f.add(new JButton("8"));
		f.add(new JButton("9"));
		f.setVisible(true);
		
		
	}

}
