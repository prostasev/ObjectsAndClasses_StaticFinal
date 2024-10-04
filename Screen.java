// Screen.java
public final class Screen {
    private final double diagonal; // Диагональ в дюймах
    private final String type; // Тип (IPS, TN, VA)
    private final double weight; // Вес в граммах

    public Screen(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Экран: %.2f дюймов, тип: %s, вес: %.2f г", diagonal, type, weight);
    }
}