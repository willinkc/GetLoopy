
import java.util.Scanner;
import java.util.Random;
public class DieRoller {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String answer = "yes";

        while(answer.equals("yes")) {
            int roll = 0;
            int die1, die2, die3;

            System.out.printf("Roll Die1 Die2 Die3 Sum%n");
            System.out.println("--------------------------");

            do {
                roll++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                System.out.printf("%d    %d    %d    %d    %d%n",
                        roll, die1, die2, die3, die1 + die2 + die3);

            } while(die1 != die2 || die2 != die3);

            System.out.println("You rolled a triple!");
            System.out.print("Play again? (yes/no): ");
            answer = in.nextLine();
        }
    }
}
