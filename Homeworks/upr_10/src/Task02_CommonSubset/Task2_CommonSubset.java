package Task02_CommonSubset;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> firstNums = new LinkedHashSet<Integer>();
        Set<Integer> secondNums = new LinkedHashSet<Integer>();

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < firstNum; i++){
            int nums = sc.nextInt();
            firstNums.add(nums);
        }

        for (int i = 0; i < secondNum; i++){
            int nums = sc.nextInt();
            secondNums.add(nums);
        }

        for (Integer i : firstNums){
            if (secondNums.contains(i)){
                System.out.print(i + " ");
                counter++;
            }
        }

        if (counter == 0)
            System.out.println("NO ");
    }
}
