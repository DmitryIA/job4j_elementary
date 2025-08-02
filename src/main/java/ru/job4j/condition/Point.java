package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double a = Math.pow(x, 2);
        double b = Math.pow(y, 2);
        double distance = a + b;
        return Math.sqrt(distance);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 2, 3, 4);
        double result2 = Point.distance(2, 2, 2, 2);
        System.out.println("result (0,0) to (2,0) " + result);
        System.out.println("result (1,2) to (3,4) " + result1);
        System.out.println("result (2,2) to (2,2) " + result2);
    }
}
