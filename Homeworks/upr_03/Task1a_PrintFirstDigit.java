import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = sc.nextInt();
        String firstNumber = inputNumber + "";
        char firstNumberChar = firstNumber.charAt(0);
        int firstDigit = Integer.parseInt(firstNumberChar + "");
        System.out.println(firstDigit);

    }
}
