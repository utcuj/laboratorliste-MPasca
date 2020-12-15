

import java.util.ArrayList;
import java.util.List;

public class Sala {
	private int capacity;
	private String id;
	private List<Film> films = new ArrayList<>();
	
	public Sala(String id, int capacity, List<Film> films) {
		this.id = id;
		this.capacity = capacity;
		this.films = films;
	}
	
	public void addFilm(Film film) {
		this.films.add(film);
	}
	
	public void removeFilm(Film film) {
		this.films.remove(film);
	}
	
	public void searchByGenre(String genre) {
		System.out.println("Genre: " + genre);
		for(Film f: this.films) {
			if(f.getGenre() == genre) {
				System.out.println(f.getName());
			}
		}
	}
	
	public void printFilms() {
		System.out.println(this.id);
		for(Film f: this.films) {
			System.out.println(f.toString());
		}
	}
}
