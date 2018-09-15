package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharVeteran implements ICharacter{

	private CharacterType toBeKilled;
	private CharacterType toBeHanged;
	
	public String getReview() {
		
		return null;
	}

	public CharacterType getType() {
		
		return CharacterType.VETERAN;
	}

	public void Ability(CharacterType OutOfUse,boolean use) {
		if(use) this.toBeKilled = CharacterType.ANYONE;
		else toBeKilled = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {
		this.toBeHanged = toBeHanged;
		
	}

	public CharacterType getVote() {
		
		return toBeHanged;
	}

	public CharacterType getAbility() {
		return toBeKilled;
	}

}
