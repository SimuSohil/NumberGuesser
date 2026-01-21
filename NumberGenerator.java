import java.util.Random;

public class NumberGenerator {
    public int generateNumber() {
        int chosenNumber = 0;

        Random random = new Random();
        chosenNumber = random.nextInt(0,100);

        return chosenNumber;
    }
}