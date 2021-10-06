package character;

import interfaces.IFight;

public abstract class Character implements IFight {

    private int health;

    public Character(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Character enemy) {

    }

    public void defend(Character enemy) {

    }
}
