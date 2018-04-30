package Task06_WordReplacement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        System.out.println("Please enter your sentence: ");
        String input = sc.nextLine().toLowerCase();
        String[] sentence = input.split("\\s+");
        List<String> m = new ArrayList<>(Arrays.asList(sentence));

        System.out.println("How many changes you will make: ");
        int changes = sc.nextInt();
        System.out.println("Okay, do it: ");

        for (int i = 0; i < changes; i++) {
            counter = replace(m, sc.next().toLowerCase(), sc.next().toLowerCase(), counter);
        }

        System.out.println("Your new sentence is: ");
        print(m);
    }

    private static int replace(List<String> m, String firstStr, String secondStr, int counter) {

        for (int j = counter; j < m.size(); j++)
            if (m.get(j).contains(firstStr)) {
                m.set(j, secondStr);
                counter++;
                break;
            }
        return counter;
    }

    private static void print(List<String> m) {

        for (String s : m)
                System.out.print(s + " ");
    }
}





