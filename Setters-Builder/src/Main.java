public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Sanath Kumar");
        person.setLastName("Bajjuri");
        person.setAge(23);
        person.setAddress("123 Main St");
        person.setCity("Warangal");
        person.setState("Telangana");
        person.setCountry("India");
        person.setPhone("9999999999");
        person.setEmail("sanath.bajjuri@zemsosolabs.com");
        person.setOccupation("Software Engineer");

        System.out.println(person);

        person.setAge(24);

        System.out.println(person);
    }
}