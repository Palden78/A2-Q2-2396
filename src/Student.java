/**
 * The Student class is a subclass of the Character class,
 * it represents a character that can not only attack but can also
 * hide from an attack, where it takes zero damage when hidden.
 * 
 * It has inherited all the instance variables and methods found in 
 * the Character superclass, but it has it's own new method that is
 * used to hide, as well as overriding the hurt method to take zero 
 * damage while being hidden. It also has it's own new instance 
 * variable IsHidden which indicates whether the student is hiding.
 * 
 * @author Palden Tamang
 * @version 1.0
 * @since 2024-10-07
 */
public class Student extends Character {
	/**
	 * Boolean variable used to indicate whether the character is hidden.
	 */
	public boolean IsHidden;

	
	/**
	 * This constructor is used to construct a new Student
	 * with the given name, energyLevel and skillLevel.
	 * @param name This is the name of the student.
	 * @param energyLevel This is the energy level of the student.
	 * @param skillLevel This is the skill level of the student.
	 */
	public Student(String name, int energyLevel, int skillLevel) {
		super(name,energyLevel,skillLevel);
	}
	
	/**
	 * This method is used by the student character to hide.
	 * The value of IsHidden is set to true, indicating that the 
	 * student is hidden now.
	 */
	public void hide() {
		this.IsHidden = true;
	}
	
	
	/**
	 * This overriden method applies to the student character,
	 * where it first checks if the student is hidden, which is if
	 * the value of IsHidden is currently true.
	 * 
	 * If the student is currently hidden, the value of IsHidden is reset
	 * back to false so that the student is no longer hidden in the 
	 * next round, and the integer value of zero is returned to indicate
	 * that the student has taken zero damage because it was hidden.
	 * 
	 * If the student is not currently hidde, it takes damage as normal
	 * and energy level is reduced as normal by subtracting the attack
	 * damage dealt by the other character.
	 *
	 * @param attackAmount This is the amount of attack damage dealt by the other character.
	 * @return int returns the amount of damage/ hurt taken by the student.
	 */
	@Override public int hurt(int attackAmount) {
		if (IsHidden == true) {
			this.IsHidden = false;
			return 0 ;
			
		}
		else {
			energyLevel-= attackAmount;
			return attackAmount;
		}
	}
}
