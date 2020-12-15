import java.util.HashMap;
import java.util.Map.Entry;

public class PetHotel2 {
	private HashMap<Integer, Dog> registru = new HashMap<>();
	
	public void addDog(Dog dog, int key) {
		registru.put(key,  dog);
	}
	
	public void afisareCatei() {
		for(Entry<Integer, Dog> entry: registru.entrySet()) {
			System.out.println("Room number: " + entry.getKey());
			System.out.println("Dog: " + entry.getValue().getName() + " age: " + entry.getValue().getAge());
		}
	}
	
	public void afisareNumeCatei() {
		for(Dog d: registru.values()) {
			System.out.println("Dog: " + d.getName());
		}
	}
	
	public void afisareCamere() {
		for(Integer key: registru.keySet()) {
			System.out.println("Camera: " + key);
		}
	}
}
