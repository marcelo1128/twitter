package twitter;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class shows1{


	private static final long serialVersionUID = 1L;

	
	JDialog dialog;
	JPanel b;
	Object using;
	
	public void show(JPanel b){
	dialog = new JDialog();
	using=new Object();
	
	dialog.setResizable(true);
		
	//dialog.getContentPane().add(stuff);
	//dialog.getContentPane().add(search);
	//dialog.getContentPane().setLayout(new FlowLayout());
	dialog.getContentPane().add(b);
	dialog.setTitle("Welcome to twitter");
		
		
 
	dialog.setSize(1080, 750);
	dialog.setLocationRelativeTo(null); // place in center of screen
	dialog.setBackground(Color.CYAN);
		
		
	dialog.setModal(true);
		
	dialog.setVisible(true);
	
	}
	public void dispose(){
		dialog.dispose();
	}
}