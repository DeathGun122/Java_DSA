public class substring {
    public static void main(String[] args) {
        String email = "ravi@example.com";

        String username = email.substring(0, email.indexOf('@'));
        System.out.println(username);
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(domain);
    }
}
