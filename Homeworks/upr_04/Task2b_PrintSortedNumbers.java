import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please as many digits as the number above: ");
        int[] nNumbersArray = new int[firstNumber];
        for (int i= 0; i < firstNumber; i++) {
            nNumbersArray[i] = sc.nextInt();
        }
        Arrays.sort(nNumbersArray);
        System.out.print(Arrays.toString(nNumbersArray));

    }
}
