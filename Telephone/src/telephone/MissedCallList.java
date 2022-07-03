package telephone;

import java.util.*;

public class MissedCallList {

	public static Queue<MissedCall> mcList = new LinkedList<MissedCall>();
	
	public static void addMissedCall(MissedCall mc) {
		if(mcList.size() == 10) {
			mcList.poll();
			mcList.offer(mc);
			System.out.println("Missed Call added");
		}
		else {
			mcList.offer(mc);
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
	
	public static void deleteMissedCall() {
		mcList.poll();
	}
	
}
