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
	JButton cancelButton;
	JDialog dialog;
	shows1 show;
	public password() {
		JPanel panelOne = new JPanel();
		labelName = new JLabel("Name");
		textName = new JTextField(15);
		
		JPanel panelTwo = new JPanel();
		labelPass = new JLabel("Password");
		passField = new JPasswordField(15);
		
		JPanel panelThree = new JPanel();
		panelThree.setLayout(null);
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);
		panelThree.add(okButton);
		panelThree.add(cancelButton);
		panelThree.add(labelPass);
		panelThree.add(passField);
		panelThree.add(labelName);
		panelThree.add(textName);
		
		okButton.setBounds(0,50,90,20);
		cancelButton.setBounds(90,50,120,20);
		labelPass.setBounds(210,50,100,20);
		textName.setBounds(787,50,80,25);
		passField.setBounds(860, 50, 160, 25);
		
		
		show=new shows1();
		
		show.show(panelThree);
	  
		
		
  }
	  
	      public void actionPerformed(ActionEvent e) {
	          if (e.getSource() == okButton) {
	        	  System.exit(0);
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
