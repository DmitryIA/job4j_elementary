package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int expected = 40;
        int result = X2.calc(10, 0, 0, 2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then3() {
        int expected = 3;
        int result = X2.calc(1, 1, 1, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int expected = 2;
        int result = X2.calc(0, 1, 1, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int expected = 2;
        int result = X2.calc(1, 1, 0, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int expected = 1;
        int result = X2.calc(1, 1, 1, 0);
        assertThat(result).isEqualTo(expected);
    }
}