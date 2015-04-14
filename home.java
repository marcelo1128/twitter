package twitter;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class home extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
		
	
	User currentUser=new User();
	
	//JLabel instructions = new JLabel("<html>Follow the instructions on the <br> exam to use this program<html>");

	JLabel labelsearch;
	//JLabel labelPass;
	JTextField textsearch;
	JPasswordField passField;
	JButton hometab;
	JButton notificationtab;
	JButton messages;
	JButton searchB;
	JPanel panelThree;
	JDialog dialog;
	text stuff;
	JLabel instructions=new JLabel();
	JScrollPane scrollPane;
	JTextArea textforTweet;
	ArrayList message=new ArrayList();
	
	
	public void userMessages(ArrayList stringMessages){
		message=stringMessages;
	}
	
	public void loginUser(User current){
		currentUser=current;
 
		//showmain.dispose();
		System.out.println(currentUser.getUsername());
		System.out.println("<html>welcome!"+currentUser.getUsername()+"<br>"+currentUser.getTweetc()+" "+currentUser.getFollowing()+" "+currentUser.getFollowers()+ "<html>");
		
		instructions.setText("<html>welcome!"+currentUser.getUsername()+"<br>"+currentUser.getTweetc()+" "+currentUser.getFollowing()+" "+currentUser.getFollowers()+ "<html>");

		instructions.setBounds(0,0,200,200);
		
		panelThree.add(instructions);
		showmain.show(panelThree);
	
		
		
	}
	

	//shows the graphics 
	shows1 showmain=new shows1();
	public home() {
		
		panelThree = new JPanel();
		panelThree.setLayout(null);
		//makes buttons
		hometab = new JButton("HOME");
		
		notificationtab = new JButton("NOTIFICATIONS");
		
		messages = new JButton("MESSAGES");
		
		textsearch = new JTextField(25);
		searchB=new JButton("Search");
		

	 
		System.out.println("yo wtf?");

		
		
		//sets location of buttons
		
		hometab.setBounds(0,50,90,20);
		notificationtab.setBounds(90,50,120,20);
		messages.setBounds(210,50,100,20);
		searchB.setBounds(787,50,80,25);
		textsearch.setBounds(860, 50, 160, 25);
		
		//action listener, for userinterface
		hometab.addActionListener(this);
		notificationtab.addActionListener(this);
		messages.addActionListener(this);
		searchB.addActionListener(this);
		
		//adds it to the gui
		
		panelThree.add(hometab);
		panelThree.add(notificationtab);
		panelThree.add(messages);
		panelThree.add(searchB);
		panelThree.add(textsearch);
		
		String text = "stuff needs to be printed out here";
		String text1=" what's on your mind........";
		JTextArea textArea2 = new JTextArea(text, 5, 10);
		//textArea2.setPreferredSize(new Dimension(100, 100));
	    scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
	    textforTweet = new JTextArea(text1, 5, 10);
	    JButton text3 = new JButton("Tweet");
		text3.setBounds(704,176,90,20);
		textforTweet.setBounds(280,75,513,100);
		

	    textforTweet.setLineWrap(true);
	    textArea2.setLineWrap(true);
		   
		scrollPane.setBounds(280,200,510,510);
		
	
		
		//RectDraw triangle4=new RectDraw();
	//	triangle4.setBounds(10,0,5000,5000);
	//	triangle4.setBackground(Color.CYAN);
		panelThree.setBackground(Color.CYAN);
		// panelThree.add(textArea2);
		panelThree.add(scrollPane);
		panelThree.add(text3);
		panelThree.add(textforTweet);
		
  }		
	
	
		
		
	      public void actionPerformed(ActionEvent e) {
	          if (e.getSource() == hometab) {
	        	  showmain.dispose();
		      	   
	        	  panelThree.remove(instructions);
	        	  this.loginUser(currentUser);
	        	 
	        	 
	              
	          }else if (e.getSource() == notificationtab) {
	              System.exit(0);
	          }
	          else if (e.getSource() == messages) {
	              System.exit(0);
	          }
	          else if (e.getSource() == searchB) {
	              System.exit(0);
	          }
	      }
	  
	      public JDialog getDialog(){
	    	  return dialog;
	    	  
	      }
	      public JPanel getPanel(){
	    	  return panelThree;
	    	  
	      }
}