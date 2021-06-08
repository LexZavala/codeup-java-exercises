public class SuperHero extends Person {

    private String publicPersona;

    public SuperHero(String firstName, String lastName, String publicPersona) {
        super(firstName, lastName);
        this.publicPersona = publicPersona;
    }

    @Override
    public String getName() {
        return publicPersona;
    }

    public static void main(String[] args) {
        SuperHero test = new SuperHero("Dale", "Denverson", "The Shinning Boy");
        Person Jim = new SuperHero("Jim", "Halpert", "SuperJim");


        System.out.println(test.getName());

    }
}
