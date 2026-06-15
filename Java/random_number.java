import java.util.Random;
public class random_number {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(1, 7);
        int number2 = random.nextInt(1, 7);
        int number3 = random.nextInt(1, 7);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        // Doubles
        double d1 = random.nextDouble();
        double d2 = random.nextDouble();
        System.out.println(d1);
        System.out.println(d2);

        // Boolean
        boolean b1 = random.nextBoolean();
        boolean b2 = random.nextBoolean();
        System.out.println(b1);
        System.out.println(b2);
    }
}