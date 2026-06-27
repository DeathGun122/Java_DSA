public class static_{
    public static void main(String[] args) {
        Friend friend1 = new Friend("Ravi");
        Friend friend2 = new Friend("John");

        System.out.println(friend1.name); 
        System.out.println(friend2.name);
        System.out.println(Friend.num_friends);

        Friend.showFriends();
    }
}
class Friend{
    static int num_friends;
    String name;

    Friend(String name){
        this.name = name;
        num_friends++;
    }

    static void showFriends(){
        System.out.println("You have "+ num_friends + " friends.");
    }
}