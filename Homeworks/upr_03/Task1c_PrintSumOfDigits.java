import java.util.Scanner;
public class Task1c_PrintSumOfDigits {
    public static void main(String args[])
    {
        int outputNumber = 0;
        int reminder = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = sc.nextInt();

        while (inputNumber > 0){
            reminder = inputNumber % 10;
            outputNumber = outputNumber + reminder;
            inputNumber = inputNumber / 10;
        }
        System.out.println(outputNumber);

    }
}
