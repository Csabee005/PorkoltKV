package hu.KVfozok.TownOfSalem.CharacterModel;

public interface ICharacter {
	String getReview();
	CharacterType getType();
	void Ability(CharacterType toBeKilled, boolean use);
	CharacterType getAbility();
	void setVote(CharacterType setCharacterType);
	CharacterType getVote();
}
