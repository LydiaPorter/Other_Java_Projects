package lydia.porter.ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class ButtonClick implements ActionListener {
	JFrame theFrame;
	JButton clicker_btn;
	JLabel toClick_lbl;
	int num_Clicks;
	
	public ButtonClick() {
		theFrame = new JFrame(); 
		FlowLayout layout = new FlowLayout();
		theFrame.setLayout(layout); 
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setSize(500, 500); 
		theFrame.setLocation(200, 200); 
		theFrame.getContentPane().setBackground(Color.pink);
		//toClick_lbl.setForeground(Color.blue);
		
		clicker_btn = new JButton("number of clicks: "+Integer.toString(num_Clicks));
		clicker_btn.addActionListener(this);
		
		toClick_lbl = new JLabel();
		toClick_lbl.setText("Click the button as fast as you can!");
		
		
		
		theFrame.add(clicker_btn);
		theFrame.add(toClick_lbl);
		
		
		theFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonClick();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //all this stuff happens when the button is clicked:
		//increase num clicks every time you click it
		num_Clicks ++;
		clicker_btn.setText("number of clicks: "+Integer.toString(num_Clicks));
		if (num_Clicks >= 10) {
			Font font = new Font(clicker_btn.getFont().getName(), clicker_btn.getFont().getStyle(), 20);
			clicker_btn.setFont(font);
		}
		else if (num_Clicks > 20) {
			Font font = new Font(clicker_btn.getFont().getName(), clicker_btn.getFont().getStyle(), 50);
			clicker_btn.setFont(font);
		}
		else if (num_Clicks >= 30) {
			Font font = new Font(clicker_btn.getFont().getName(), clicker_btn.getFont().getStyle(), 60);
			clicker_btn.setFont(font);
		}
		else if (num_Clicks >= 40) {
			Font font = new Font(clicker_btn.getFont().getName(), clicker_btn.getFont().getStyle(), 100);
			clicker_btn.setFont(font);
		}
		
		if (num_Clicks > 20) {
			theFrame.getContentPane().setBackground(Color.red);
		}
		else if (num_Clicks > 40) {
			theFrame.getContentPane().setBackground(Color.GREEN);
			
		}
		else if (num_Clicks > 60) {
			theFrame.getContentPane().setBackground(Color.blue);
		}
		
		
	}

}
