public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27GL63T", "Samsung", "IPS", 27,
                144, 1, new Resolution(1920, 1080), true);
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v.2.44");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();


//        pc.getTheCase().pressPowerButton();
//        pc.getMotherboard().loadProgram("macOS 10.15.5");
//        pc.getMonitor().drawPixelAt(1000, 1000, "blue");
    }

}
