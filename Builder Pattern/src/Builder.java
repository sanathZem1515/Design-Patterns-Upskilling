public class Builder {
     String firstName;
     String lastName;
     int age;
     String address;
     String city;
     String state;
     String country;
     String phone;
     String email;
     String occupation;

    public Builder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Builder city(String city) {
        this.city = city;
        return this;
    }

    public Builder state(String state) {
        this.state = state;
        return this;
    }

    public Builder country(String country) {
        this.country = country;
        return this;
    }

    public Builder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Builder email(String email) {
        this.email = email;
        return this;
    }

    public Builder occupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
