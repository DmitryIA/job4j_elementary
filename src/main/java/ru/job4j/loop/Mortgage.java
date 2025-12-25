package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double precent) {
        int year = 0;

        while (amount > 0) {
            amount += amount * (precent / 100);
            amount -= salary;
            year++;
        }
        return year;
    }
}
