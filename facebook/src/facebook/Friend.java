package facebook;

public class Friend {
	private String name;
	private String currentLocation;
	
	public Friend(String name, String currentLocation) {
		this.name = name;
		this.currentLocation = currentLocation;
	}

	
	public boolean equals(Object o) {
		if(this.name.equals(((Friend)o).getName())) {
			if(this.currentLocation.equals(((Friend)o).getName())) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}
	
}
