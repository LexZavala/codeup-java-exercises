public class SuperHero extends Person {
    @SuppressWarnings("all")
    private String publicPersona;

    private int age;

    public int getAge() {
        return age;
    }

    public SuperHero(String firstName, String lastName, String publicPersona, int age) {
        super(firstName, lastName);
        this.publicPersona = publicPersona;
        this.age = age;
    }

    @Override
    public String getName() {
        return publicPersona;
    }

    public static void main(String[] args) {
        SuperHero test = new SuperHero("Dale", "Denverson", "The Shinning Boy", 40);
        Person Jim = new SuperHero("Jim", "Halpert", "SuperJim", 50);


        System.out.println(test.getName());

    }
}
