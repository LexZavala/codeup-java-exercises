package CollectionsLecture;

import shapes.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

    public static void main(String[] args) {

//      CANNOT CREATE AN ARRAY LIST OF PRIMITIVE DATA TYPES
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(32);
        collectionOfNums.add(1, 24);


        for (int i = 0; i < collectionOfNums.size(); i++) {
            System.out.println(collectionOfNums.get(i));
        }

        System.out.println(collectionOfNums); // will display the array in itself instead of it's location

        System.out.println(collectionOfNums.contains(44));
        System.out.println(collectionOfNums.indexOf(44));
        System.out.println(collectionOfNums.lastIndexOf(44));

        ArrayList<String> studentNames = new ArrayList<>();
        if (studentNames.isEmpty()){
            System.out.println("Let's fill in the list of Student names.");
        }

        System.out.println(collectionOfNums);
        collectionOfNums.remove((Integer)44);
        System.out.println(collectionOfNums);

        ArrayList<Double> collecionOfDoubles = new ArrayList<>();
        collecionOfDoubles.add(3.14);
        collecionOfDoubles.add(56.0);
        collecionOfDoubles.add(7.7777);
        collecionOfDoubles.add((double)2);

        System.out.println(collecionOfDoubles);
        collecionOfDoubles.remove(2);
        System.out.println(collecionOfDoubles);

        ArrayList stuff = new ArrayList();
        stuff.add("Beatrice");
        stuff.add(23);
        stuff.add(new Square(5, 5));


        for (Object thing : stuff) {
            System.out.println(thing);
        }

        System.out.println(stuff.get(2));

        collectionOfNums.set(2, 88); // REPLACES THE INDEX DEFINED WITH NEW VALUE
        System.out.println(collectionOfNums);

//      HASHMAP PART OF LECTURE

        HashMap<Character, Square> squares = new HashMap<>();
        squares.put('A', new Square(5, 5));
        squares.put('B', new Square(10, 10));
        Square sq = new Square(5, 5);
        squares.put('D', sq);
        squares.putIfAbsent('D', new Square(9, 9));
        squares.putIfAbsent('Q', sq);

        System.out.println(squares.get('A').getArea());
        System.out.println(squares.getOrDefault('B', new Square(0, 0)).getArea());
        System.out.println(squares.containsKey('B'));
        System.out.println(squares.containsValue( new Square(5, 5)));
        System.out.println(squares.containsValue(sq));
        System.out.println(sq);
        System.out.println(squares.get('Q'));
        squares.remove('Q');
        System.out.println(squares.get('Q'));
        squares.remove('C', sq); // This doesnt do anything cause sq is not the value of C so it doesnt remove
        System.out.println(squares.containsValue(sq));
        squares.replace('D', new Square(4, 4));
        System.out.println(sq.getArea());
        System.out.println(squares.get('D').getArea());
        // replace skips if it doesnt find the key
        squares.clear(); // clears hashmap
        System.out.println(squares.size());


    }
}
