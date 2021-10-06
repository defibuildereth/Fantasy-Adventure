package character.warrior;

import character.Character;
import enums.Weapons;

import java.util.ArrayList;

public abstract class Warrior extends Character {

    private ArrayList<Weapons> weapons;
    private Weapons currentWeapon;

    public Warrior(int health) {
        super(health);
        this.weapons = new ArrayList<>();
        this.currentWeapon = null;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public Weapons getCurrentWeapon() {
        return currentWeapon;
    }

    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }

    public void addWeapon(Weapons weapon){
        this.weapons.add(weapon);
    }

    public void equipWeapon(Weapons weapon){
        if (this.weapons.contains(weapon)) {
            this.currentWeapon = weapon;
        }
    }
}
