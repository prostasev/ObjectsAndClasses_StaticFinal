// Processor.java
public final class Processor {
    private final double frequency; // Частота в ГГц
    private final int cores; // Количество ядер
    private final String manufacturer; // Производитель
    private final double weight; // Вес в граммах

    public Processor(double frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Процессор: %.2f ГГц, %d ядер, %s, вес: %.2f г", frequency, cores, manufacturer, weight);
    }
}