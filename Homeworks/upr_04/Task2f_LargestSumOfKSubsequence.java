import java.util.Arrays;
import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int secondCounter = 0;
//        int firstCounter = 0;
        int finalSum = 0;
        int tempSum = 0;
        int j = 0;
        int tempIndex;


        System.out.println("Please insert how many numbers we will test: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please insert how many elements we will sum: ");
        int sumNumbers = sc.nextInt();
        System.out.println("Please as many digits as the first number above: ");
        int[] nNumbersArray = new int[firstNumber];
        int[] sumArray  = new int [sumNumbers];
        int[] tempArray = new int [sumNumbers];
        for (int i = 0; i < firstNumber; i++) {
            nNumbersArray[i] = sc.nextInt();
        }

        for (int i = 0; i < nNumbersArray.length - sumNumbers ; i++) {
            tempIndex = i;
            while (j < sumNumbers){
                tempSum += nNumbersArray[tempIndex];
                tempArray[j] = nNumbersArray[tempIndex];
                tempIndex++;
                j++;
            }
            if (finalSum < tempSum) {
                finalSum = tempSum;

                sumArray = tempArray;
            } else {
                sumArray = null;
            }
//            tempArray = null;
            tempSum = 0;
            j = 0;
        }
        String sumString = Arrays.toString(sumArray);
        System.out.println(sumString);
    }
}

//            for (int j = i + 1; j < 1 + sumNumbers; j++) {
//                secondCounter += nNumbersArray[j];
//            }
//            if (firstCounter < secondCounter) {
//                firstCounter = 0;
//                tempSum = secondCounter;
//                secondCounter = 0;
//            } else if (secondCounter < firstCounter) {
//                secondCounter = 0;
//                tempSum = firstCounter;
//                firstCounter = 0;
//            }
//            if (finalSum < tempSum) {
//                finalSum = tempSum;
//            }
////            int max = Math.max(secondCounter, firstCounter);
//
//
////                continue;
//        }
//        System.out.print(finalSum);
//    }
//}


