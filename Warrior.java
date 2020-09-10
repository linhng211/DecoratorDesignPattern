/**
 * 
 * @author Linh Nguyen
 * This is the concrete class Warrior of the Player
 */
public class Warrior extends Player{
	/**
	 * This method set up all the attributes for the Warrior player
	 * @param name
	 */
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	/**
	 * This method utilize the toString method from the Player class by call "super"
	 */
	public String toString() {
		return "Warrior: " + super.toString();
	}
}
