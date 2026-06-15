public class arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        System.out.println(z);

        z = x - y;
        System.out.println(z);

        z = x * y;
        System.out.println(z);

        z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);

        // Augmented Assignment Operators
        x += y;
        System.out.println(x);

        x -= y;
        System.out.println(x);

        x *= y;
        System.out.println(x);

        x /= y;
        System.out.println(x);

        x %= y;
        System.out.println(x);

        // Increment and Decrement Operators
        x++; // x = x + 1
        System.out.println(x);

        x--; // x = x - 1
        System.out.println(x);

        // PEDMAS
        double result = 3 + 4 * 5 / (6 - 7) % 8;
        System.out.println(result);
    }
}
