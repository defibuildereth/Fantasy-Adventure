package character.enemy;

import character.Player;

public class Troll extends Enemy {

    public Troll(int health) {
        super(health);
    }

    public void attack(Player enemy){
        enemy.defend(20);
    }

}
