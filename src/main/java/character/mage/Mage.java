package character.mage;

import character.Character;
import enums.Creatures;
import enums.Spells;

import java.util.ArrayList;

public abstract class Mage extends Character {

    private ArrayList<Spells> spells;
    private Spells currentSpell;
    private ArrayList<Creatures> creatures;
    private Creatures currentCreature;

    public Mage(int health) {
        super(health);
        this.spells = new ArrayList<>();
        this.currentSpell = null;
        this.creatures = new ArrayList<>();
        this.currentCreature = null;
    }

    public ArrayList<Spells> getSpells() {
        return spells;
    }

    public Spells getCurrentSpell() {
        return currentSpell;
    }

    public ArrayList<Creatures> getCreatures() {
        return creatures;
    }

    public Creatures getCurrentCreature() {
        return currentCreature;
    }

    public void addSpell(Spells spell){
        this.spells.add(spell);
    }

    public void equipSpell(Spells spell){
        if (this.spells.contains(spell)){
            this.currentSpell = spell;
        }
    }

    public void addCreature(Creatures creature){
        this.creatures.add(creature);
    }

    public void equipCreature(Creatures creature){
        if (this.creatures.contains(creature)){
            this.currentCreature = creature;
        }
    }
}
