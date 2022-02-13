package by.benikov.epam.dz1;

import by.benikov.epam.dz1.functions.Task1;
import by.benikov.epam.dz1.functions.Task4;
import by.benikov.epam.dz1.functions.Task5;
import by.benikov.epam.dz1.functions.Task9;
import by.benikov.epam.dz1.utils.Input;
import by.benikov.epam.dz1.utils.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int num = Input.getNum("Enter a four-digit number:");
        Output.print(Task1.isEq(num));

        // Task 4 За ранее прошу прощения
        Output.print(Task4.isBelong(Input.getNum("Enter the X coordinate: "), Input.getNum("Enter the Y coordinate: ")) ? "true" : "false");

        // Task 5
        int num1 = Input.getNum("Enter a first number : ");
        int num2 = Input.getNum("Enter a second number : ");
        int num3 = Input.getNum("Enter a third number : ");
        Output.print(num1 + " -> " + Task5.Exponentiation(num1) +
                "\n" + num2 + " -> " + Task5.Exponentiation(num2) +
                "\n" + num3 + " -> " + Task5.Exponentiation(num3));

        // Task 9
        int[] array = Input.getArray();
        Output.print(Arrays.toString(Task9.solution(array, Input.getArray(), Input.getNum("Enter number less than " + array.length))));
    }
}