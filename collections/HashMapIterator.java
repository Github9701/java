package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {

	public static void main(String[] args) {
		
		HashMap<String, String> menu = new HashMap<String, String>();
		
		menu.put("Monday", "Onion Dosa");
		menu.put("Tuesday", "Upma");
		menu.put("Wednesday", "Idly");
		menu.put("Thursday", "Puri");
		menu.put("Friday", "Bonda");
		menu.put("Saturday", "Chapathi");
		menu.put("Sunday", "Pulihora");
		
		Iterator<Entry<String, String> > itr = menu.entrySet().iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry<String, String> m = (Map.Entry<String, String>)itr.next();
			
			
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}

}
