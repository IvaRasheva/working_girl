package com.task_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskExc {
    public static void main(String[] args) throws RangeException {
        Scanner sc = new Scanner(System.in);

        float inputFloat = Float.MIN_VALUE;
        boolean hasExc;

        do {
            hasExc = false;
            System.out.println("Please enter a floating point number: ");

            try {
                inputFloat = sc.nextFloat();
                range(inputFloat);
            } catch (InputMismatchException exc) {
                System.out.printf("You entered invalid floating point number. %n");
                hasExc = true;
                sc.nextLine();
            } catch (RangeException exc) {
				exc.printStackTrace();
                throw new RangeException("Your number should be greater 0 and less or equal to 10!");
            }
        } while (hasExc);

        System.out.println("Your number is correct: " + inputFloat);
    }

    public static void range(float input) throws RangeException{
        if (input < 0 || input > 10){
            throw new RangeException("Wrong range");
        }
    }
}
