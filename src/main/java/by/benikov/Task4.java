package by.benikov;

public class Task4 {
    public static void main(String[] args) {
        int x = -5, y = -3;
        System.out.println(isBelong(x, y));
    }

    public static boolean isBelong(int x, int y){
        if((x >= -4 && x <= 4) && (y <= 2 && y >= -3)) return true;
        if((y <= 4 && y >= -3) && (x >= -2 && x <= 2)) return true;
        return false;
    }
}
