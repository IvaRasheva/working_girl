import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter as many sentence as you want: ");
        int sum = 0;
        String inputString = sc.nextLine();
        for (String token : inputString.split("\\s+")){
            try
            {
                sum += Integer.parseInt(token);
            }
            catch (Exception error)
            {
            }
        }

        System.out.println(sum);
        }
    }

