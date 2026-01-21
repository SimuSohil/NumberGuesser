import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guessNumber = 0;
        int actualNumber = 0;

        Scanner input = new Scanner(System.in);
        NumberGenerator numberGenerator = new NumberGenerator();

        actualNumber = numberGenerator.generateNumber();

        for (int i = 0; i < 5; i += 1) {
            System.out.print("Enter your number: ");
            guessNumber = input.nextInt();

            if (guessNumber == actualNumber) {
                System.out.println("YOU HAVE GUESSED THE NUMBER!");
                break;
            }
        }

        input.close();
        System.out.println("THE NUMBER IS: " + actualNumber);
        System.out.println("OOPS! YOU HAVE LOST THE GAME. TRY AGAIN.");

    }
}
