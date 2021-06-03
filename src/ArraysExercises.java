import java.util.Arrays;

public class ArraysExercises {

    public static Person addPerson (Person[] x, String name)  {
        int newLength = x.length + 1;
        Person[] copy = Arrays.copyOf(x, newLength );
        System.out.println(copy.length);
        copy[copy.length-1] = new Person(name);
        for (Person personName : copy){
            System.out.println(personName.getName());
        }
//        x =copy;
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

        addPerson(personsArr, "Sofia")
        for (Person name : personsArr){
            System.out.println(name.getName());
        }

        addPerson(personsArr, "Sofia");
        System.out.println(addPerson(personsArr, "Sofia"));











    }
}
