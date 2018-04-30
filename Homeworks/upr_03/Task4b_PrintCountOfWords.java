import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String inputString = sc.nextLine();
        int counter = 1;
//        String[] inputStringArray = inputString.split("//s+ ");
        for (int i = 0; i < inputString.length(); i++) {
            char haveSpace = inputString.charAt(i);
            if (haveSpace == ' ')
            counter++;
            if (haveSpace != 'a' && haveSpace != 'A' && haveSpace != 'b' && haveSpace != 'B' &&
                    haveSpace != 'c' && haveSpace != 'C' && haveSpace != 'd' && haveSpace != 'D' &&
                    haveSpace != 'e' && haveSpace != 'E' && haveSpace != 'f' && haveSpace != 'F' &&
                    haveSpace != 'g' && haveSpace != 'G' && haveSpace != 'h' && haveSpace != 'H' &&
                    haveSpace != 'i' && haveSpace != 'I' && haveSpace != 'j' && haveSpace != 'J' &&
                    haveSpace != 'k' && haveSpace != 'K' && haveSpace != 'l' && haveSpace != 'L' &&
                    haveSpace != 'm' && haveSpace != 'M' && haveSpace != 'n' && haveSpace != 'N' &&
                    haveSpace != 'o' && haveSpace != 'O' && haveSpace != 'p' && haveSpace != 'P' &&
                    haveSpace != 'q' && haveSpace != 'Q' && haveSpace != 'r' && haveSpace != 'R' &&
                    haveSpace != 's' && haveSpace != 'S' && haveSpace != 't' && haveSpace != 'T' &&
                    haveSpace != 'u' && haveSpace != 'U' && haveSpace != 'v' && haveSpace != 'V' &&
                    haveSpace != 'w' && haveSpace != 'W' && haveSpace != 'x' && haveSpace != 'X' &&
                    haveSpace != 'y' && haveSpace != 'Y' && haveSpace != 'z' && haveSpace != 'Z' &&
                    haveSpace != ' ' && haveSpace != '.' && haveSpace != ',' && haveSpace != '!' &&
                    haveSpace != '?' && haveSpace != '’') {
                counter--;
            }
        }
        System.out.println(counter);

    }
}
