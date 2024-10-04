// Computer.java
public class Computer {
    private final String vendor; // Производитель
    private final String name; // Название
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        if (processor != null) totalWeight += processor.getWeight();
        if (ram != null) totalWeight += ram.getWeight();
        if (storage != null) totalWeight += storage.getWeight();
        if (screen != null) totalWeight += screen.getWeight();
        if (keyboard != null) totalWeight += keyboard.getWeight();
        return totalWeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Компьютер: %s %s\n", vendor, name));
        if (processor != null) sb.append(processor).append("\n");
        if (ram != null) sb.append(ram).append("\n");
        if (storage != null) sb.append(storage).append("\n");
        if (screen != null) sb.append(screen).append("\n");
        if (keyboard != null) sb.append(keyboard).append("\n");
        sb.append(String.format("Общий вес: %.2f г", calculateTotalWeight()));
        return sb.toString();
    }
}