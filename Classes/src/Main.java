
public class Main  {
    public static void main(String[] args) {
        Car honda = new Car();

        honda.setModel("Civic");
        System.out.println("I am a Honda " + honda.getModel());

        Person joe = new Person();

//        joe.setFirstName("John");
//        joe.setLastName("Doe");
        System.out.println(joe.getFullName());
    }
}
