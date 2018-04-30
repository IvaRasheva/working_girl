import java.util.Scanner;
public class Task0a_ReadInt {
    public static void main(String args[]){
        int inputNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter one number: ");
        inputNumber = sc.nextInt();
        System.out.println(++inputNumber);
    }
}
