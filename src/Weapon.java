/**
 * The Weapon class implements a class that represents
 * the weapons used in OfficeCombat1.java game.
 * The class represents a weapon with it's name 
 * and power level. 
 * @author Palden Tamang
 * @version 1.0
 * @since 2024-10-07
 */

public class Weapon {
	/**
	 * The name of the weapon
	 */
	public String weaponName;
	
	/**
	 * The power level of the weapon
	 */
	public int power;

	
	/**
	 * This constructor constructs a new weapon with 
	 * the specified weapon name and power.
	 * @param name This is the name of the new weapon
	 * @param power This is the power level of the new weapon
	 */
	public Weapon(String name, Integer power) {
		this.weaponName=name;
		this.power=power;
	}
	
	
	/**
	 * Getter used to get weapon name
	 * @return String This returns the name of the weapon
	 */
	public String getName() {
		return weaponName;
	}
	
	/**
	 * This method is used to get weapon power level
	 * @return int This returns the power level of the weapon
	 */
	public int shoot() {
		return power;
	}

}

