import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNumber = sc.nextInt();
        for (int x = 0; x < inputNumber; x++) {
            for (int y = 0; y < inputNumber; y++) {
                if (x == 0 || x == inputNumber - 1 || y == inputNumber - 1 - x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
