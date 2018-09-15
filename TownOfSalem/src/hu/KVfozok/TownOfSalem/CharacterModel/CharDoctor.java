package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharDoctor implements ICharacter {

	private byte healsRemaining = 2;
	private CharacterType toBeHealed;
	private CharacterType toBeHanged;

	public String getReview() {

		return null;
	}

	public CharacterType getType() {

		return CharacterType.DOCTOR;
	}

	public void Ability(CharacterType toBeHealed, boolean use) {
		if (use && healsRemaining > 0) {
			this.toBeHealed = toBeHealed;
			healsRemaining--;
		} else
			this.toBeHealed = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {
		this.toBeHanged = toBeHanged;
	}

	public CharacterType getVote() {

		return toBeHanged;
	}

	public CharacterType getAbility() {
		return toBeHealed;
	}

}
