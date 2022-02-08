package by.benikov;

public class Task4 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        System.out.println(isBelong(x, y));
    }

    public static boolean isBelong(int x, int y){
        return (((x >= -4 && x <= 4) && (y <= 2 && y >= -3)) &&
                ((y <= 4 && y >= -3) && (x >= -2 && x <= 2)));
    }
}
