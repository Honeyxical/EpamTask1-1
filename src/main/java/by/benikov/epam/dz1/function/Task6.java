package by.benikov.epam.dz1.function;

public class Task6 {
    public static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        return max;
    }

    public static int getMin(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < min) {
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }
        return min;
    }

}
