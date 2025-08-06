package ru.job4j.calculator;

public class Fit {
    private static final double COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        return (height - 100) * COEFFICIENT;
    }

    public static double womanWeight(short height) {
        return (height - 110) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short manHeight = 178;
        double manIdealWeight = manWeight(manHeight);
        System.out.printf("Man with height %d cm should weigh %.2f kg.%n", manHeight, manIdealWeight);

        short womanHeight = 164;
        double womanIdealWeight = womanWeight(womanHeight);
        System.out.printf("Woman with height %d cm should weigh %.2f kg.%n", womanHeight, womanIdealWeight);
    }
}

