package by.benikov.epam.dz1.functions;

public class Task4 {
    public static boolean isBelong(int x, int y){
        return (((x >= -4 && x <= 4) && (y <= 0 && y >= -3)) &&
                ((y <= 4 && y >= -3) && (x >= 0 && x <= 2)));
    }
}
