/**
 * 
 * @author Linh Nguyen
 * This class upgrade the weapon for the player
 */
public class WeaponUpgrade extends PlayerDecorator{

	Player player;
	/**
	 * Passing parameter "player" to make this class part of Player
	 * @param player
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	/**
	 * This method concatenate the player.toString and upgrade it
	 */
	public String toString() {
		return player.toString() + "\n" + "Upgrade weapon";
	} 
	/**
	 * This method adjust the player's power after the upgrade 
	 */
	public double getPower() {
		return player.getPower() + 5;
	} 
}
