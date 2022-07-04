package customerData;

import java.util.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class MainGUI extends JFrame implements ActionListener {

	JLabel name, password; 
	JButton login;
	JTextField message, name_txt, password_txt;
	public MainGUI() {
		this.setVisible(true);
		this.setSize(1000,1000);
		this.setLayout(new GridLayout(3,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.name = new JLabel("Name");
		this.password = new JLabel("Password");
		this.name_txt = new JTextField();
		this.password_txt = new JTextField();
		this.message = new JTextField();
		this.login = new JButton("Login");
		this.login.addActionListener((ActionListener)this);
		this.add(name);
		this.add(name_txt);
		this.add(password);
		this.add(password_txt);
		this.add(message);
		this.add(login);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.login) {
			if(name_txt.getText().equals("root") && password_txt.getText().equals("password")) {
				this.message.setText("Logged in");
				CustomerGUI gui = new CustomerGUI();
			}
			else {
				this.message.setText("Wrong Credentials");
			}
		}
	}
}
