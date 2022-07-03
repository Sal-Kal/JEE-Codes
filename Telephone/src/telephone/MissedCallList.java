package telephone;

import java.util.*;

public class MissedCallList {

	public static ArrayList<MissedCall> mcList = new ArrayList<MissedCall>();
	
	public static void addMissedCall(MissedCall mc) {
		if(mcList.size() == 10) {
			mcList.remove(0);
			mcList.add(mc);
			System.out.println("Missed Call added");
		}
		else {
			mcList.add(mc);
			System.out.println("Missed Call added");
		}
	}
	
	public static void getMissedCalls(){
		System.out.println();
		Iterator<MissedCall> it = mcList.iterator();
		while(it.hasNext()) {
			MissedCall mc = it.next();
			System.out.println("Name : "+mc.name+" No. : "+mc.no);
			System.out.println("Date Time : "+mc.dateTime);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void deleteMissedCall(String no) {
		int index = 0;
		boolean found = false;
		Iterator<MissedCall> it = mcList.iterator();
		while(it.hasNext()) {
			if(it.next().no.equals(no)) {
				found = true;
				break;
			}
			index++;
		}
		if(!found) {
			System.out.println("No such call");
		}
		else {
			mcList.remove(index);
		}
	}
	
}
