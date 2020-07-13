public class Automobile {
    public Automobile() {
    }

    public Automobile(int horsepower, int weight, int year) {
        this.horsepower = horsepower;
        this.weight = weight;
        this.year = year;
    }

    protected void accelerate() {
        System.out.println("Automobile accelerating");
    }

    protected void decelerate() {
        System.out.println("Automobile decelerating");
    }

    int horsepower;
    int weight;
    int year;
}
