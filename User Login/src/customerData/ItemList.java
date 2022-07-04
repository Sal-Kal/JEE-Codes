package customerData;

import java.util.*;

public class ItemList {
	
	public static ArrayList<Item> items = new ArrayList<Item>();
	
	public ItemList() {
		items.add(new Item("001","apples",20));
		items.add(new Item("002","oranges",30));
		items.add(new Item("003","bananas",10));
		items.add(new Item("004","peaches",40));
		items.add(new Item("005","mangoes",60));
		items.add(new Item("006","guavas",50));
	}
	
	public static ArrayList<Item> getList() {
		return items;
	}

}
