package by.benikov.epam.dz1.utils;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static int getNum(String message){
        Output.print(message);
        return scanner.nextInt();
    }

    //Можно ли так делать?
    public static int[] getArray() {
        Output.print("Enter size of array: ");
        int arSize = scanner.nextInt();
        if(isMZN(arSize)){
            int[] array = new int[arSize];
            int i;
            for(i = 0; i < arSize; i++){
                Output.print("Enter el " + i);
                array[i] = scanner.nextInt();
            }
            return array;
        }
        return getArray();
    }

    private static boolean isMZN(int num){
        return num > 0;
    }
}
