/**
 * The SuperGun class is a subclass of the Weapon class,
 * it represents a more powerful weapon used by the
 * security guard character, that can be boosted to
 * twice the amount of it's original power.
 * 
 * It has inherited all the instance variables and methods found in 
 * the Weapon superclass, but it has it's own new method that is
 * used for boosting, as well as overriding the shoot method
 * that checks if the gun is boosted and doubles the power of the gun.
 * And also has it's own new instance variable Boosted which states 
 * whether the gun is boosted or not.
 * 
 * @author Palden Tamang
 * @version 1.0
 * @since 2024-10-07
 */
public class SuperGun extends Weapon {
	/**
	 * Boolean variable used to indicate whether the SuperGun is boosted
	 */
	public boolean Boosted;

	/**
	 * This constructor is used to construct a new SuperGun
	 * with the given name and power.
	 * @param name This is the name of the new SuperGun.
	 * @param power This is the power level of the new SuperGun.
	 */
	public SuperGun(String name, int power) {
		super(name,power);
	}
	
	
	/**
	 * This method is used to set the value of Boosted to be true,
	 * which means that the SuperGun is now boosted and should have
	 * double the power until the round ends.
	 */
	public void boost() {
		this.Boosted=true;
	}
	
	
	/**
	 * This overriden method applies to the SuperGun weapon,
	 * where it first checks whether the SuperGun is boosted
	 * by checking if Boosted is true.
	 * 
	 * If the SuperGun is boosted, the variable newPower is used to
	 * store the new power of the gun, which is double the original
	 * power of the gun. And the value of Boosted is reset back to false,
	 * which means its not going to be boosted in the next round
	 * And the newPower is returned.
	 * 
	 * If the SuperGun is not boosted, it returns the power as normal
	 * without any modifications to it's original value.
	 * 
	 * @return int returns the power level of the SuperGun.
	 */
	@Override public int shoot() {
		int newPower;
		if (this.Boosted==true) {
			newPower= this.power * 2;
			this.Boosted = false;
			return (newPower);
		}
		else {
			return power;
		}
	}
}
