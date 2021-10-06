package interfaces;

import character.Character;

public interface IFight {

    public void attack(Character enemy);  // pass enemy or player, void or returning something
    public void defend(Character enemy);  // pass enemy or player, void or returning something
}
