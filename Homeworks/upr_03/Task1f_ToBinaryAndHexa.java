import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = sc.nextInt();
        System.out.println(Integer.toBinaryString(inputNumber));
        System.out.println(Integer.toHexString(inputNumber));
    }
}
