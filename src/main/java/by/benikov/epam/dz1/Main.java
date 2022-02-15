package by.benikov.epam.dz1;

import by.benikov.epam.dz1.function.Task1;
import by.benikov.epam.dz1.function.Task4;
import by.benikov.epam.dz1.function.Task5;
import by.benikov.epam.dz1.function.Task9;
import by.benikov.epam.dz1.utill.Input;
import by.benikov.epam.dz1.utill.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        Output.print(Task1.isEq(Input.getNum("Enter a four-digit number:")) ? "true" : "false");

        // Task 4
        Output.print(Task4.isBelong(Input.getNum("Enter the X coordinate: "), Input.getNum("Enter the Y coordinate: ")) ? "true" : "false");

        // Task 5
        int num1 = Input.getNum("Enter a first number : ");
        int num2 = Input.getNum("Enter a second number : ");
        int num3 = Input.getNum("Enter a third number : ");
        Output.printExpResult(Task5.exponentiation(num1), Task5.exponentiation(num2), Task5.exponentiation(num3));

        // Task 9
        int[] array = Input.getArray();
        Output.print(Arrays.toString(Task9.solution(array, Input.getArray(), Input.getNum("Enter number less than " + array.length))));
    }
}