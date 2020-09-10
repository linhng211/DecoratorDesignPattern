/**
 * 
 * @author Linh Nguyen
 * This is the concrete class Mage of the Player
 */
public class Mage extends Player{
	/**
	 * This method set up all the attributes for the Mage player
	 * @param name
	 */
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	/**
	 * This method utilize the toString method from the Player class by call "super"
	 */
	public String toString() {
		return "Mage: " + super.toString();
	}
}
