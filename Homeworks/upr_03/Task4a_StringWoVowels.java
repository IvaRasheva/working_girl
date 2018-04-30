import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        char vowels;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++){
            vowels = inputString.charAt(i);
            switch (vowels)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': counter++;
            }
            if (counter == 1) {
                System.out.print("");
                counter = 0;
            } else {
                System.out.print(vowels);
            }
        }
    }
}
