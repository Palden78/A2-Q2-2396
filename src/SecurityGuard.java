/**
 * The SecurityGuard class is a subclass of the Character class,
 * it represents a character that can not only attack but can also
 * boost their weapon for to deal additional damage.
 * 
 * It has inherited all the instance variables and methods found in 
 * the Character superclass, but it has it's own new method that is
 * used to boost the weapon.
 * 
 * @author Palden Tamang
 * @version 1.0
 * @since 2024-10-07
 */
public class SecurityGuard extends Character {
	/**
	 * This constructor is used to construct a new SecurityGuard
	 * with the given name, energyLevel and skillLevel.
	 * @param name This is the name of the SecurityGuard
	 * @param energyLevel This is the energy level of the Security Guard
	 * @param skillLevel This is the skill level of the Security Guard
	 */
	public SecurityGuard( String name, int energyLevel, int skillLevel) {
		super(name,energyLevel,skillLevel);
	}
	
	
	/**
	 * This method is used to boost the SuperGun weapon held by the security guard
	 * It calls the boost method of the SuperGun w1
	 * This sets the Boosted instance variable of the SuperGun w1 to be true,
	 * and the SuperGun is now boosted.
	 * @param w1 This represents the SuperGun weapon that is going to be boosted 
	 */
	public void boostWeapon(SuperGun w1) {
		w1.boost();
	}
	
}
