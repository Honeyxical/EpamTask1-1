package by.benikov;

public class Task8 {
    public static void main(String[] args) {
        int k = 3;
        int[] array = new int[] {4, 10, 9, 16, 18, 7};
        System.out.println(getSum(array, k));
    }

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
