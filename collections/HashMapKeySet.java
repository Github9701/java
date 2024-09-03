package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKeySet {

	public static void main(String[] args) {
		
		HashMap<String, String> menu = new HashMap<String, String>();
		
		menu.put("Monday", "Onion Dosa");
		menu.put("Tuesday", "Upma");
		menu.put("Wednesday", "Idly");
		menu.put("Thursday", "Puri");
		menu.put("Friday", "Bonda");
		menu.put("Saturday", "Chapathi");
		menu.put("Sunday", "Pulihora");
		
		Set<String> keys = menu.keySet();
		
		for(String key : keys) {
			System.out.println(key + " - " + menu.get(key));
		}

	}

}
