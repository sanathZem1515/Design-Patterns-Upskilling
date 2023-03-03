public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String city;
    private final String state;
    private final String country;
    private final String phone;
    private final String email;
    private final String occupation;

    Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.phone = builder.phone;
        this.email = builder.email;
        this.occupation = builder.occupation;
    }

}
