package Task3_ParenthesesMatching;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3_ParenthesesMatching {

    public static boolean isMatching(String inputStr){
        Deque<Character> stringStack = new ArrayDeque<Character>();
        char input = ' ';

        for (int i = 0; i < inputStr.length(); i++) {
            input = inputStr.charAt(i);

            switch (input) {
                case '{':
                    stringStack.push(input);
                    break;
                case '[':
                    stringStack.push(input);
                    break;
                case '(':
                    stringStack.push(input);
                    break;
                case '}':
                    if (stringStack.peek().equals('{')) {
                        stringStack.pop();
                    } else return false;
                    break;
                case ']':
                    if (stringStack.peek().equals('[')) {
                        stringStack.pop();
                    } else return false;
                    break;
                case ')':
                    if (stringStack.peek().equals('(')) {
                        stringStack.pop();
                    } else return false;
                    break;
                default:
                    break;
            }
        }
    return stringStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(isMatching(input));

    }
}
