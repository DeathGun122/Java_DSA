public class methods {
    public static void main(String[] args) {
        
        // System.out.println("Happy Birthday to you!");
        // System.out.println("You are 20 years old!");

        String name = "Ravi";
        int age = 20;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        double squared = square(5.0);
        System.out.println(squared);

        double cubed = cube(5.0);
        System.out.println(cubed);

        String full_name = name("Ravi", "Patel");
        System.out.println(full_name);

        boolean isAdult = ageCheck(19);
        System.out.println(isAdult);
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to " + name + "!");
        System.out.println("You are " + age + " years old!");
    }

    static double square(double x) {
        return x * x;
    }

    static double cube(double x) {
        return Math.pow(x, 3);
    }
    
    static String name(String first_name, String last_name) {
        return first_name + " " + last_name;
    }

    static boolean ageCheck(int age) {
        return age >= 18;
    }
}