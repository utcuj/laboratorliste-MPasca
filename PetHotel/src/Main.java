public class Main {
	public static void main(String [] args) {
		PetHotel2 hotel = new PetHotel2();
		Dog dog1 = new Dog("Azorel", 2);
		Dog dog2 = new Dog("Ozzy", 4);
		Dog dog3 = new Dog("Bruno", 6);
		Dog dog4 = new Dog("Rex", 1);
		
		hotel.addDog(dog1, 1);
		hotel.addDog(dog2,  2);
		hotel.addDog(dog3,  3);
		hotel.addDog(dog4,  4);
		
		hotel.afisareCatei();
		
		hotel.addDog(dog2, 4);
		System.out.println();
		
		hotel.afisareCatei();
		System.out.println();

		hotel.afisareNumeCatei();
		System.out.println();

		hotel.afisareCamere();
	}
}
