package enums;

public enum Spells {

    FIRE (25),
    LIGHTNING(40);

    public final int attackValue;

    Spells(int attackValue) {
        this.attackValue = attackValue;
    }
}
