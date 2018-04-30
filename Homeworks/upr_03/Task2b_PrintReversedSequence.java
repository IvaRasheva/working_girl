import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        String secondNumbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please insert as many digest " +
                "as the number above: ");
        for (int i = 0; i < firstNumber; i++) {
            secondNumbers = sc.nextLine();

            System.out.println(new StringBuilder(secondNumbers).reverse().toString());

        }
    }
}

