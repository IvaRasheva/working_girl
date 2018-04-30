import java.util.Scanner;

public class Task3e_ConvertibleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isContains = false;
        String inputFirstString = sc.nextLine();
        String inputSecondString = sc.nextLine();
        if (inputFirstString.contains(inputSecondString)){
            isContains = true;
        }
        System.out.println(isContains);

    }
}
