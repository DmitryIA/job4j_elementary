package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 178;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man " + manHeight + " is " + man);
        short womanHeight = 164;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}

