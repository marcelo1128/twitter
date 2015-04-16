package twitter;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class password extends JDialog implements ActionListener{
	JLabel labelName;
	JLabel labelPass;
	JTextField textName;
	JPasswordField passField;
	JButton okButton;
	JButton createButton;
	JButton cancelButton;
	JDialog dialog;
	shows1 show;
	JPanel panelThree;
	
	String randomuser="marcelo";
	String randompass="maldonado";

	
	public password() {
		JPanel panelOne = new JPanel();
		labelName = new JLabel("Name:");
		labelName.setForeground (Color.GREEN);
		textName = new JTextField(15);
		
		JPanel panelTwo = new JPanel();
		labelPass = new JLabel("Password:");
		labelPass.setForeground (Color.GREEN);
		passField = new JPasswordField(15);
		
		panelThree = new JPanel();
		panelThree.setLayout(null);
		okButton = new JButton("OK");
		createButton = new JButton("Create");
		cancelButton = new JButton("Cancel");
		okButton.addActionListener(this);
		createButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		panelThree.add(createButton);
		panelThree.add(okButton);
		panelThree.add(cancelButton);
		panelThree.add(labelPass);
		panelThree.add(passField);
		panelThree.add(labelName);
		panelThree.add(textName);
		
		
		//logo
		JLabel logo=new JLabel(new ImageIcon("logo.png"));
		panelThree.add(logo);
		logo.setBounds(150,0,700,750);
		
		createButton.setBounds(475,330,90,20);
		okButton.setBounds(430,300,90,20);
		cancelButton.setBounds(520,300,90,20);
		labelName.setBounds(365,240,100,20);
		labelPass.setBounds(365,270,100,20);
		textName.setBounds(425,240,188,25);
		passField.setBounds(425, 270, 188, 25);
		panelThree.setBackground(Color.black);
		
		show=new shows1();
		
		show.show(panelThree);
	  
		
		
  }
	  
	      public void actionPerformed(ActionEvent e) {
	          if (e.getSource() == okButton) {
	        	  //System.exit(0);
	        	  String username=textName.getText();
	        	  String password=String.valueOf(passField.getPassword());
	        	 
	        	  
	        	  if(username.equals(randomuser) && password.equals(randompass)){
	        		  System.out.println("user exist");
	        		  show.dialog.setVisible(false);
	        	  }
	        	  else{
	        		  System.out.println("user does not exist");
	        		
	        		  
	        	  }
	        	  
	          } else if (e.getSource() == cancelButton) {
	              System.exit(0);
	          }
	      }
	  
	      public String getUserName() {
	          return textName.getText();
	      }
	  
	      public String getPassword() {
	          return String.valueOf(passField.getPassword());
	      }
	      
	  
}
