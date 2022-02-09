package by.benikov;

public class Task1 {
    public static void main(String[] args) {
        int z = 1230;
        System.out.println(isEq(z));

    }

    public static boolean isEq(int z){
        if((z / 1000) % 10 + (z / 100) % 10 == (z / 10) % 10 + (z % 10)) {
            return true;
        }
        return false;
    }
}
