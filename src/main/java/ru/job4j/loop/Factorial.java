package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 0;
        if (result == 0) {
             result = 1;
        }
        for (int i = result; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
