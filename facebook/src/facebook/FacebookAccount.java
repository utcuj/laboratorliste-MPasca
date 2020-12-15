package facebook;

import java.util.List;
import java.util.ArrayList;

public class FacebookAccount {
	private String name;
	private int age;
	private String currentLocation;
	private List<Friend> friends = new ArrayList();
	
	public FacebookAccount(String name, int age, String currentLocation, List<Friend> friends) {
		this.name = name;
		this.age = age;
		this.currentLocation = currentLocation;
		this.friends = friends;
	}
	
	public void addFriend(Friend friend) {
		this.friends.add(friend);
	}
	
	public void removeFriend(Friend friend) {
		this.friends.remove(friend);
	}
	
	public List<Friend> searchFriend(String location){
		List<Friend>foundFriends = new ArrayList();
		for(Friend f: this.friends) {
			if(f.getCurrentLocation() == location) {
				foundFriends.add(f);
			}
		}
		return foundFriends;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
}
