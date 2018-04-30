package Task01_CalculatorClient;

import java.util.Scanner;

public class Task1_CalculatorClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            Calculator calculator = new Calculator(sc.next(), sc.nextDouble(), sc.nextDouble());
            if (calculator.task.equals("SUM")) {
                double sumNumbers = calculator.sumNumbers();
                System.out.printf("%n%.3f ", sumNumbers);

            } else if (calculator.task.equals("SUB")) {
                double subNumbers = calculator.subNumbers();
                System.out.printf("%n%.3f ", subNumbers);

            } else if (calculator.task.equals("MUL")) {
                double mulNumbers = calculator.mulNumbers();
                System.out.printf("%n%.3f ", mulNumbers);

            } else if (calculator.task.equals("DIV")) {
                double divNumbers = calculator.divNumbers();
                System.out.printf("%n%.3f ", divNumbers);

            } else if (calculator.task.equals("PER")) {
                double perNumbers = calculator.perNumbers();
                System.out.printf("%n%.3f ", perNumbers);

            } else if (calculator.task.equals("END")) {
                break;
            }
        }
    }
}

