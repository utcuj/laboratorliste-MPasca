
public class Film {
	private String name;
	private String genre;
	private int duration;
	private int year;
	
	public Film(String name, int year, String genre, int duration) {
		this.name = name;
		this.genre = genre;
		this.duration = duration;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return this.name + " (" + this.year + "), genre: " + this.genre + ", duration: " + this.duration + " min;";
	}
}
