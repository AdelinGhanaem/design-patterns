package proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class RestRoom implements RestRoomState{
	private List<Person> people = new ArrayList<Person>();
	private int limitSpace = 15;
	
	public void enterRestRoom(Person p){
		if(people.size() < 15){
			people.add(p);
			System.out.println("Welcome to the restroom.");
			return;
		}
		System.out.println("There is no space left in the restroom. Please try again.");
		return;
	}

	@Override
	public boolean restRoomIsFull() {
		if(people.size() >= 15){
			return true;
		}
		return false;
	}

	@Override
	public int restRoomMaxCapacity() {
		return 15;
	}
	
}
