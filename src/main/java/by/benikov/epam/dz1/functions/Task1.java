package by.benikov.epam.dz1.functions;

public class Task1 {
    public static String isEq(int z){
        if((z / 1000) % 10 + (z / 100) % 10 == (z / 10) % 10 + (z % 10)) {
            return "true";
        }
        return "false";
    }
}
