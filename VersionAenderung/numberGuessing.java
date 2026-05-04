import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1; 
        int guess = 0;

        System.out.println("Devine le nombre (entre 1 et 100) :");

        while (guess != secret) {
            System.out.print("Ton choix : ");
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("C'est plus !");
            } else if (guess > secret) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Bravo, tu as trouvé !");
            }
        }

        scanner.close();
    }
}
