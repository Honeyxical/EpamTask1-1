package by.benikov;

public class Task5 {
    public static void main(String[] args) {
        double  num1 = 2,
                num2 = 3,
                num3 = -5;
        System.out.println("Num 1: " + Exponentiation(num1) +"\nNum 2: " + Exponentiation(num2) + "\nNum 3: " + Exponentiation(num3));
    }

    public static double Exponentiation(double num){
        if(num < 0) return Math.pow(num,4);
        return Math.pow(num,2);
    }
}
