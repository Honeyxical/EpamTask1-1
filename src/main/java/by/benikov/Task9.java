package by.benikov;

public class Task9 {
    public static void main(String[] args) {
        int[] ar1 = new int[]{4,2,5,7,4,11,2,4,5,0};
        int[] ar2 = new int[]{11,1,111,12,4,5};
        int[] rez = new int[ar1.length+ar2.length];
        int k = 5;

        for(int i = 0; i <= k; i++){
            if(i == k){
                for(int j = 0; j < ar2.length; j++){
                    rez[i+j] = ar2[j];
                }
                break;
            }
            rez[i] = ar1[i];
        }
        for(int i = 0; i < rez.length - (ar2.length + k); i++){
            rez[i + ar2.length+k] = ar1[i+k];
        }
    }
}
