package swing;

import java.awt.*;
import javax.swing.*;

public class layeredPane {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		
		JLabel label1= new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.green);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2= new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3= new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.yellow);
		label3.setBounds(150, 150, 200, 200);
		
		
	
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		layeredPane.add(label1);
		layeredPane.add(label2);
		layeredPane.add(label3);
		
		
		
		
		f.add(layeredPane);
		f.setVisible(true);
		
	}
}
