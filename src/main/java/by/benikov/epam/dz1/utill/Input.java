package by.benikov.epam.dz1.utill;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getNum(String message){
        Output.print(message);
        return scanner.nextInt();
    }

    public static int[] getArray() {
        Output.print("Enter size of array: ");
        int arSize = scanner.nextInt();
        if(isValid(arSize)){
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

    private static boolean isValid(int num){
        return num > 0;
    }
}
