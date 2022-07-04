package customerData;

public class Customer {
	
	String id, name, phone, discountType;
	
	public Customer(String id, String name, String phone, String discountType) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.discountType = discountType;
	}
	
	public String toString() {
		return "Name: "+this.name+" ID: "+this.id+" Phone: "+this.phone;
	}

}
