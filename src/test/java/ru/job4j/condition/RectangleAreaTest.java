package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        double output = RectangleArea.square(6, 2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP5K3Square1dot17() {
        double expected = 1.17;
        double output = RectangleArea.square(5, 3);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K4dot5Square2dot38() {
        double expected = 2.38;
        double output = RectangleArea.square(8, 4.5);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}