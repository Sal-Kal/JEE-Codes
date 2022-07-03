package telephone;

import java.util.*;

public class TelephoneClient {
	public static void main(String[] args) {
		int i = 1;
		int ch;
		String name, no;
		Scanner sc = new Scanner(System.in);
		while(i == 1) {
			System.out.println("Enter 1: To add a new Contact");
			System.out.println("Enter 2: To delete a Contact");
			System.out.println("Enter 3: To display all Contacts");
			System.out.println("Enter 4: To add a new Missed Call");
			System.out.println("Enter 5: To delete a Missed Call");
			System.out.println("Enter 6: To display all Missed Calls");
			System.out.println("Enter 7: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter a name and phone no.");
					name = sc.next();
					no = sc.next();
					ContactList.addContact(new Contact(name, no));
					break;
			case 2: System.out.println("Enter a name");
					name = sc.next();
					ContactList.deleteContact(name);
					break;
			case 3: ContactList.printContacts();
					break;
			case 4: System.out.println("Enter a phone no.");
					no = sc.next();
					MissedCallList.addMissedCall(new MissedCall(no));
					break;
			case 5: MissedCallList.deleteMissedCall();
					break;
			case 6: MissedCallList.getMissedCalls();
					break;
			case 7: i = 0;
					break;
			default: System.out.println("Entered wrong choice");
					 break;
			}
		}
		sc.close();
	}
}
