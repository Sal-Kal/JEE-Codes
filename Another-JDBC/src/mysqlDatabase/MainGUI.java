package mysqlDatabase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainGUI extends JFrame implements ActionListener{
	
	JButton addRep, addCust;
	
	public MainGUI() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(new GridLayout(5,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addRep = new JButton("Add Representative");
		this.addRep.addActionListener((ActionListener)this);
		this.addCust = new JButton("Add Customer");
		this.addCust.addActionListener((ActionListener)this);
		this.add(addRep);
		this.add(addCust);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addRep) {
			RepresentativeGUI gui = new RepresentativeGUI(); 
		}
//		if(e.getSource() == addCust) {
//			CustomerGUI gui = new CustomerGUI(); 
//		}
	}

}
