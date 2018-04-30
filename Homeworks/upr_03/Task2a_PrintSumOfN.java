import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        int secondNumber;
        int sumOfNumbers = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert one number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please insert as many digest " +
                "as the number above: ");
        for (int i = 0; i < firstNumber; i++) {
            secondNumber = sc.nextInt();
            sumOfNumbers += secondNumber; }
            System.out.println(sumOfNumbers);
    }

}
