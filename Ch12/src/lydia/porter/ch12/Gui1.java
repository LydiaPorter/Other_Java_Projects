package lydia.porter.ch12;
import javax.swing.*;
import java.awt.*;

public class Gui1 {

	public Gui1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//new instance of jframe class
		//new frame object
		FlowLayout flowlayout = new FlowLayout(); 
		//manages how screen lays out. takes elements, puts in center, flows across page as you add them.
		frame.setLayout(flowlayout); //pass in layout manager
		
		//let's specify and use some properties
		frame.setTitle("my first Gui!"); //setter
		frame.setSize(500,500);
		frame.setLocation(0,0); //top left corner
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel my_label = new JLabel("This is a label. This is text!");
		my_label.setText("new text that I changed");
		frame.add(my_label);
		my_label.setForeground(Color.blue); //text color
		
		JButton my_btn = new JButton("Don't click meeeeee!");
		JButton my_btn1 = new JButton("Don't click meeeeee!");
		JButton my_btn2 = new JButton("Don't click meeeeee!");
		JButton my_btn3 = new JButton("Don't click meeeeee!");
		JButton my_btn4 = new JButton("Don't click meeeeee!");
		JButton my_btn5 = new JButton("Don't click meeeeee!");
		
		
		
		frame.add(my_label);
		frame.add(my_btn);
		frame.add(my_btn1);
		frame.add(my_btn2);
		frame.add(my_btn3);
		frame.add(my_btn4);
		frame.add(my_btn5);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.pink);
		
		
		
		
	}

}
