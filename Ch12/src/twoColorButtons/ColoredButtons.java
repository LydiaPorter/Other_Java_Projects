package twoColorButtons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColoredButtons implements ActionListener {
		JFrame myFrame;
		JButton redButton;
		JButton greenButton;
		FlowLayout myLayout;
		JButton blueButton;
		JButton pinkButton;
		JButton magentaButton;
		JButton orangeBtn;
		JButton cyanBtn;
		JLabel welcome;
			
	   
	  public ColoredButtons() {
		// create new JFrame
	   myFrame = new JFrame();

	    // set the frame title, size, location
	    myFrame.setTitle("Choose Your Color");
	    myFrame.setSize(550, 150);
	    myFrame.setLocation(200, 300);
	    myFrame.getContentPane().setBackground(Color.blue);

	    // make sure program terminates when window is closed
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // assign a layout
	    myLayout = new FlowLayout();
	    myFrame.setLayout(myLayout);
	    
	    welcome = new JLabel();
	    welcome.setText("click a button, any button!");
	    
	     

	    // create and add buttons to the frame
	    redButton = new JButton("Red");
	    redButton.addActionListener(this);
	    greenButton = new JButton("Green");
	    greenButton.addActionListener(this); ///IMPORTANT
	    blueButton = new JButton("Blue");
	    blueButton.addActionListener(this);
	    pinkButton = new JButton("Pink");
	    pinkButton.addActionListener(this);
	    magentaButton = new JButton("Magenta");
	    magentaButton.addActionListener(this);
	    orangeBtn = new JButton("Orange");
	    orangeBtn.addActionListener(this);
	    cyanBtn= new JButton("Cyan");
	    cyanBtn.addActionListener(this);
	  
	    myFrame.add(welcome);
	    myFrame.add(redButton);
	    myFrame.add(greenButton);
	    myFrame.add(blueButton);
		myFrame.add(pinkButton);
		myFrame.add(magentaButton);
		myFrame.add(orangeBtn);
		myFrame.add(cyanBtn);

	    // make the frame visible
	    myFrame.setVisible(true);
	    
	    
	     
	}

	public static void main(String[] args) {
		 new ColoredButtons();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.redButton)) {
			System.out.println("congrats, you clicked the button!");
			myFrame.getContentPane().setBackground(Color.RED);
		}
		else if (e.getSource().equals(this.greenButton)) {
			System.out.println("you clicked the green button");
			myFrame.getContentPane().setBackground(Color.GREEN);
		}
		else if (e.getSource().equals(this.blueButton)) {
			myFrame.getContentPane().setBackground(Color.BLUE);
		}
		else if (e.getSource().equals(this.pinkButton)) {
			myFrame.getContentPane().setBackground(Color.PINK);
			
		}
		else if (e.getSource().equals(this.magentaButton)) {
			myFrame.getContentPane().setBackground(Color.MAGENTA);
		}
		else if (e.getSource().equals(this.orangeBtn)) {
			myFrame.getContentPane().setBackground(Color.ORANGE);
		}
		else if (e.getSource().equals(this.cyanBtn)) {
			myFrame.getContentPane().setBackground(Color.CYAN);
		}
		
	}

}
