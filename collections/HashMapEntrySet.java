package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySet {

	public static void main(String[] args) {
		
		HashMap<String, String> menu = new HashMap<String, String>();
		
		menu.put("Monday", "Onion Dosa");
		menu.put("Tuesday", "Upma");
		menu.put("Wednesday", "Idly");
		menu.put("Thursday", "Puri");
		menu.put("Friday", "Bonda");
		menu.put("Saturday", "Chapathi");
		menu.put("Sunday", "Pulihora");
		
		for(Map.Entry<String, String> set : menu.entrySet()) {
			
			System.out.println(set.getKey() + " - " + set.getValue());
		}

	}

}
