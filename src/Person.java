public class Person {

    private String firstname;
    private String lastName;

    public String getName(){
        return firstname;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.firstname = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + firstname);
    }

    public Person(String name, String lastName){
        this.firstname = name;
        this.lastName = lastName;
    }

    public Person(){}

    public static void main(String[] args) {
        Person testPerson = new Person("Lex", "Zavala");
        System.out.println(testPerson.getName());
        testPerson.setName("Ramon");
        System.out.println("new name is " + testPerson.getName());
        testPerson.sayHello();

        //UNDERSTANDING REFERENCES EXERCISE

//      Person person1 = new Person("John");
//      Person person2 = new Person("John");
////      The below is true cause using the equals methods allows to compare string values
//      System.out.println(person1.getName().equals(person2.getName()));
////      This is false because you cant compare two strings within objects
//      System.out.println(person1 == person2);

//      Person person1 = new Person("John");
//      Person person2 = person1;
//      System.out.println(person1 == person2);
//      The Above is true because the comparisson is made on objects that are the exact same

        Person person1 = new Person("John", "Doe");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//      Because person2 is equal to person 1, changing person 2's name also impacts person 1
    }

}
