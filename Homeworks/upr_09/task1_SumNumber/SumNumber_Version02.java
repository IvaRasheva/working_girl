package com.task1_SumNumber;

import java.util.Scanner;

public class SumNumber_Version02 {
    public static int sum = 0;
    public static void sumNumbers(int n1, int n2) throws RangeException, EqualNumbsException {
        if (n1 == n2) {
            throw new RangeException();
        } else if (n1 < 0 || n2 < 0) {
            throw new EqualNumbsException();
        } else {
            sum = n1 + n2;
            System.out.println("The sum is " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two different numbers: ");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        try {
            sumNumbers(number1, number2);
        } catch (RangeException re) {
            System.out.println("The numbers cannot be equals ");
        } catch (EqualNumbsException en) {
            System.out.println("The numbers cannot be negative ");
        }

    }
}
