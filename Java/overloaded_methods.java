public class overloaded_methods {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.0, 2.0));
        System.out.println(add(1.0, 2.0, 3.0));
    }
    static double add(double x, double y) {
        return x + y;
    }

    static double add(double x, double y, double z) {
        return x + y + z;
    }

    static int add(int x, int y) {
        return x + y;
    }
}