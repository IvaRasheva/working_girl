import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuffer reverse = new StringBuffer(inputString).reverse();
        String inputStringRev = reverse.toString();

        if (inputString.equals(inputStringRev)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
