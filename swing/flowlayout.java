package swing;

import javax.swing.*;
import java.awt.*;

public class flowlayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500, 500);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel f = new JPanel();
		f.setSize(200, 200);
		f.setPreferredSize(new Dimension(100,200));
		f.setBackground(Color.darkGray);
		f.setLayout(new FlowLayout());
		
		f.add(new JButton("1"));
		f.add(new JButton("2"));
		f.add(new JButton("3"));
		f.add(new JButton("4"));
		f.add(new JButton("5"));
		f.add(new JButton("6"));
		f.add(new JButton("7"));
		f.add(new JButton("8"));
		f.add(new JButton("9"));
		
		fr.add(f);
		fr.setVisible(true);
		
	}

}
