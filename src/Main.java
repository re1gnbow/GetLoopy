import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int rollCount = 0;
        boolean triple = false;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        while (!triple) {
            rollCount++;
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3) {
                triple = true;
            }

            System.out.print("Do you want to continue rolling? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();
    }
}