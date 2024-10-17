/**
 * The Character class implements a class that 
 * represents characters in the OfficeCombat1.java game
 * This class contains each character's information states 
 * as well as methods that are used to determine the winner of the game
 * 
 * @author Palden Tamang
 * @version 1.0
 * @since 2024-10-07
 */
public class Character {
	/**
	 * The name of the character
	 */
	public String characterName;
	
	/**
	 * The skill level of the character
	 */
	public int skillLevel;
	
	/**
	 * The energy level of the character
	 */
	public int energyLevel;
	
	
	/**
	 * This constructor is used to construct a new Character
	 * with the given name, energyLevel and skillLevel
	 * @param name This is the name of the character
	 * @param energyLevel This is the energy level of the character
	 * @param skillLevel This is the skill level of the character
	 */
	public Character(String name , int energyLevel, int skillLevel) {
		this.characterName = name;
		this.energyLevel = energyLevel;
		this.skillLevel = skillLevel;
	}
	
	
	/**
	 * This getter method gets the character name of the character
	 * by returning the character's name.
	 * @return String The name of the character is returned
	 */
	public String getName() {
		return characterName;
	}
	
	
	/**
	 * This getter method gets the skill level of the character
	 * by returning the character's skill level.
	 * @return int The skill level of the character is returned. 
	 */
	public int getSkillLevel() {
		return skillLevel;
	}
	
	
	/**
	 * This getter method gets the energy level of the character
	 * by returning the character's energy level.
	 * @return int The energy level of the character is returned.
	 */
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	
	/**
	 * This method is used to reduce the character's energy level
	 * by the specified attack amount dealt by the other character
	 * @param attackAmount Indicates how much damage is dealt on the character
	 * @return int attackAmount is returned to indicate how much damage, i.e hurt
	 * is inflicted on the character.
	 */
	public int hurt(int attackAmount) {
		energyLevel-= attackAmount;
		return attackAmount;
	}
	
	
	/**
	 * This method calculates the total damage dealt by the character
	 * using the specified weapon.
	 * @param w1 The weapon that is used to attack.
	 * @return int This returns the total damage dealt by the character.
	 */
	public int attack(Weapon w1) {
		int TotalDamage= w1.shoot() + skillLevel;
		return TotalDamage;
	}
	
	
	/**
	 * This method is used to check if the character has lost all energy.
	 * @return boolean This returns true if character's  
	 * current energy level is less than or equal to 0,
	 * this means the character has lost the fighting event.
	 * false is returned otherwise which means the character
	 * still has not lost the fighting event.
	 */
	public boolean isLose() {
		if (energyLevel <=0) {
			return true;
		}
		else {
			return false;
		}
	}
}