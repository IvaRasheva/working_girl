public class Task0d_Print2dArray {
    public static void main(String[] args) {
        int rowCount = 4;
        int colCount = 4;

        int[][] multiDimArray = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++){
            for (int j = 0; j < colCount; j++){
                multiDimArray[i][j] = i * colCount + j + 1;
                System.out.printf("%3d", multiDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
