package enums;

public enum Products {
    HOME(0),
    CHILDREN(1),
    HOUSEHOLD(2),
    PHARMACY(3);
    private int description;
    Products(int i) {
        description = i;
    }
    public int getDescription() {
        return description;
    }

}
