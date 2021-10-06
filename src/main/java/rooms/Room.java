package rooms;

import character.enemy.Enemy;
import enums.Treasure;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Enemy> enemy;
    private ArrayList<Treasure> treasure;
    private String name;


    public Room(String name) {
        this.name = name;
        this.enemy = new ArrayList<>();
        this.treasure = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemy() {
        return enemy;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public void addEnemy(Enemy enemy) {
        this.enemy.add(enemy);
    }

    public void addTreasure(Treasure treasure) {
        this.treasure.add(treasure);
    }
}
