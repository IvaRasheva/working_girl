import java.util.Arrays;
import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
//        int prevItem = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please as many digits as the number above: ");
        int[] nNumbersArray = new int[firstNumber];
        for (int i = 0; i < firstNumber; i++) {
            nNumbersArray[i] = sc.nextInt();
        }
        Arrays.sort(nNumbersArray);
        for (int i = 1; i < nNumbersArray.length - 1; i++) {
            if (nNumbersArray[i] == nNumbersArray[i - 1]) {
//                prevItem = nNumbersArray[i];
                counter++;
                if (nNumbersArray[i] == nNumbersArray[i + 1]){
                    counter--;
                    if (nNumbersArray[i - 1] == nNumbersArray[i]){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
