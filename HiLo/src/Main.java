import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Välj mellan lätt, mellan, svår");
        String input1 = input.nextLine();

        int nivå = 0;
        if (input1.equals("lätt")) {
            nivå = 10;
        } else if (input1.equals("mellan")) {
            nivå = 100;
        } else if (input1.equals("svår")) {
            nivå = 1000;
        }

        int randomNumber = new Random().nextInt(nivå) + 1;
        System.out.println("Skriv in ett nummer");
        int guess = input.nextInt();
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("För högt");
            } else {
                System.out.println("För lågt");
            }
            System.out.println("Skriv in ett nytt nummer!");
            guess = input.nextInt();
        }

        System.out.println("Du har rätt!");

    }
}

