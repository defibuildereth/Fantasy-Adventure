package interfaces;

import character.Player;

public interface IFight {

    public void attack(Player enemy);  // pass enemy or player, void or returning something
    public void defend(int attackValue);  // pass enemy or player, void or returning something
}
