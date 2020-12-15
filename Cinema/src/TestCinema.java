import java.util.ArrayList;

public class TestCinema {
	public static void main(String [] args) {
		Film film1 = new Film("Fantastic Mr. Fox", 2009, "Animation", 97);
		Film film2 = new Film("Merry Christmas, Mr. Lawrence", 1983, "Drama", 145);
		Film film3 = new Film("Isle of Dogs", 2018, "Animation", 105);
		Film film4 = new Film("The Farewell", 2019, "Drama", 100);
		
		Sala sala = new Sala("E1", 120, new ArrayList<Film>());
		
		sala.addFilm(film1);
		sala.addFilm(film2);
		sala.addFilm(film3);
		sala.addFilm(film4);
		
		sala.printFilms();
		
		System.out.println();
		sala.searchByGenre("Animation");
		
		System.out.println();
		sala.searchByGenre("Drama");
	}
}
