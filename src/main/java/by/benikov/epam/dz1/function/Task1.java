package by.benikov.epam.dz1.function;

public class Task1 {
    public static boolean isEq(int z) {
        return (z / 1000) % 10 + (z / 100) % 10 == (z / 10) % 10 + (z % 10);
    }
}
