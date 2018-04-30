import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter as many sentence as you want: ");

        String inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            char endOfSentence = inputString.charAt(i);
            System.out.print(endOfSentence);
            if (endOfSentence == '.' || endOfSentence == '!' || endOfSentence == '?') {
                System.out.println();
            }
        }
    }
}
