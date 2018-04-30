import java.util.Scanner;

public class Task5_PersonCharacteristic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now we will talk about your children. How many children do you have? ");
        int childrenN = sc.nextInt();
        while (true) {
            if (childrenN <= 0) {
                System.err.println("You already tell us you have children. Please enter valid number: ");
                childrenN = sc.nextInt();
            } else break;
        }

            System.out.println("Okay, let's go!");
            for (int i = 0; i < childrenN; i++) {

                Scanner firstName = new Scanner(System.in);
                System.out.println("Please enter your child's first name: ");
                String firstNameInput = firstName.nextLine();
                while (true) {
                    if (!firstNameInput.matches("[a-zA-Z]+")) {
                        System.err.println("Your child's name should contains only letters. \nPlease enter your child's first name: ");
                        firstNameInput = firstName.nextLine();
                    } else break;
                }

                Scanner secondName = new Scanner(System.in);
                System.out.println("Please enter your child's last name: ");
                String secondNameInput = secondName.nextLine();
                while (true) {
                    if (!secondNameInput.matches("[a-zA-z]+")) {
                        System.err.println("Your child's name should contains only letters. \nPlease enter your child's last name: ");
                        secondNameInput = secondName.nextLine();
                    } else break;
                }

                Scanner yearOfBirth = new Scanner(System.in);
                System.out.println("Please enter your child's year of birth: ");
                int yearOfBirthInput = yearOfBirth.nextInt();
                while (true) {
                    if (yearOfBirthInput < 1900 || yearOfBirthInput > 2017) {
                        System.err.println("You entered invalid year of birth. \nPlease enter your child's year of birth:  ");
                        yearOfBirthInput = yearOfBirth.nextInt();
                    } else break;
                }

                Scanner weight = new Scanner(System.in);
                System.out.println("Please enter your child's weight: ");
                double weightInput = weight.nextDouble();
                while (true) {
                    if (weightInput < 1 || weightInput > 200) {
                        System.err.println("You entered invalid weight. \nPlease enter your child's weight: ");
                        weightInput = weight.nextDouble();
                    } else break;
                }

                Scanner height = new Scanner(System.in);
                System.out.println("Please enter your child's height: ");
                int heightInput = height.nextInt();
                while (true) {
                    if (heightInput < 1 || heightInput > 300) {
                        System.err.println("You entered invalid height. \nPlease enter your child's height: ");
                        heightInput = height.nextInt();
                    } else break;
                }

                Scanner profession = new Scanner(System.in);
                System.out.println("Please enter your child's profession: ");
                String professionInput = profession.nextLine();
                while (true) {
                    if (!professionInput.matches("[a-zA-z]+")) {
                        System.err.println("Your child's profession should contains only letters. \nPlease enter your child's profession: ");
                        professionInput = profession.nextLine();
                    } else break;
                }

                if (2018 - yearOfBirthInput >= 18) {
                    System.out.println(firstNameInput + " " + secondNameInput + " is " +
                            (2018 - yearOfBirthInput) + " years old. He was born in " + yearOfBirthInput + ". His weight is " + weightInput +
                            " and he is " + heightInput + " cm tall. He is a " + professionInput + ".");
                } else {
                    System.out.println(firstNameInput + " " + secondNameInput + " is " +
                            (2018 - yearOfBirthInput) + " years old. He was born in " + yearOfBirthInput + ". His weight is " + weightInput +
                            " and he is " + heightInput + " cm tall. He is a " + professionInput + ". " + firstNameInput + " " + secondNameInput + " is under-aged.");
                }
                if (i < childrenN - 1) {
                    System.out.println("\n" + "Okay, what about the next one? \n");
                } else {
                    System.out.println("Thank you!");
                }

            }

        }
    }
