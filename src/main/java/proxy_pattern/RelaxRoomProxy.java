package proxy_pattern;

public class RelaxRoomProxy implements RelaxRoomState{

	@Override
	public boolean relaxRoomIsFull() {
		RelaxRoom room = new RelaxRoom();
		return room.relaxRoomIsFull();
	}

	@Override
	public int relaxRoomMaxCapacity() {
		RelaxRoom room = new RelaxRoom();
		return room.relaxRoomMaxCapacity();
	}

}
