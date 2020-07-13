public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return this.age > 12 && age < 20;
    }

    public String getFullName() {
        if (this.firstName != null && this.lastName == null)
            return "First name: " + this.firstName;
        if (this.firstName == null && this.lastName != null)
            return "Last name: " + this.lastName;
        if (this.firstName == null && this.lastName == null)
            return "A man/woman has no name";
        return "Full name: " + this.firstName + " " + this.lastName;
    }
}