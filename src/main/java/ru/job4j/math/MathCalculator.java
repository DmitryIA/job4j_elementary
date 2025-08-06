package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAndAll(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + multiply(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("результат расчета равен: " + minusAndDivision(13, 12));
        System.out.println("результат рсчета равен " + sumAndAll(12, 13));
    }
}
