public class wrapper {
    public static void main(String[] args) {
        // int a = 123;

        // Integer a = new Integer(123);
        // Double b = new Double(12.3);
        // Character c = new Character('c');
        // Boolean d = new Boolean(true);

        // Modern Syntax -> Autoboxing
        Integer a2 = 123;
        Double b2 = 12.3;
        Character c2 = 'c';
        Boolean d2 = true;

        // String e = "123";

        // Unboxing
        int a3 = a2;
        double b3 = b2;
        char c3 = c2;
        boolean d3 = d2;

        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(d3);

        // Wrapper class methods
        String a = Integer.toString(123);
        int b = Integer.parseInt("123");

        System.out.println(a);
        System.out.println(b);

        char letter = 'a';
        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isLetterOrDigit(letter));
        System.out.println(Character.toUpperCase(letter));
        System.out.println(Character.toLowerCase(letter));

    }
}