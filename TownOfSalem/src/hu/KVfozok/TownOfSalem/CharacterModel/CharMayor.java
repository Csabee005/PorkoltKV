package hu.KVfozok.TownOfSalem.CharacterModel;

public class CharMayor implements ICharacter {

	private CharacterType iAmMayor;
	private CharacterType toBeHanged;
	
	public String getReview() {
		
		return null;
	}

	public CharacterType getType() {
		
		return CharacterType.MAYOR;
	}

	public void Ability(CharacterType OutOfUse, boolean use) {
		if(use) iAmMayor = CharacterType.MAYOR; //Ha mag�t adja vissza, felfedi mag�t �s 3-at �r a szavazata.
		else iAmMayor = CharacterType.SKIP;
	}

	public void setVote(CharacterType toBeHanged) {
		this.toBeHanged = toBeHanged;
	}

	public CharacterType getVote() {
		
		return toBeHanged;
	}

	public CharacterType getAbility() {
		return iAmMayor;
	}

}
