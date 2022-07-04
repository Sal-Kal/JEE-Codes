package mysqlDatabase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RepresentativeGUI extends JFrame implements ActionListener{
	JLabel no, name, state, commission, rate;
	JTextField no_txt, name_txt, state_txt, commission_txt, rate_txt, message;
	JButton addCustomer, display;
	public RepresentativeGUI() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(new GridLayout(5,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.no = new JLabel("No");
		this.name = new JLabel("Name");
		this.state = new JLabel("State");
		this.commission = new JLabel("Commission");
		this.rate = new JLabel("Rate");
		this.no_txt = new JTextField();
		this.name_txt = new JTextField();
		this.state_txt = new JTextField();
		this.commission_txt = new JTextField();
		this.rate_txt = new JTextField();
		this.message = new JTextField();
		this.addCustomer = new JButton("Add");
		this.addCustomer.addActionListener((ActionListener)this);
		this.display = new JButton("Display");
		this.display.addActionListener((ActionListener)this);
		this.add(no);
		this.add(no_txt);
		this.add(name);
		this.add(name_txt);
		this.add(state);
		this.add(state_txt);
		this.add(commission);
		this.add(commission_txt);
		this.add(rate);
		this.add(rate_txt);
		this.add(addCustomer);
		this.add(display);
		this.add(message);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addCustomer) {
			try {
			Database.insertData(this.no_txt.getText(),this.name_txt.getText(),this.state_txt.getText(),this.commission_txt.getText(),this.rate_txt.getText());
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
		if(e.getSource() == display) {
			try {
			String result = Database.selectQuery();
			System.out.println(result);
			this.message.setText(result);
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
}
