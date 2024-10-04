// Keyboard.java
public final class Keyboard {
    private final String type; // Тип (механическая, мембранная)
    private final boolean hasBacklight; // Наличие подсветки
    private final double weight; // Вес в граммах

    public Keyboard(String type, boolean hasBacklight, double weight) {
        this.type = type;
        this.hasBacklight = hasBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean hasBacklight() {
        return hasBacklight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Клавиатура: %s, подсветка: %s, вес: %.2f г", type, hasBacklight ? "да" : "нет", weight);
    }
}