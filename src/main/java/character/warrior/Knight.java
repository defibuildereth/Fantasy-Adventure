package character.warrior;

import character.Player;

public class Knight extends Warrior {

    public Knight(int health) {
        super(health);
    }

    public void attack(Player enemy){
        int attackValue = this.getCurrentWeapon().attackValue;
        enemy.defend(attackValue);
    }

    public void defend(int attackValue){
        int reducedDamage = 12;
        this.health -= attackValue - reducedDamage;
    }
}
