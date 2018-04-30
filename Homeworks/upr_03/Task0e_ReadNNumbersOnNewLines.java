import java.util.Scanner;
public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        for (int i = 0; i < firstNumber; i++) {
            int secondNumbers = sc.nextInt();

            System.out.print(secondNumbers + " ");
        }
    }
}
