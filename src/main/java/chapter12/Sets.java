package chapter12;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    //Duplicate elements would not be printed
    // Collections can hold any type of object

    public static void main(String[] args) {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); // [banana, orange, apple, lemon
    }
}
