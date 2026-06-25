public class variable_scope {

    static int x = 0; // Global variable

    public static void main(String[] args) {
        System.out.println(x);

        int y = 1;
        System.out.println(y);
        
        local_scope();

    }
    static void local_scope(){
        int y = 2;
        System.out.println(y);
    }
}
