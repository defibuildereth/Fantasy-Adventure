package character.warrior;

import character.Player;

public class Barbarian extends Warrior {

    public Barbarian(int health) {
        super(health);
    }

    public void attack(Player enemy){
        int attackValue = this.getCurrentWeapon().attackValue * 2;
        enemy.defend(attackValue);
    }
}
