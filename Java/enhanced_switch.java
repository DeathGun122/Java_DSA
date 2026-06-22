public class enhanced_switch {
    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> 
                System.out.println("It's a weekday");
            case "SATURDAY", "SUNDAY" -> 
                System.out.println("It's a weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
