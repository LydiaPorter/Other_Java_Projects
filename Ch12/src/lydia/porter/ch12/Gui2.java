package lydia.porter.ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
//import both of these when building a GUI and everything in them

public class Gui2 implements ActionListener {
	String name; //class level so everything can use it
	JTextField name_tb; //it's all about the scope
	JLabel dontClick_lbl; //declared here so we can use it other places
	JButton dontClick_btn;
	JLabel name_lbl;
	JFrame mainFrame;
	
	/**
	 * 
	 */
	public Gui2() {
		//initial default set up frame
		mainFrame = new JFrame(); //mainFrame is name of it///////////////////
		FlowLayout layout = new FlowLayout(); //widget
		mainFrame.setLayout(layout); //set it. dot notation to access setter methods
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 500); //divisible by 3; people don't like looking at squares
		mainFrame.setLocation(200, 200); //where do you want your window to pop up?
		
		//widgets: things that do things; attributes ex: color
		//let's build WIDGETS!
		name_lbl = new JLabel(); //3 letters at end help us know what we're working with with variable names
		//CREATE it, SET it
		name_lbl.setText("Enter your name here:");
		
		name_tb = new JTextField();
		name_tb.setPreferredSize(new Dimension(100,25));
		
		dontClick_lbl = new JLabel();
		dontClick_lbl.setText("Do not click");
		
		dontClick_btn = new JButton("this button");
		dontClick_btn.addActionListener(this); //which action
		

		
		
		//add those widgets!
		mainFrame.add(name_lbl); //ADD label to GUI
		//mainFrame.add(new JLabel("testing"));
		mainFrame.add(name_tb);
		
		mainFrame.add(dontClick_lbl);
		mainFrame.add(dontClick_btn);
		
		
		//this needs to be the LAST line in constructor
		mainFrame.setVisible(true); //sets everything to visible unless you make one false
	}

	public static void main(String[] args) {
		new Gui2(); //new instance of class and allows it to run

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// interface
		//what should it do when the button is clicked?
		name = name_tb.getText();
		JOptionPane.showMessageDialog(null, "You clicked my button! I told you not to "+name+"!");
		//change background color
		mainFrame.getContentPane().setBackground(Color.pink);
		//change label color
		name_lbl.setForeground(Color.blue);
		dontClick_lbl.setForeground(Color.darkGray);
		
		
	}

}
