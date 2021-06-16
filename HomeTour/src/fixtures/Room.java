package fixtures;

import java.util.Arrays;

public class Room extends Fixture {
	
	private Room[] exits;
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3];
		}
	
	public Room[] getExits() {
		
	}
	
	public Room getExit(String direction) {
		
	}
	
	public Room[] exits = new Room[2];
	// left exit, right exit
	
	public Room(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + "]";
	}

	public Room getLeftExit() {
		return exits[0];
	}
	 public Room getRightExit(Room exit) {
		 return exits[1];
	 }
	 
	 public void setRightExit(Room exit) {
		 exits[1] = exit;
	 }
	 public void setLeftExit(Room exit) {
		 exits[0] = exit;
	 }
}
