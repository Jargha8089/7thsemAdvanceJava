package defaultpackage;

import javax.swing.JButton;
import javax.swing.JFrame;//swing
import javax.swing.JButton;
import javax.swing.JFrame;//swing
import javax.swing.JButton;
import javax.swing.JFrame;//swing


public class ConceptOfContainerAndComponent {
	JFrame frame;//object frame create in memory
	JButton button;//reference-no memory allocation
	JButton button1;
	
	public ConceptOfContainerAndComponent() {
		frame = new JFrame();//container-main window
		button = new JButton("Click me");//memory allocated-installation
		button1 = new JButton("Dont Click me");//for next button
		
		frame.add(button);//component added to container
		
		frame.add(button1);//for next button
		
		frame.setTitle("First Window");
		frame.setBounds(300,300,400,400);//shown 300,300 of screen position
		frame.setLayout(null);//no default layout(Border Layout)
		
		button.setBounds(50,20,200,50);//x,y,width,height of JFrame
		
		button1.setBounds(50,100,200,50);//for next button
		
		frame.setSize(300,600);//width and height
		frame.setVisible(true);//showing frame above screen
	}

	public static void main(String[] args) {
		new ConceptOfContainerAndComponent();// constructor called
	}

}
