// Storage.java
public final class Storage {
    private final String type; // Тип (HDD, SSD)
    private final int capacity; // Объём памяти в ГБ
    private final double weight; // Вес в граммах

    public Storage(String type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Накопитель: %s, объём: %d ГБ, вес: %.2f г", type, capacity, weight);
    }
}