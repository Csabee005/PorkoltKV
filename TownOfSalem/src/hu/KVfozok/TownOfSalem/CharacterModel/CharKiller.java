package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharKiller implements ICharacter {

	private CharacterType toBeKilled;
	private CharacterType toBeHanged;

	public CharacterType getAbility() {
		return toBeKilled;
	}

	public String getReview() {
		return null;
	}

	public CharacterType getType() {
		return CharacterType.KILLER;
	}

	public void Ability(CharacterType toBeKilled, boolean use) {
		if(use) this.toBeKilled = toBeKilled;
		else this.toBeKilled = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {

		this.toBeHanged = toBeHanged;
	}

	public CharacterType getVote() {
		return toBeHanged;
	}
}