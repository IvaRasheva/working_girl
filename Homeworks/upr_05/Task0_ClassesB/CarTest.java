package Task0_ClassesB;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car car = new Car(sc.next(), sc.next(),sc.nextInt(), sc.nextInt());

        double taxOutput = car.insuranceTax();
        System.out.println(taxOutput + "lv.");

    }

}
