import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};

        System.out.println(fruits[0]);

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        System.out.println(fruits.length);

        // for(int i = 0; i < fruits.length; i++) {
        //     System.out.print(fruits[i] + " ");
        // }

        // Enhanced for loop
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.sort(fruits);
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.fill(fruits, "apple");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

    }
}
