public class Dog extends Animal{
    private boolean tail;
    private int weight;
    private int eyes;
    private int legs;
    private int teeth;
    private String coat;
    private String name;

    public Dog(boolean tail, int weight, int eyes, int legs, int teeth, String coat, String name) {
        super(name, 1, 4, true);
        this.tail = tail;
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); // move() method from parent (Animal) class called
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10); // move() method from this (Dog) class called unless this class does not have move() method
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLeg()s called");
    }

    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); // calls parent (Animal) class's move() method
    }
}
