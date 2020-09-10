/**
 * 
 * @author Linh Nguyen
 * 		This is the abstract class PlayerDecorator extends from Player which  we can upgrade the armor, skill or weapon 
 * and adjust the power of the player as well as the toString method 
 */
public abstract class PlayerDecorator extends Player {

	public abstract String toString();
	public abstract double getPower();
}
