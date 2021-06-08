package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        test.getString("Enter a sentence");
        test.yesNo("Enter yes or no");
        test.getInt(1, 10);
        test.getInt();
        test.getDouble(1.5, 2.3);
        test.getDouble();

    }
}
