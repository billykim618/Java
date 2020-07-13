public class Animal {

    private String name;
    private int weight;
    private int legs;
    private boolean fur;

    public Animal(String name, int weight, int legs, boolean fur) {
        this.name = name;
        this.weight = weight;
        this.legs = legs;
        this.fur = fur;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getLegs() {
        return legs;
    }
}
