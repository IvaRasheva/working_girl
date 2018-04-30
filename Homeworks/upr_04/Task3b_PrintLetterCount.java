import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String inputStr = sc.nextLine();
        String inputStrLowCase = inputStr.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++){
            int countInt = 0;
            for (int i = 0; i < inputStrLowCase.length(); i++) {
                char countChar = inputStrLowCase.charAt(i);
                if (countChar == c){
                    countInt++;
                }
            }
            if (countInt > 0){
                System.out.println(c + "(" + countInt + ")");
            }
        }
    }
}
