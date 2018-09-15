package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharPoliceman implements ICharacter{

	private CharacterType toBeRevealed;
	private CharacterType toBeHanged;
	
	public String getReview() {
		
		return null;
	}

	public CharacterType getType() {
		
		return CharacterType.POLICEMAN;
	}

	public void Ability(CharacterType toBeRevealed, boolean use) {
		if(use) this.toBeRevealed = toBeRevealed;
		else this.toBeRevealed = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {
		this.toBeHanged = toBeHanged;
		
	}

	public CharacterType getVote() {
		return toBeHanged;
	}

	public CharacterType getAbility() {
		return toBeRevealed;
	}

}
