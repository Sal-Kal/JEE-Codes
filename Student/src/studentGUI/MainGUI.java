package studentGUI;

import java.util.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class MainGUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public JTextArea area;
	public JLabel name,usn,address,age,gpa1,gpa2,gpa3,gpa4,gpa5,gpa6,gpa7,gpa8,cat;
	public JTextField txtname,txtusn,txtaddr,txtage,txtg1,txtg2,txtg3,txtg4,txtg5,txtg6,txtg7,txtg8;
	public JComboBox<String> category;
	public JButton submit,display;
	public String cats[]= {"GM","BC","SC"};
	public MainGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(420, 420);
		this.setLayout(new GridLayout(5,2));
		name = new JLabel("Name");
		usn = new JLabel("USN");
		address = new JLabel("Address");
		age = new JLabel("Age");
		gpa1 = new JLabel("SGPA-1");
		gpa2 = new JLabel("SGPA-2");
		gpa3 = new JLabel("SGPA-3");
		gpa4 = new JLabel("SGPA-4");
		gpa5 = new JLabel("SGPA-5");
		gpa6 = new JLabel("SGPA-6");
		gpa7 = new JLabel("SGPA-7");
		gpa8 = new JLabel("SGPA-8");
		cat = new JLabel("Category");
		txtname = new JTextField();
		txtusn = new JTextField();
		txtaddr = new JTextField();
		txtage = new JTextField();
		txtg1 = new JTextField();
		txtg2 = new JTextField();
		txtg3 = new JTextField();
		txtg4 = new JTextField();
		txtg5 = new JTextField();
		txtg6 = new JTextField();
		txtg7 = new JTextField();
		txtg8 = new JTextField();
		submit = new JButton("Submit");
		display = new JButton("Display");
		category = new JComboBox<String>(cats);
		area = new JTextArea();
		add(name);
		add(txtname);
		add(usn);
		add(txtusn);
		add(address);
		add(txtaddr);
		add(age);
		add(txtage);
		add(cat);
		add(category);
		add(gpa1);
		add(txtg1);
		add(gpa2);
		add(txtg2);
		add(gpa3);
		add(txtg3);
		add(gpa4);
		add(txtg4);
		add(gpa5);
		add(txtg5);
		add(gpa6);
		add(txtg6);
		add(gpa7);
		add(txtg7);
		add(gpa8);
		add(txtg8);
		add(submit);
		add(display);
		add(area);
		display.addActionListener((ActionListener)this);
		submit.addActionListener((ActionListener)this);
	}

	public void actionPerformed(ActionEvent ev) {
		float[] gpa = new float[8];
		gpa[0] = Float.parseFloat(txtg1.getText());
		gpa[1] = Float.parseFloat(txtg2.getText());
		gpa[2] = Float.parseFloat(txtg3.getText());
		gpa[3] = Float.parseFloat(txtg4.getText());
		gpa[4] = Float.parseFloat(txtg5.getText());
		gpa[5] = Float.parseFloat(txtg6.getText());
		gpa[6] = Float.parseFloat(txtg7.getText());
		gpa[7] = Float.parseFloat(txtg8.getText());
		if(ev.getSource()==submit) {
			int age=0;
			try {
				age = Integer.parseInt(txtage.getText());
				if(age<0 || age>100)		
				{
					JOptionPane.showMessageDialog(null, "reenter age");
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "reenter age");
			}
			Student s = new Student(
					txtname.getText(),
					txtusn.getText(),
					Integer.parseInt(txtage.getText()),
					txtaddr.getText(),
					(String) category.getItemAt(category.getSelectedIndex()),
					gpa
					);
			
			s.setCGPA();
			StudentList.addStudent(s);
			
		}
		if(ev.getSource()==display) {	
			area.setText("");
			ArrayList<Student> slist = StudentList.getList();
			for(Student i : slist) 
				{
					area.setText(area.getText()+i+"\n");
					System.out.println(i);
				}
		}
	}
	public static void main(String[] args) {
		MainGUI gui = new MainGUI();
	}
}
