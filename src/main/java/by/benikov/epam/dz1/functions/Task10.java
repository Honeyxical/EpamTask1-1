package by.benikov.epam.dz1.functions;

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

//    public static void print(int[][] array){
//        for(int i = 0; i < array.length; i++){
//            for (int j = 0; j < array.length; j++){
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println("\n");
//        }
//    }
}
