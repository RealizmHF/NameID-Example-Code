//James West

//Object containing a Name and ID

public class NameID {

	private String name;
	private int id;
	
	/*
	 * Constructors
	 */
	public NameID(String n, int i) {
		
		this.name = n;
		this.id = i;
	}
	
	/*
	 * Getters // Setters
	 */
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}
	
	/*
	 * Methods
	 */
	public String toString() {
		return "\nName: " + this.getName() + "\nID: " + this.getID();
	}
}
