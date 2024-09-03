package assignments;

import java.io.*;
import java.util.*;

public class CountNames {

	public static void main(String[] args) {

		boolean found;

		if (args.length < 1) {
			System.out.println("Syntax: java CountNames  file");
			System.exit(0);
		}

		try {
			FileReader f = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(f);

			String line;
			ArrayList al = new ArrayList<>();
			
			ListIterator<Fruit> itr;

			while ((line = br.readLine()) != null) {
				itr = al.listIterator();
				found = false;
				while (itr.hasNext()) {
					Fruit n = (Fruit) itr.next();
					if (n.name.equals(line)) {
						n.count++;
						itr.set(n);
						found = true;
						break;
					}
				}
				if (!found) {
					al.add(new Fruit(line));
				}
			}

			itr = al.listIterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (Exception e) {
			System.out.println("");
		}

	}

}
