package twitter;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class text extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private String stuff;
	private int locationx;
	private int locationy;
	

	
	public text(String stuff,int locationx,int locationy) {
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	   // setSize(300,200);
	   // setLocation(100, 100);
	    ///JLabel label1 = new JLabel();
	   // label1.setText("yoooooooooo");
	   // label1.setBounds(locationx, locationy,200,50);
	    /*JLabel label2 = new JLabel();
	    label2.setText("<html><h1>header1 text</h1></html>");
	    label2.setBounds(0, 20, 200, 50);
	    JLabel label3 = new JLabel();
	    label3.setText("<html><h2>header2 text</h2></html>");
	    label3.setBounds(0, 40, 200, 50);
	    JLabel label4 = new JLabel();
	    label4.setText("<html><h3>header3 text</h3></html>");
	    label4.setBounds(0, 60, 200, 50);
*/	
	    //add(label1);
	
	    //add(label2);
	    //add(label3);
	    //add(label4);

	    //setVisible(true);
	   }
	/*
	public void paint()
	{
		
	   g.drawString(stuff, locationx,locationy);
	}
	 */
	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public int getLocationy() {
		return locationy;
	}

	public void setLocationy(int locationy) {
		this.locationy = locationy;
	}

	public int getLocationx() {
		return locationx;
	}

	public void setLocationx(int locationx) {
		this.locationx = locationx;
	}
	public void print(){
		System.out.println(stuff);
		System.out.println(locationx);
		System.out.println(locationy);
	}
	
}
