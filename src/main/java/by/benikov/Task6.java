package by.benikov;

public class Task6 {
    public static void main(String[] args) {
        int num1 = 3,
                num2 = 5,
                num3 = 0;
        System.out.println(getMin(num1, num2, num3) + getMax(num1, num2, num3));
    }

    private static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        return max;
    }

    private static int getMin(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        return min;
    }

}
