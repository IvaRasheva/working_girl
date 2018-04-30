import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your string: ");
        String inputSentence = sc.nextLine();

        System.out.println("Please enter what action do you need, encode or decode: ");
        String inputAction = sc.nextLine();

        boolean encode = inputAction.equals("encode");
        boolean decode = inputAction.equals("decode");
        char currentChar;
        char[] outputString = new char[inputSentence.length()];


        for (int i = 0; i < inputSentence.length(); i++) {
            currentChar = inputSentence.charAt(i);

            if (encode) {
                if (currentChar == ' ' || currentChar == '!' || currentChar == '?' || currentChar == '.' || currentChar == ',') {
                    outputString[i] = currentChar;
                } else {
                    currentChar++;
                    outputString[i] = (currentChar);
                }
            }

            if (decode) {
                if (currentChar == ' ' || currentChar == '!' || currentChar == '?' || currentChar == '.' || currentChar == ',') {
                    outputString[i] = currentChar;
                } else {
                    currentChar--;
                    outputString[i] = (currentChar);
                }
            }
        }


        System.out.print(outputString);
    }
}
