package defaultpackage;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFrameAndJPanel extends JFrame{
	
	JPanel panel1,panel2;//reference
	JButton button1,button2;
	
	public JFrameAndJPanel() {
		
		panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		panel1.setBounds(10,50,200,200);
		
		button1 = new JButton("Click me");
		panel1.add(button1);
		button1.setBackground(Color.RED);
		
		
		panel2 = new JPanel();
		panel2.setBackground(Color.GREEN);
		panel2.setBounds(220,50,200,200);
		
		button2 = new JButton("Click me");
		panel2.add(button2);
		button2.setBackground(Color.YELLOW);
		
		setLayout(null);
		add(panel1);
		add(panel2);//added to JFrame
		setTitle("Frame Title");
		setSize(450,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameAndJPanel();//JFrame is created in memory
	}

}
