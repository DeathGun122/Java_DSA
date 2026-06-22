public class string_methods {
    public static void main(String[] args) {
        String name = "Ravi";
        System.out.println(name.length());

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.trim());
        
        System.out.println(name.replace('a', 'e'));

        System.out.println(name.isEmpty());

        if(name.isEmpty()) {
            System.out.println("Name is empty");
        }
        else {
            System.out.println("Name is not empty");
        }

        System.out.println(name.contains(" "));

        System.out.println(name.equals("Ravi"));

        System.out.println(name.equalsIgnoreCase("RAVI"));
    }
}
