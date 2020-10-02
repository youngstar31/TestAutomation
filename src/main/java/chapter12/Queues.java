package chapter12;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]

        fruit.remove(); // will remove first element if an index isn't specified
        System.out.println();//[lemon, banana, orange, lemon

        System.out.println(fruit.peek()); //lemon this will return the head of the queue
    }
}
