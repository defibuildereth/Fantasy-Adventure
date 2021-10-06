package enums;

public enum Items {

    POTION(100),
    HERBS(50);

    public final int boost;

    Items(int boost) {
        this.boost = boost;
    }
}
