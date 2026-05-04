import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {

            int secret = random.nextInt(100) + 1;
            int guess = 0;
            int guessCounter = 0;
            int score = 0;

            System.out.println("Guess the number (between 1 and 100) :");

            while (guess != secret) {
                System.out.print("Your choice : ");
                guess = scanner.nextInt();

                System.out.println("Your number of Guess : ");
                guessCounter++;

                if (guess < secret) {
                    System.out.println("It's bigger !");
                } else if (guess > secret) {
                    System.out.println("It's lower !");
                } else {
                    System.out.println("Congrates, you guessed right !");
                    score++;
                }
            }
            scanner.nextLine();

            System.out.println("Do you want to continue playing? Yes or No");
            String continuePlaying = scanner.nextLine();

            if (continuePlaying.equalsIgnoreCase("Yes")) {
                playAgain = true;
                System.out.println("Your current score : "+score);
            } else if (continuePlaying.equalsIgnoreCase("No")) {
                playAgain = false;
                System.out.println("You ended with the score : "+score);
            } else {
                System.out.println("Invalid Input");
            }

            scanner.close();
        }
    }
}
