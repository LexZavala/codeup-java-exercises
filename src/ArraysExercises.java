import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] x, Person newPerson)  {
        int newLength = x.length + 1;
        Person[] copy = Arrays.copyOf(x, newLength );
        copy[copy.length-1] = newPerson;
        return copy;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] personsArr = new Person[3];

        personsArr[0] = new Person("Clark");
        personsArr[1] = new Person("Bruce");
        personsArr[2] = new Person("Diana");
        System.out.println(personsArr.length);

        for (Person name : personsArr){
            System.out.println(name.getName());
        }

        Person sofia = new Person("Sofia");
        personsArr = addPerson(personsArr, sofia);
        for (Person name : personsArr){
            System.out.println(name.getName());
        }












    }
}
