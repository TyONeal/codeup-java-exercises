package util;

public class InputTest {
    public static void main(String[] args) {
        Input newInput = new Input();
        newInput.getString();
        newInput.yesNo();
        newInput.getInt(1, 5);
        newInput.getInt();
        newInput.getDouble(1, 5);
        newInput.getDouble();
    }
}
