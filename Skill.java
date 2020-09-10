/**
 * 
 * @author Linh Nguyen
 *	This class upgrade the skill for the player
 */
public class Skill extends PlayerDecorator{

	Player player;
	/**
	 * Passing parameter "player" to make this class part of Player
	 * @param player
	 */
	public Skill(Player player) {
		this.player = player;
	}
	/**
	 * This method concatenate the player.toString and upgrade it
	 */
	public String toString() {
		return player.toString() + "\n" + "Gained a skill";
	}
	/**
	 * This method adjust the player's power after the upgrade 
	 */
	public double getPower() {
		return player.getPower() + 2;
	}
}