package swing;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
public class label {
	public static void main(String[] args) {

			JFrame f = new JFrame();
			String img = "C:\\Users\\DELL\\Downloads\\tai.png";
			ImageIcon image = new ImageIcon(img);
			Border boder = BorderFactory.createLineBorder(Color.red, 3);

			f.setTitle("Java swing example");

			JLabel label = new JLabel();
			label.setText("Ay Do Mother FUCK!!!");
			label.setBounds(130, 50, 100, 40);
			label.setIcon(image);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setIconTextGap(5);
			
			label.setForeground(new Color(0x00FF00));
			label.setBackground(Color.black);
			label.setOpaque(true);
			//label.setVerticalAlignment(JLabel.CENTER);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setBorder(boder);
			//label.setBounds(0, 0, 250, 260);
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1000, 1000);
			//f.setLayout(null);
			f.add(label);
			f.pack();
			f.setVisible(true);
	}

}
