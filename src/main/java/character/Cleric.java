package character;

import enums.Items;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<Items> items;
    private Items currentItem;

    public Cleric(int health) {
        super(health);
        this.items = new ArrayList<>();
        this.currentItem = null;
    }

    public ArrayList<Items> getItem() {
        return items;
    }

    public Items getCurrentItem() {
        return currentItem;
    }

    public void addItem(Items item){
        this.items.add(item);
    }

    public void equipItem(Items item){
        if (this.items.contains(item)){
            this.currentItem = item;
        }
    }

    public void attack(Player ally){
        int boostValue = this.getCurrentItem().boost;
        ally.addHealth(boostValue);
    }
}
