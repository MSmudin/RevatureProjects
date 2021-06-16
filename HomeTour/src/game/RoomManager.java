package game;

public class RoomManager {

	private Room startingRoom;
	Room[] allRooms;
	
	/*public void init() {
		Room kit = new Room("kit");
		Room lr = new Room("lr");
		
		allRooms = newRoom[2];
		allRooms[0] = kit;
		allRooms[1] = lr;
		
		lr.setRightExit(kit);
		
		kit.setLeftExit(lr);
	/*
	 * }
	 */
	
	public void init() {
		Room kitchen = new Room(
				"The Kitchen",
				"a cluttered kitchen",
				"This will be a long description about the kitchen");
		this.rooms[0] = kitchen;
		this.startingRoom = kitchen;
		
		
		Room livingRoom = new Room(
				"The Living Room",
				""
	}
}
