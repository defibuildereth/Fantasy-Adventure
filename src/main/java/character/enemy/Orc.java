package character.enemy;

import character.Player;

public class Orc extends Enemy{

    public Orc(int health) {
        super(health);
    }

    public void attack(Player enemy){
        enemy.defend(15);
    }
}
