package customerData;

public class Item {
	
	String name, id;
	float price;
	
	public Item(String id, String name, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public String toString() {
		return "Name: "+this.name+" Price: "+this.price;
	}

}
