public class ternary {
    public static void main(String[] args) {
        int score = 55;

        String result = score >= 50 ? "Pass" : "Fail";
        System.out.println(result);

        int number = 10;
        String evenOdd = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(evenOdd);

        int hours = 13;
        String timeOfDay = hours < 12 ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = income > 40000 ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
