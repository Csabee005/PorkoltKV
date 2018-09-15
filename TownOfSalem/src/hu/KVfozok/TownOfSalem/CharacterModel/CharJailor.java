package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharJailor implements ICharacter {

	private CharacterType toBeJailed;
	private CharacterType toBeHanged;

	public String getReview() {

		return null;
	}

	public CharacterType getType() {

		return CharacterType.JAILOR;
	}

	public void Ability(CharacterType toBeJailed, boolean use) {
		if(use) this.toBeJailed = toBeJailed;
		else this.toBeJailed = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {
		this.toBeHanged = toBeHanged;
	}

	public CharacterType getVote() {

		return toBeHanged;
	}
	public CharacterType getAbility() {
		return toBeJailed;
	}
}
