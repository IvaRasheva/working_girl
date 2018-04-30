import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNumber = sc.nextInt();
        int x = 0;

        while (x++ < inputNumber) {
            System.out.print("* ");
        }
        System.out.println();
        x = 0;
        while (x++ < inputNumber - 2) {
            System.out.print("*");
            int y = 0;
            while (y++ < inputNumber - 2) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        x = 0;
        while (x++ < inputNumber) {
            System.out.print("* ");
        }
    }
}
