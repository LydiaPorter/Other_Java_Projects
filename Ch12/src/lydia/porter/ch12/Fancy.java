package lydia.porter.ch12;

import javax.swing.*;
import java.awt.*;

public class Fancy { //FOUR CONTENT PANES!
	JFrame myFrame;
	JPanel TLContentPane; //top left: grid
	JPanel TRContentPane;//top right: border
	JPanel BLContentPane; //bottom left: y/flow?
	JPanel BRContentPane;//bottom right: flow/x

	JPanel mainContentPane;
	public Fancy() {
		myFrame = new JFrame();
		TLContentPane = new JPanel();
		TRContentPane = new JPanel();
		BLContentPane = new JPanel();
		BRContentPane = new JPanel();
		
		myFrame.add(TLContentPane);
		myFrame.add(TRContentPane);
		myFrame.add(BLContentPane);
		myFrame.add(BRContentPane);
		
		//CREATE GRID LAYOUT
		GridLayout grid = new GridLayout(3,2);
		//CREATE BORDER LAYOUT
	//	BorderLayout border = new BorderLayout();
		//myFrame.add(new JButton("button 1"),border.PAGE_START);
		//myFrame.add(new JButton("button 2"),border.PAGE_END);
		//myFrame.add(new JButton("button 3"),border.LINE_START);
		//myFrame.add(new JButton("button 4"),border.LINE_END);
		//myFrame.add(new JButton("button 5"),border.CENTER);
		
		TLContentPane.setLayout(grid); //SETS THE LAYOUT MANAGER	
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 500); 
		myFrame.setLocation(200, 200); 
		//different content panes for different sections of grid
		//1: grid, 2: border, 3: y, 4: flow/x
		//add components to content panes, not frames/windows
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Fancy();

	}

}
