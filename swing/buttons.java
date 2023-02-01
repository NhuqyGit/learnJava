package swing;

import javax.swing.*;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame  f = new JFrame();
		String img = "C:\\Users\\DELL\\Downloads\\rsz_dis.png";
		ImageIcon image = new ImageIcon(img);
		
		JButton btn = new JButton();
		btn.setBounds(100, 100, 200, 100);
		btn.setIcon(image);
		btn.setText("Discord");
//		btn.setVerticalAlignment(JButton.CENTER);
//		btn.setHorizontalAlignment(JButton.CENTER);
		btn.setEnabled(false);
		
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
