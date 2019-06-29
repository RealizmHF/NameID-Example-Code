import java.util.ArrayList;
import java.util.Random;

//James West
//Example Code Snippet

//Creates a randomized arraylist of an object containing a Name and ID. Sorts the arraylist in descending order, and prints every 3rd object.


public class Main {

	public static void main(String[] args) {
		
		ArrayList<NameID> obj = initializeArray();
		
		sort(obj);
		
		//Print
		for(int p = 0; p < obj.size(); p += 3) {
			System.out.println(obj.get(p).toString());
		}
	}

	/*
	 * Methods
	 */
	
	public static ArrayList<NameID> initializeArray() {
		//Creates an initial array of NameID objects
		
		ArrayList<NameID> initial = new ArrayList<NameID>();
		
		for(int k = 0; k < 23; k++) {
			initial.add(createObject());
		}
		
		return initial;
	}
	
	public static NameID createObject() {
		//Creates a NameID object with a random name and id
		
		Random rand = new Random();
		
		char name = (char) (rand.nextInt(26) + 64);
		
		NameID newObject = new NameID(String.valueOf(name), rand.nextInt(5));
		
		return newObject;
	}
	
	public static void sort(ArrayList<NameID> objects) {
		//Traverse and swap object indexes based on descending alphabetical order
		
		for(int m = 0; m < objects.size(); m++) {
			
			for(int k = 0; k < objects.size(); k++) {
				
				if(objects.get(m).getName().charAt(0) < objects.get(k).getName().charAt(0)) {
					NameID temp = objects.get(m);
					objects.set(m, objects.get(k));
					objects.set(k, temp);
				}
			}
		}
	}
}
