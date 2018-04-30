import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        int sumRightToLeft = 0;
        int sumLeftToRight = 0;
        boolean noSumFound = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please as many digits as the number above: ");
        int[] nNumbersArray = new int[firstNumber];
        for (int i = 0; i < firstNumber; i++) {
            nNumbersArray[i] = sc.nextInt();
        }
        for (int j = 0; j < nNumbersArray.length; j++) {
            sumLeftToRight += nNumbersArray[j];
            for (int i = nNumbersArray.length - 1; i > j; i--) {
                sumRightToLeft += nNumbersArray[i];
            }
            if (sumLeftToRight == sumRightToLeft) {
                System.out.printf("%d", j);
                noSumFound = false;
                break;
            }
            sumRightToLeft = 0;
        }
        if (noSumFound) {
            System.out.println("NO");
        }
    }
}






