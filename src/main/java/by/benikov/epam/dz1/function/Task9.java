package by.benikov.epam.dz1.function;

public class Task9 {
    public static int[] solution(int[] ar1, int[] ar2, int position) {
        int[] rez = new int[ar1.length + ar2.length];

        for(int i = 0; i <= position; i++){
            if(i == position){
                for(int j = 0; j < ar2.length; j++){
                    rez[i + j] = ar2[j];
                }
                break;
            }
            rez[i] = ar1[i];
        }
        for(int i = 0; i < rez.length - (ar2.length + position); i++){
            rez[i + ar2.length + position] = ar1[i + position];
        }
        return rez;
    }
}
