import java.util.Scanner;
public class Task1b_PrintMirrorNumber {
    public static void main(String args[]){
        int reverseNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = sc.nextInt();

        while (inputNumber != 0)
        {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        System.out.println(reverseNumber);
    }
}
