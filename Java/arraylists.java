import java.util.*;

public class arraylists {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(); // <Integer>

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        list2.add(4.0);
        list2.add(5.0);

        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("orange");
        fruits.add("kiwi");

        // fruits.remove(0);
        // fruits.set(0, "pineapple");

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        Collections.sort(fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);

        
    }
}