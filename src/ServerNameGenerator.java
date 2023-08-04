import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Large", "Small", "Medium", "Fat", "Skinny", "Burning", "Freezing", "Beautiful", "Ugly", "Charming"};
    public static String[] nouns = {"Actor", "Airport", "Gold", "Guitar", "Hair", "Hamburger", "Pillow", "Pizza", "Planet", "Zoo"};

    public static String randomElement(String[] array) {
        Random random = new Random();
        int selectedElement = random.nextInt(array.length - 1) + 1;
        return array[selectedElement];

    }

    public static void main(String[] args) {
        System.out.println("Your server name is: " + randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
