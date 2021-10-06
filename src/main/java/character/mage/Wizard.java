package character.mage;

import character.Player;

public class Wizard extends Mage{

    public Wizard(int health) {
        super(health);
    }

    public void attack(Player enemy){
        int attackValue = this.getCurrentSpell().attackValue * 2;
        enemy.defend(attackValue);
    }
}
