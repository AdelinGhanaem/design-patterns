package proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class RelaxRoom implements RelaxRoomState{
	private List<Person> people = new ArrayList<Person>();
	private int capacity = 15;
	
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
	public boolean relaxRoomIsFull() {
		if(people.size() >= capacity){
			return true;
		}
		return false;
	}

	@Override
	public int relaxRoomMaxCapacity() {
		return 15;
	}
	
	public void cleanRoom(){
		System.out.println("The room has been cleaned");
	}
}
