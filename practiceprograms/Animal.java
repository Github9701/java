package practiceprograms;

public class Animal {
	    String name;

	    Animal(String name) {
	        this.name = name;
	    }

	    void displayName() {
	        System.out.println("My name is " + name);
	    }
	}

class Horse extends Animal {
	    String breed;

		public Horse(String name, String breed) {
			super(name);
			this.breed = breed;
		}
       void displayBreed() {
    	   System.out.println("Breed is " + breed);
       }
	   
	    
	}




