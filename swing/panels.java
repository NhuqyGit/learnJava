package swing;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;

public class panels {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		String image = "C:\\Users\\DELL\\Downloads\\rsz_dis.png";
		ImageIcon img = new ImageIcon(image);
		JLabel label = new JLabel();
		label.setText("Nhuqy");
		label.setIconTextGap(10);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setForeground(new Color(0xdfdfe0));
		label.setBackground(new Color(0x1a1c20));
		label.setOpaque(true);
		label.setIcon(img);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setBounds(15, 15, 200, 200);
		
		JPanel panelFirst = new JPanel();
		panelFirst.setBackground(new Color(0x1a1c20));
		panelFirst.setBounds(0, 0, 300, 800);
		panelFirst.setLayout(null);
		
		JPanel panelSec = new JPanel();
		//panelSec.setBackground(new Color(0x33363d));
		panelSec.setBackground(Color.red);
		panelSec.setBounds(0, 200, 80, 80);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		panelFirst.add(label);
		panelFirst.add(panelSec);
		f.add(panelFirst);
		f.add(panelSec);
	}
}
