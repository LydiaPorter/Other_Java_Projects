package phoneDialer;
//Lydia Porter
//dec 30, 2020
//Java

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class PhoneDialer implements ActionListener{
	//member variables
	//numbers you can dial
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn0;
	JButton btnDash;
	JButton dialNumBtn;
	String theNum = ""; //phone number dialed
	JLabel enter;
	JPanel numHolderPanel;
	
	public PhoneDialer() {
		JFrame dialFrame = new JFrame();
		dialFrame.setTitle("Dialer");
		dialFrame.setSize(200,250);
		dialFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel myPanel = (JPanel)dialFrame.getContentPane();
		myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
		Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		myPanel.setBorder(myBorder);
		
		JPanel myPanel2 = new JPanel();
		myPanel2.setLayout(new FlowLayout());
		
		enter = new JLabel("Enter your number to dial:");
		myPanel2.add(enter);
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7  = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnDash = new JButton("-");
		dialNumBtn = new JButton("Dial number");
		dialNumBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		theNum = new String();
		
		numHolderPanel = new JPanel();
		numHolderPanel.setLayout(new GridLayout (4,3,5,5));
		Border numPanelBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		numHolderPanel.setBorder(numPanelBorder);
		numHolderPanel.add(btn1);
		btn1.addActionListener(this);
		numHolderPanel.add(btn2);
		btn2.addActionListener(this);
		numHolderPanel.add(btn3);
		btn3.addActionListener(this);
		numHolderPanel.add(btn4);
		btn4.addActionListener(this);
		numHolderPanel.add(btn5);
		btn5.addActionListener(this);
		numHolderPanel.add(btn6);
		btn6.addActionListener(this);
		numHolderPanel.add(btn7);
		btn7.addActionListener(this);
		numHolderPanel.add(btn8);
		btn8.addActionListener(this);
		numHolderPanel.add(btn9);
		btn9.addActionListener(this);
		numHolderPanel.add(btnDash);
		btnDash.addActionListener(this);
		numHolderPanel.add(btn0);
		btn0.addActionListener(this);
		
		
		
		myPanel.add(myPanel2);
		myPanel.add(numHolderPanel);
		myPanel.add(dialNumBtn);
		dialNumBtn.addActionListener(this);
		
		dialFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new PhoneDialer(); //new instance of class
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.dialNumBtn)) { 
			JOptionPane.showMessageDialog(null,"Dialing: "+theNum+"");
		}
		else if (e.getSource().equals(this.btn1)) {
			//JOptionPane.showMessageDialog(null,"1");
			theNum += "1";
		}
		else if (e.getSource().equals(this.btn2)) { 
			theNum += "2";
		}
		else if (e.getSource().equals(this.btn3)) { 
			theNum += "3";
		}
		else if (e.getSource().equals(this.btn4)) { 
			theNum += "4";
		}
		else if (e.getSource().equals(this.btn5)) { 
			theNum += "5";
		}
		else if (e.getSource().equals(this.btn6)) { 
			theNum += "6";
		}
		else if (e.getSource().equals(this.btn7)) { 
			theNum += "7";
		}
		else if (e.getSource().equals(this.btn8)) { 
			theNum += "8";
		}
		else if (e.getSource().equals(this.btn9)) { 
			theNum += "9";
		}
		else if (e.getSource().equals(this.btn0)) { 
			theNum += "0";
		}
		else if (e.getSource().equals(this.btnDash)) { 
			theNum += "-";
		}
		//clear theNum string so you can try again
	}
}