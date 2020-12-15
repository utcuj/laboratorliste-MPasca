package facebook;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		Friend friend1 = new Friend("Mihai", "Brasov");
		Friend friend2 = new Friend("Simona", "Cluj - Napoca");
		Friend friend3 = new Friend("Andrei", "Oradea");
		Friend friend4 = new Friend("Dragos", "Cluj - Napoca");
		
		FacebookAccount profile = new FacebookAccount("Maria", 20, "Cluj - Napoca", new ArrayList<Friend>());
		profile.addFriend(friend1);
		profile.addFriend(friend2);
		profile.addFriend(friend3);
		profile.addFriend(friend4);
	}
}
