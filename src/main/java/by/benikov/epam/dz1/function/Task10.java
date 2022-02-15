package by.benikov.epam.dz1.function;

public class Task10 {
    public static int[][] getMatrix(int n){
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 != 0){
                    array[i][j] = n - j;
                    continue;
                }
                array[i][j] = j + 1;
            }
        }
        return array;
    }
}
