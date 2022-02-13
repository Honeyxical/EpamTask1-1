package by.benikov.epam.dz1.utils;

import java.util.Scanner;

public class Input {
    public static int getNum(String message){
        Scanner scanner = new Scanner(System.in);
        Output.print(message);
        return scanner.nextInt();
    }


    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        Output.print("Enter size of array: ");
        int arSize = scanner.nextInt();
        int[] array = new int[arSize];
        int i;
        for(i = 0; i < arSize; i++){
            Output.print("Enter el " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
