package character.warrior;

import character.Character;
import enums.Weapons;

import java.util.ArrayList;

public abstract class Warrior extends Character {

    private ArrayList<Weapons> weapons;

    public Warrior(int health) {
        super(health);
        this.weapons = new ArrayList<>();
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }

    public void addWeapon(Weapons weapon){
        this.weapons.add(weapon);
    }
}
