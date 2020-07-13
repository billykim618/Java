public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;
    private boolean resting;

    // example of parameter legs being filled but super constructor already having default value
    // --> default value has precedence
    public Fish(String name, int weight, int legs, int gills, int eyes, int fins) {
        super(name, weight, 0, false);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        this.resting = true;
        System.out.println(this.getName() + " is now resting");
    }

    private void stopResting() {
        this.resting = false;
        System.out.println(this.getName() + " is now swimming around");
    }

    private void moveMuscles() {
        System.out.println("Fish moving muscles");
    }

    private void moveBackFin() {
        System.out.println("Fish moving back fins");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
}
