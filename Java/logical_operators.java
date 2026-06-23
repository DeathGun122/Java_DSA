public class logical_operators {
    public static void main(String[] args) {
        // and
        boolean a = true;
        boolean b = false;
        boolean andResult = a && b;

        // or
        boolean orResult = a || b;

        // not
        boolean notResult = !a;

        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("NOT result: " + notResult);

        double temp = 40;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The temperature is within the safe range.");
            System.out.println("It is sunny outside.");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The temperature is within the safe range.");
            System.out.println("It is cloudy outside.");
        } else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad.");
        }

        
    }
}
