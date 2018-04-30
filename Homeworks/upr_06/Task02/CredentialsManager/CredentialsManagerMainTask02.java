package Task02.CredentialsManager;

import java.util.Scanner;

public class CredentialsManagerMainTask02 {

        private static CredentialsManager user = new CredentialsManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String task;

        while (true) {
            task = sc.next();


            if (task.equals("END")){
                System.out.println("Bye!");
                break;
            }

            switch (task) {
                case ("ENROLL"):
                    System.out.printf("ENROLL %s%n", user.enroll(sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case ("CHPASS"):
                    System.out.printf("CHPASS %s%n", user.chpass(sc.next(), sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case ("AUTH"):
                    System.out.printf("AUTH %s%n", user.auth(sc.next(), sc.next()) ? "success" : "fail");
                    break;
                default:
                    System.out.println("Your command is invalid.");
                    break;
            }
        }

    }
}
