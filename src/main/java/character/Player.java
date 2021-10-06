package character;

import interfaces.IFight;

public abstract class Player implements IFight {

    protected int health;

    public Player(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addHealth(int boost){
        this.health += boost;
    }

    public void attack(Player enemy) {}

    public void defend(int attackValue) {}
}
