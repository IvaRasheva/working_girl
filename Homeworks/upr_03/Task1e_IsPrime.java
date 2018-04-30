import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String args[]){
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        int inputNumber = sc.nextInt();
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
            if (isPrime) {
                System.out.println(true);
            } else {
                System.out.println(false);

            }
    }
}
