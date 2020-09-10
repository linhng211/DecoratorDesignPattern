/**
 * 
 * @author Linh Nguyen
 * This is the concrete class Healer of the Player
 */
public class Healer extends Player{
	/**
	 * This method set up all the attributes for the Healer player
	 * @param name
	 */
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	/**
	 * This method utilize the toString method from the Player class by call "super"
	 */
	public String toString() {
		return "Healer: " + super.toString();
	}
}
