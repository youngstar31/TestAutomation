package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        // elements will be placed in the way we added them

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }
}
