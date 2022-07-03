package telephone;

import java.util.*;

public class ContactList {
	public static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public static void addContact(Contact c) {
		contacts.add(c);
	}
	
	public static ArrayList<Contact> getContacts(){
		return contacts;
	}
	
	public static void printContacts() {
		System.out.println();
		Iterator<Contact> it = contacts.iterator();
		while(it.hasNext()) {
			Contact c = it.next();
			System.out.println("Name : "+c.name+" No. : "+c.no);
		}
		System.out.println();
	}
	
	public static void deleteContact(String name) {
		int index = 0;
		boolean found = false;
		Iterator<Contact> it = contacts.iterator();
		while(it.hasNext()) {
			if(it.next().name.equals(name)) {
				found = true;
				break;
			}
			index++;
		}
		if(!found) {
			System.out.println("No such contact");
		}
		else {
			contacts.remove(index);
		}
	}
}
