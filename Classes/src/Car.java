public class Car extends Automobile{
    private void makeNoise() {

    }

    protected void setModel(String model) {
        this.model = model;
    };

    protected String getModel() {
//        System.out.println("I am a " + model);
        return model;
    }

    private int doors;
    private int wheels;
    private int cylinders;
    private int horsepower;
    private String model;
    private String engine;
    private String color;
}
