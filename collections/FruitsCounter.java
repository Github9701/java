package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FruitsCounter {

	public static void main(String[] args) {
		 if (args.length != 1) {
	            System.out.println("Usage: java FruitCounter <D:\\programs\\jay\\src\\collections\\fruit.txt>");
	            return;
	        }

	        String filePath = args[0];
	        HashMap<String, Integer> fruitMap = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader("D:/programs/jay/src/collections/fruit.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	            	 if (fruitMap.containsKey(line)) {
	                     fruitMap.put(line, fruitMap.get(line) + 1);
	                 } else {
	                     fruitMap.put(line, 1);
	                 }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
	            String name = entry.getKey();
	            int count = entry.getValue();
	            Fruit fruit = new Fruit(name);
	            System.out.println(fruit);
	        }

	}

}
