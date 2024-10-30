package game;

import java.util.HashMap;

public class Rooms {	
	
	private String description;
	private Rooms north;
	private Rooms south;
	private Rooms east;
	private Rooms west;
	private Rooms up;
	private Rooms down;
	
	
	
	HashMap<String, String> item = new HashMap<String, String>();
	
	
	
	public Rooms(String desc) {
		description = desc;
	}
	
	public Item getItem() {
		item.get(item);
//		return item;
	}
	
	public void setItem(Item i) {
		item.put(item);
//		item = item[i];
	}
	
	public Item removeItem(Item item) {
		item.remove(item);
	}
	
	
	
	
	
	public String toString() {
		return description;
	}
	
	
	public Rooms getExit(char direction) {
		if (direction == 'n') {
			return north;
		} else if (direction == 's') {
			return south;
		} else if (direction == 'e') {
			return east;
		} else if (direction == 'w') {
			return west;
		} else if (direction == 'u') {
			return up;
		} else if (direction == 'd') {
			return down;
		} else {
			return null;
		}
			
	}
	
	
	public void addExit(Rooms Room, char direction) {
		if (direction == 'n') {
			north = Room;
		} else if (direction == 's') {
			south = Room;
		} else if (direction == 'e') {
			east = Room;
		} else if (direction == 'w') {
			west = Room;
		} else if (direction == 'u') {
			up = Room;
		} else if (direction == 'd') {
			down = Room;
		}
	}
	
	
}
