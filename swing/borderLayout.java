package swing;

import javax.swing.*;

import java.awt.*;
public class borderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout(5, 10));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
//		panel1.setSize(100, 100);
//		panel1.setPreferredSize(new Dimension(100, 100));
//		panel4.setPreferredSize(new Dimension(100, 100));
//		panel2.setSize(100, 100);
//		panel3.setSize(100, 100);
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.DARK_GRAY);
		
		f.add(panel1, BorderLayout.NORTH);
		f.add(panel2, BorderLayout.SOUTH);
		f.add(panel3, BorderLayout.EAST);
		f.add(panel4, BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
