package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;

    }

    public static void main(String[] args) {
        int result1 = X2.calc(10, 0, 0, 2);
        System.out.println(result1);
        int result2 = X2.calc(1, 1, 1, 1);
        System.out.println(result2);
        int result3 = X2.calc(0, 1, 1, 1);
        System.out.println(result3);
        int result4 = X2.calc(1, 1, 0, 1);
        System.out.println(result4);
        int result5 = X2.calc(1, 1, 1, 0);
        System.out.println(result5);
    }
}
