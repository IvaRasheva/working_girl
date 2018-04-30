import java.util.Scanner;
public class Task0c_ReadAge {
    public static void main(String args[]){
        int inputAge;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        inputAge = sc.nextInt();
        if (inputAge <= 0 || inputAge > 120) {
            System.out.println("You are a liar!");
        } else if (inputAge < 18) {
            System.out.println("You aren't adult!");
        } else {
            System.out.println("You are adult!");
        }
    }
}

