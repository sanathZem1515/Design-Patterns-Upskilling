public class Main {
    public static void main(String[] args) {

        Person person = new Builder("Sanath Kumar", "Bajjuri")
                .age(23)
                .address("123 Main st")
                .city("Warangal")
                .state("Telangana")
                .country("India")
                .phone("9999999999")
                .email("sanath.bajjuri@zemosolabs.com")
                .occupation("Software Engineer")
                .build();


        System.out.println(person);
    }
}