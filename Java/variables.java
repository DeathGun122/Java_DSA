

public class variables {
    public static void main(String[] args) {
        // int
        int age = 20;
        System.out.println(age);
        int year = 2026;
        System.out.println(year);
        int quantity = 1;
        System.out.println(quantity);

        System.out.println("My age is " + age);

        // double
        double price = 10.99;
        System.out.println(price);
        double gpa = 3.5;
        System.out.println(gpa);

        // char
        char grade = 'A';
        System.out.println(grade);

        // boolean
        boolean isMale = true;
        System.out.println(isMale);

        if(isMale) {
            System.out.println("Male");
        }

        // String
        String name = "John Doe";
        System.out.println(name);
        String message = "Hello, world!";
        System.out.println(message);
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
