package proxy_pattern;

public class RestRoomProxy implements RestRoomState{

	@Override
	public boolean restRoomIsFull() {
		RestRoom room = new RestRoom();
		return room.restRoomIsFull();
	}

	@Override
	public int restRoomMaxCapacity() {
		RestRoom room = new RestRoom();
		return room.restRoomMaxCapacity();
	}

}
