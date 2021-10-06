package enums;

public enum Weapons {

    SWORD(15),
    AXE(20),
    CLUB(10);

    public final int attackValue;

    Weapons(int attackValue) {
        this.attackValue = attackValue;
    }
}
