public class overloaded_struct {
    public static void main(String[] args) {
        User user1 = new User("Ravi", "ravi@example.com", 20);
        User user2 = new User("John", "ravi@example.com");
        User user3 = new User("John");
        User user4 = new User();

        System.out.println(user1.username + " " + user1.email + " " + user1.age);
        System.out.println(user2.username + " " + user2.email + " " + user2.age);
        System.out.println(user3.username + " " + user3.email + " " + user3.age);
        System.out.println(user4.username + " " + user4.email + " " + user4.age);
    }
}

class User{
    String username;
    String email;
    int age;

    User(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}