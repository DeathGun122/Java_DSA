public class nested_if {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a student discount of 10%.");
                System.out.println("You get an additional 20% discount for being a senior.");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%.");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get an additional 20% discount for being a senior.");
                price *= 0.8;
            }
            else{
                System.out.println("You don't get any discounts.");
            }
        }

        System.out.printf("Price: $%.2f", price);
    }
}
