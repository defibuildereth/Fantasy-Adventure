package character.warrior;

import character.Player;

public class Dwarf extends Warrior{

    public Dwarf(int health) {
        super(health);
    }

    public void attack(Player enemy){
        int attackValue = this.getCurrentWeapon().attackValue;
        enemy.defend(attackValue);
    }
}
