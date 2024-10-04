// Main.java
public class Main {
    public static void main(String[] args) {
        // Создаем комплектующие
        Processor processor1 = new Processor(3.5, 4, "Intel", 500);
        RAM ram1 = new RAM("DDR4", 16, 70);
        Storage storage1 = new Storage("SSD", 512, 100);
        Screen screen1 = new Screen(15.6, "IPS", 300);
        Keyboard keyboard1 = new Keyboard("Механическая", true, 800);

        // Создаем компьютер
        Computer computer1 = new Computer("Dell", "XPS 15");
        computer1.setProcessor(processor1);
        computer1.setRAM(ram1);
        computer1.setStorage(storage1);
        computer1.setScreen(screen1);
        computer1.setKeyboard(keyboard1);

        // Вывод информации о компьютере
        System.out.println(computer1);

        // Создаем второй компьютер с другими комплектующими
        Processor processor2 = new Processor(3.8, 6, "AMD", 700);
        RAM ram2 = new RAM("DDR5", 32, 80);
        Storage storage2 = new Storage("HDD", 1000, 150);
        Screen screen2 = new Screen(17.3, "TN", 400);
        Keyboard keyboard2 = new Keyboard("Мембранная", false, 600);

        Computer computer2 = new Computer("HP", "Pavilion 17");
        computer2.setProcessor(processor2);
        computer2.setRAM(ram2);
        computer2.setStorage(storage2);
        computer2.setScreen(screen2);
        computer2.setKeyboard(keyboard2);

        // Вывод информации о втором компьютере
        System.out.println("\n" + computer2);
    }
}