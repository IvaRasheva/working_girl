import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String args[]) {
        String inputText;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        inputText = sc.nextLine();

        System.out.println(inputText);
    }
}
