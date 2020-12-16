package twoColorButtons;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ColoredButtons {
		JFrame myFrame;
		JButton redButton;
		JButton greenButton;
		FlowLayout myLayout;
	   
	  public ColoredButtons() {
		// create new JFrame
	   myFrame = new JFrame();

	    // set the frame title, size, location
	    myFrame.setTitle("Choose Your Color");
	    myFrame.setSize(550, 150);
	    myFrame.setLocation(200, 300);

	    // make sure program terminates when window is closed
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // assign a layout
	    myLayout = new FlowLayout();
	    myFrame.setLayout(myLayout);

	    // create and add buttons to the frame
	    redButton = new JButton("Red");
	    greenButton = new JButton("Green");

	    	    
	    myFrame.add(redButton);
	    myFrame.add(greenButton);

	    // make the frame visible
	    myFrame.setVisible(true);
	    
	    
	   
	    
	}

	public static void main(String[] args) {
		 new ColoredButtons();

	}

}
