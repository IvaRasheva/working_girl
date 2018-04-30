package Task01_UniqueMembers;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueNums = new LinkedHashSet<Integer>();

        System.out.print("How many numbers you will enter? \n");
        int num = sc.nextInt();
        System.out.println("Okay, do it! ");

        for (int i = 0; i < num; i++){
            int nums = sc.nextInt();
            uniqueNums.add(nums);
        }
        for (Integer i : uniqueNums){
            System.out.print(i + " ");
        }
    }
}
