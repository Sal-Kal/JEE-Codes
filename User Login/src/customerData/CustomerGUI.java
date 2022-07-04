package customerData;

import java.util.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class CustomerGUI extends JFrame implements ActionListener{
	JLabel name, new_id, new_name, new_phone, new_type;
	JTextField name_txt, new_id_txt, new_name_txt, new_phone_txt, new_type_txt, message;
	JButton goToItem, addCustomer;
	public CustomerGUI() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(10,2));
		this.name = new JLabel("Name");
		this.new_id = new JLabel("New ID");
		this.new_name = new JLabel("Name");
		this.new_phone = new JLabel("Phone");
		this.new_type = new JLabel("Type");
		this.name_txt = new JTextField();
		this.new_id_txt = new JTextField();
		this.new_name_txt = new JTextField();
		this.new_phone_txt = new JTextField();
		this.new_type_txt = new JTextField();
		this.message = new JTextField();
		this.goToItem = new JButton("Go to Items");
		this.goToItem.addActionListener((ActionListener)this);
		this.addCustomer = new JButton("Add");
		this.addCustomer.addActionListener((ActionListener)this);
		this.add(name);
		this.add(name_txt);
		this.add(goToItem);
		this.add(new_id);
		this.add(new_id_txt);
		this.add(new_name);
		this.add(new_name_txt);
		this.add(new_phone);
		this.add(new_phone_txt);
		this.add(new_type);
		this.add(new_type_txt);
		this.add(addCustomer);
		this.add(message);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == goToItem) {
			for(Customer c : CustomerList.getList()) {
				if(c.name.equals(name_txt.getText())) {
					ItemGUI gui = new ItemGUI(c.discountType);
				}
			}
		}
		else if(e.getSource() == addCustomer) {
			String id = new_id_txt.getText();
			String name = new_name_txt.getText();
			String phone = new_phone_txt.getText();
			String type = new_type_txt.getText();
			CustomerList.addCustomer(new Customer(id, name, phone, type));
			message.setText("Added Customer");
		}
	}
}
