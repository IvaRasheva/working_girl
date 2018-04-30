import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int nNumbers;

        System.out.println("Please insert one number: ");
        firstNumber = sc.nextInt();
        System.out.println("Please insert as many digest " +
                "as the number above: ");
        for (int i = 0; i < firstNumber; i++) {
            nNumbers = sc.nextInt();

            System.out.print(nNumbers);
            System.out.print("\n");
        }



    }
}
