package customerData;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ItemGUI extends JFrame implements ActionListener{
	
	JLabel item, quantity;
	JTextField item_txt, quantity_txt, message;
	JButton calculate, check_out;
	String type;
	public static float price;

	public ItemGUI(String type) {
		this.type = type;
		price = 0;
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new GridLayout(10,2));
		this.item = new JLabel("Item");
		this.quantity = new JLabel("Quantity");
		this.item_txt = new JTextField();
		this.quantity_txt = new JTextField();
		this.message = new JTextField();
		this.calculate = new JButton("Bill");
		this.calculate.addActionListener((ActionListener)this);
		this.check_out = new JButton("Check out");
		this.check_out.addActionListener((ActionListener)this);
		this.add(item);
		this.add(item);
		this.add(item_txt);
		this.add(quantity);
		this.add(quantity_txt);
		this.add(calculate);
		this.add(message);
		this.add(check_out);
	}
	
	public void actionPerformed(ActionEvent e) {
		float temp;
		String item = item_txt.getText();
		if(e.getSource() == calculate) {
			item = item_txt.getText();
			for(Item i : ItemList.getList()) {
				if(i.name.equals(item)) {
					temp = i.price * Integer.parseInt(this.quantity_txt.getText());
					price = price + temp;
					System.out.println(price);
					System.out.println(price);
//					if(this.type.equals("regular")) {
//						float discount = price * 0.07f;
//						price = price - discount;
//						System.out.println(price);
//						String p = Float.toString(price);
//						message.setText("Price after discount: "+p);
//					}
//					else if(this.type.equals("special")) {
//						float discount = price * 0.1f;
//						price = price - discount;
//						System.out.println(price);
//						String p = Float.toString(price);
//						message.setText("Price after discount: "+p);
					}
					break;
				}
			}
		if(e.getSource() == check_out) {
			String options[]  = {"10%","20%"};
			int x = JOptionPane.showOptionDialog(null, "Enter type of discount", "Choose Discount", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(x == 0) {
				JOptionPane.showMessageDialog(null, "You need to pay: "+(price - price*0.1f));
			}
			if(x == 1) {
				JOptionPane.showMessageDialog(null, "You need to pay: "+(price - price*0.2f));
			}
		}
		}
	}

