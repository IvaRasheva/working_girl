import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++){
            char inputStringChar = inputString.charAt(i);

            System.out.println(inputStringChar);
        }

    }
}
