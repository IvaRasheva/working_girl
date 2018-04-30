package com.task_NumberNotANumber;

import java.util.Scanner;

public class NumberNotANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mainLoop:
        while (true){
            System.out.println("Please enter one number: ");
            String input = sc.nextLine();

            switch (input) {
                case "END":
                    System.out.println("Bye!");
                    break mainLoop;
                default:
                    try {
                        Integer.parseInt(input);
                    } catch (NumberFormatException exc) {
                        System.out.printf("Not a number %n");
                    }
                    System.out.printf("Number %n");
                    break;
            }
        }
    }
}
