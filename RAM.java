// RAM.java
public final class RAM {
    private final String type; // Тип (DDR4, DDR5 и т.д.)
    private final int volume; // Объём в ГБ
    private final double weight; // Вес в граммах

    public RAM(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Оперативная память: %s, объём: %d ГБ, вес: %.2f г", type, volume, weight);
    }
}