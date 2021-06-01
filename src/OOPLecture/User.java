package OOPLecture;

public class User {

    public int id;
    public String username;
    public String password;
    public String email;

    public static void main(String[] args) {
        User testUser = new User();

        testUser.id = 1;
        testUser.username = "Lexman";
        testUser.password = "12345";
        testUser.email = "lexman@mail.com";

        System.out.println("Username: " + testUser.username);
    }

}
