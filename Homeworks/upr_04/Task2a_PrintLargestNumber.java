import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please as many digits as the number above: ");
        int nNumbers = sc.nextInt();
        for (int i = 0; i < firstNumber; i++) {
            if (nNumbers > maxValue) {
                maxValue = nNumbers;
            }
        }
            System.out.println("Max value is " + maxValue);
    }
}
