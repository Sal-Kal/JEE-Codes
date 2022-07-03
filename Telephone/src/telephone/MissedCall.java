package telephone;

import java.time.LocalDateTime;

public class MissedCall {
	String name = "Private Caller";
	String no;
	LocalDateTime dateTime;
	
	public MissedCall(String no) {
		this.no = no;
		this.dateTime = LocalDateTime.now();
		for(Contact i : ContactList.getContacts()) {
			if(i.no.equals(no)) {
				this.name = i.name;
				break;
			}
		}
	}
}
