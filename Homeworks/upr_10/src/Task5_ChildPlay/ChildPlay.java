package Task5_ChildPlay;

import java.util.*;

public class ChildPlay {

    private static Integer playIteration(List<Integer> kids){

        List<Integer> tempArr = new ArrayList<>();
        int counter = 0;

        while (kids.size() > 1) {

            for (int i = 0; i < kids.size() - 1; i++) {
                if (kids.get(i + 1) > kids.get(i)) {
                    tempArr.add(kids.get(i + 1));
                }
            }
            if (!tempArr.isEmpty()) {
                kids.removeAll(tempArr);
                tempArr.clear();
                kids = new ArrayList<>(kids);
                counter++;
            } else break;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intsList = new ArrayList<>();

        int firstNum = sc.nextInt();

        for (int i = 0; i < firstNum; i++){
            int nums = sc.nextInt();
            intsList.add(nums);
        }

        System.out.println(playIteration(intsList));
    }
}
