package by.benikov.epam.dz1.functions;

public class Task7 {
    public static void main(String[] args) {
        int a = 2, b = 15, h = 3;
        printTable(a, b, h);
    }

    public static void printTable(int a, int b, int h){
        for (int i = a; i <= b; i += h){
            System.out.println( i + "\t " + funcRez(i));
        }
    }

    private static double funcRez(int x) {
        return Math.pow(Math.sin(x),2) - Math.cos(2 * x);
    }
}
