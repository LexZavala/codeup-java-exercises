package OOPLecture;

public class User {

    public int id;
    public String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    public String getPassword () {
        return password;
    }

    public String setPassword(String password){
        return this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public User(String username, String password, String email, boolean isLoggedIn){
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn;

    }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {}

    public static void main(String[] args) {
        User testUser = new User();

        testUser.id = 1;
        testUser.username = "Lexman";
        testUser.password = "12345";
        testUser.email = "lexman@mail.com";

        System.out.println("Username: " + testUser.username);

        User user2 = new User("lex-username", "password", "email@gmail.com");

        System.out.println("Usename: " + user2.username);
    }

}
