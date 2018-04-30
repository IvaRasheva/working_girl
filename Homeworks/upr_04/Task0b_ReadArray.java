import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numberOfElements = sc.nextInt();
       int[] inputArray = new int[numberOfElements];
       for (int i = 0; i < inputArray.length; i++) {
           inputArray[i] = sc.nextInt();
               if (i != inputArray.length - 1) {
               System.out.print(inputArray[i] + ",");
           } else {
               System.out.print(inputArray[i] + "");
           }
       }

    }
}
