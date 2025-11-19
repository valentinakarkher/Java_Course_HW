package java_lesson_hw_10;

public class MainUser {
    public static void main (String []args)throws CloneNotSupportedException{
        createUsers();
    }
    public static void createUsers() throws CloneNotSupportedException {
        User user1 = new User("Kate","12345678");
        User user2 =  new User("Kate","12345678");
        User user3 =  new User("Katya","12345678");
        System.out.println("Does user1 equals user2 ? -> "+user1.equals(user2));
        System.out.println("Does user2 equals user3 ? -> "+user2.equals(user3));

        User userOriginal = new User ("Kate","12345678", new UserLogInValue(1234));
        userOriginal.cloneUserComplicatedMethod("deep",userOriginal);

    }
}
