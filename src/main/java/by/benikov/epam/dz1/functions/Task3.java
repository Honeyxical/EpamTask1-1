package by.benikov.epam.dz1.functions;

public class Task3 {
    public static void main(String[] args) {
        double  a = 4,
                b = 7,
                c = getHypotenuse(a,b);
        System.out.println("Perimeter: " + getPerimeter(a, b, c) + "\n Square: " + getSquare(a, b));
    }

    public static double getHypotenuse(double a, double b){
        return Math.sqrt((a *= a) + (b *= b));

    }

    public static double getSquare(double a, double b){
        return 0.5 * a * b;
    }

    public static double getPerimeter(double a, double b, double c){
        return a + b + c;
    }
}
