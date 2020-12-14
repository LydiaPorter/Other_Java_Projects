package lydia.porter.ch12;

import javax.swing.*;
import java.awt.*;

public class Layouts {
	//class level so all have access to them
	JFrame myFrame;
	JPanel contentPane; //gives access to default contentPane
	
	public Layouts() {
		myFrame = new JFrame(); //create JFrame window 
		contentPane = new JPanel(); //create a new contentPane
		myFrame.setContentPane(contentPane); //replace old JPanel w/ new one
		
		myFrame.setLayout(new FlowLayout()); //option 1: easy, but limitation: no access to the layout manager
	
		FlowLayout flowlayout = new FlowLayout(); //option 2: you now have access to the layout manager; create layout manager as an object
		GridLayout grid = new GridLayout(3,2,5,10); //how many. rows, columns, how many pixels in between columns, between rows
		grid.setHgap(20);// horizontal gap
		grid.setVgap(20);// vertical gap
		BorderLayout border1 = new BorderLayout(); //have to specify where to put each button
		BorderLayout border2 = new BorderLayout(5,10); //space between buttons
		BoxLayout boxlayout1 = new BoxLayout(contentPane, BoxLayout.Y_AXIS); //reference parent container (ex: content pane), layout axis
		BoxLayout boxlayout2 = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		
		
		contentPane.setLayout(boxlayout1); //SETS THE LAYOUT MANAGER	
		//we could put it on the content pane if you want. you can make as many content panes as you want and set different layouts to them
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(300, 500); 
		myFrame.setLocation(200, 200); 

		/*for (int i = 0; i < 10; i++) { //creates an int, set to 0, add one, loop through
			myFrame.add(new JButton("button"+(i+1))); //+1 so it's not "button 0"		
		}*/

		/* border layout button creation
		myFrame.add(new JButton("button 1"),border2.PAGE_START);
		myFrame.add(new JButton("button 2"),border2.PAGE_END);
		myFrame.add(new JButton("button 3"),border2.LINE_START);
		myFrame.add(new JButton("button 4"),border2.LINE_END);
		myFrame.add(new JButton("button 5"),border2.CENTER);
		*/
		//Y-Layout: lays things down the y-axis.
		JButton btn1 = new JButton("button 1");
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		myFrame.add(btn1);
		JButton btn2 = new JButton("button 2");
		btn2.setAlignmentX(Component.TOP_ALIGNMENT);
		myFrame.add(btn2);
		JButton btn3 = new JButton("button 3");
		btn3.setAlignmentX(Component.LEFT_ALIGNMENT);
		myFrame.add(btn3);
		JButton btn4 = new JButton("button 4");
		btn4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		myFrame.add(btn4);
		JButton btn5 = new JButton("button 5");
		btn5.setAlignmentX(Component.BOTTOM_ALIGNMENT);
		myFrame.add(btn5);
		
		myFrame.setVisible(true); //IMPORTANT
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
