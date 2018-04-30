import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
//        int counter = 0;
//        boolean isEven = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Please insert as many digest " +
                "as the number above: ");
        int secondNumbers;
        for (int i = 0; i < firstNumber; i++) {
            secondNumbers = sc.nextInt();
            if (secondNumbers % 2 == 0) {
                System.out.print(secondNumbers + " ");
            }
//            counter++;
//        }
//        if (counter == firstNumber) {
        }
    }
}

