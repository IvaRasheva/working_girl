import java.util.Scanner;

public class Task1a_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        int colCount = rowCount;

        int[][] multiDimArray = new int[rowCount][rowCount];
        for (int i = 0; i < rowCount; i++){
            for (int j = 0; j < colCount; j++){
                multiDimArray[i][j] = j * colCount + i + 1;
                System.out.printf("%3d", multiDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
