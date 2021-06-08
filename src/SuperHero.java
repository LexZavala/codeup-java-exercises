public class SuperHero extends Person {

    private String publicPersona;



    public SuperHero(String name) {
        super(name);
    }

    public SuperHero (String name, String publicPersona) {
        super(name);
        this.publicPersona = publicPersona;
    }

    public String

    public String alterEgo(){
        return this.getName();
    }
}
