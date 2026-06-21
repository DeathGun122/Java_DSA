public class flags {
    public static void main(String[] args) {
        double price1 = 10.99;
        double price2 = 3.14159;
        double price3 = -2.71828;
        
        // + flag
        System.out.printf("%+.2f\n", price1); 
        System.out.printf("%+.2f\n", price2); 
        System.out.printf("%+.2f\n", price3);

        // - flag
        System.out.printf("%-10.2f\n", price1); 
        System.out.printf("%-10.2f\n", price2); 
        System.out.printf("%-10.2f\n", price3);

        // , flag
        System.out.printf("%,10.2f\n", price1); 
        System.out.printf("%,10.2f\n", price2); 
        System.out.printf("%,10.2f\n", price3);

        // ( flag
        System.out.printf("%(10.2f\n", price1); 
        System.out.printf("%(10.2f\n", price2); 
        System.out.printf("%(10.2f\n", price3);

        // 0 flag
        System.out.printf("%010.2f\n", price1); 
        System.out.printf("%010.2f\n", price2); 
        System.out.printf("%010.2f\n", price3);

        // +ve number
        System.out.printf("%10.2f\n", price1); 
        System.out.printf("%10.2f\n", price2); 
        System.out.printf("%10.2f\n", price3);

        // -ve number
        System.out.printf("%-10.2f\n", price1); 
        System.out.printf("%-10.2f\n", price2); 
        System.out.printf("%-10.2f\n", price3);
    }
}
