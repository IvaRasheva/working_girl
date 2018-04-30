import java.util.Scanner;
public class Task04_PersonCharacteristics {
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

            Scanner gender = new Scanner(System.in);
            System.out.println("Please enter your child's gender. Choose M for male or F for female.\n" +
                    "M/F: ");
            String inputGender = gender.nextLine();
            char inputGenderChar;
            while (true) {
                if (inputGender.length() != 1) {
                    System.err.println("Please insert only one letter from your keyboard. \n" +
                            "Choose M for male or F for female.\n" +
                            "M/F: ");
                    inputGender = gender.nextLine();
                } else break;
            }

            while (true) {
                if (!inputGender.startsWith("M") && !inputGender.startsWith("F") &&
                        !inputGender.startsWith("m") && !inputGender.startsWith("f")) {
                    System.err.println("Your input letter is invalid. \n" +
                            "Choose M for male or F for female.\n" +
                            "M/F");
                    inputGender = gender.nextLine();
                } else break;
            }

            inputGenderChar = inputGender.charAt(0);
            //            System.out.println(inputGenderChar[0]);


            Scanner yearOfBirth = new Scanner(System.in);
            System.out.println("Please enter your child's year of birth: ");
            int yearOfBirthInput = yearOfBirth.nextInt();
            while (true) {
                if (yearOfBirthInput < 1900 || yearOfBirthInput > 2018) {
                    System.err.println("You entered invalid year of birth. \nPlease enter your child's year of birth:  ");
                    yearOfBirthInput = yearOfBirth.nextInt();
                } else break;
            }
            yearOfBirthInput = 2018 - yearOfBirthInput;

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
                if (!professionInput.matches("[a-zA-z]+") && !professionInput.matches("\\s+")) {
                    System.err.println("Your child's profession should contains only letters. \nPlease enter your child's profession: ");
                    professionInput = profession.nextLine();
                } else break;
            }

            Scanner grade = new Scanner(System.in);
            System.out.println("Please enter your child's math assessment and press [Enter] or [Space] for next input: ");
            double[] gradeInput = new double[4];
            double gradeSum = 0;
            for (int j = 0; j < 4; j++) {
                gradeInput[j] = grade.nextDouble();
                while (true) {
                    if (gradeInput[j] < 2 || gradeInput[j] > 6) {
                        System.err.println("You entered invalid assessments. \n" +
                                "Please insert number between 2 and 6: ");
                        gradeInput[j] = grade.nextDouble();
                    } else break;
                }
                gradeSum += gradeInput[j];

//                System.out.println(gradeInput[j]);
            }
            gradeSum = gradeSum / 4;

            if (inputGenderChar == ('M') || inputGenderChar == ('m')) {
                if (2018 - yearOfBirthInput >= 18) {
                    System.out.printf("%s %s is %d years old. His weight is %.1f and he is %d cm tall. He is a %s " +
                                    "with average grade of %.3f.", firstNameInput, secondNameInput,
                            yearOfBirthInput, weightInput, heightInput, professionInput, gradeSum);
                } else {
                    System.out.printf("%s %s is %d years old. His weight is %.1f and he is %d cm tall. He is a %s " +
                                    "with average grade of %.3f. %s %s is under-aged.", firstNameInput, secondNameInput,
                            yearOfBirthInput, weightInput, heightInput, professionInput, gradeSum,
                            firstNameInput, secondNameInput);
                }
            }
            if (inputGenderChar == ('F') || inputGenderChar == ('f')) {
                if (2018 - yearOfBirthInput >= 18) {
                    System.out.printf("%s %s is %d years old. Her weight is %.1f and she is %d cm tall. She is a %s " +
                                    "with average grade of %.3f.", firstNameInput, secondNameInput,
                            yearOfBirthInput, weightInput, heightInput, professionInput, gradeSum);
                } else {
                    System.out.printf("%s %s is %d years old. Her weight is %.1f and she is %d cm tall. She is a %s " +
                                    "with average grade of %.3f. %s %s is under-aged.", firstNameInput, secondNameInput,
                            yearOfBirthInput, weightInput, heightInput, professionInput, gradeSum,
                            firstNameInput, secondNameInput);
                }
            }
            if (i < childrenN - 1) {
                System.out.println("\n" + "Okay, what about the next one? \n");
            } else {
                System.out.println();
                System.out.println("\n" + "Thank you!");
            }

        }

    }
}

