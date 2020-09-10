/**
 * 
 * @author Linh Nguyen
 * This is the abstract base class Player 
 */
public abstract class Player {
	
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	/**
	 * This method returns the generic part of the toString which is the same for all players
	 */
	public String toString() {
		return this.name + "\n" + "Carries a " + this.weapon + ", and wears a " + this.armor;
	}
	/**
	 * This method return the players power using the formula
	 * @return double power
	 */
	public double getPower() {
		double power;
		power = attack * 3 + defense + intellect / 2;
		return power;
	}
}
