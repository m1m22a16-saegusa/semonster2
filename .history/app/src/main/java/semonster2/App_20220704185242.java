/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Data data = new Data();
        User user1 = new User("koudai", "oit2022");
        User user2 = new User("daikou", "oit2022");
    
        data.addUser(user1);
        data.addUser(user2);
    
        user1.nyukin(500);
        user2.nyukin(200);

        data.sendUser(user1, user2, 100)

        System.out.println(user1.getUserName());
        System.out.println(user1.getZandaka());
        System.out.println(data.ginkoZandaka());
    }
}
