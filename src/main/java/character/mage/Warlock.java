package character.mage;

import character.Player;

public class Warlock extends Mage{

    public Warlock(int health) {
        super(health);
    }

    public void attack(Player enemy){
        int attackValue = this.getCurrentSpell().attackValue;
        enemy.defend(attackValue);
    }
}
