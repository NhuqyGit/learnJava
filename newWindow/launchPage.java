package newWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchPage implements ActionListener {
	JFrame f = new JFrame();
	JButton btn = new JButton("New window");
	launchPage(){
		btn.setBounds(50, 50, 200, 30);
		btn.addActionListener(this);
		
		f.add(btn);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn) {
			f.dispose();
			NewWindow a = new NewWindow();
		}
	}
}
