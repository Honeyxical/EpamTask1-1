package by.benikov.epam.dz1.function;

public class Task8 {
    public static int getSum(int[] array, int k){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % k == 0){
                sum+= array[i];
            }
        }
        return sum;
    }
}
