package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight178ThenWeightIsCorrect() {
        short height = 178;
        double expected = (height - 100) * 1.15;
        double actual = Fit.manWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.0001));
    }

    @Test
    void whenManHeight100ThenWeightIsZero() {
        short height = 100;
        double expected = 0.0;
        double actual = Fit.manWeight(height);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenWomanHeight164ThenWeightIsCorrect() {
        short height = 164;
        double expected = (height - 110) * 1.15;
        double actual = Fit.womanWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.0001));
    }

    @Test
    void whenWomanHeight110ThenWeightIsZero() {
        short height = 110;
        double expected = 0.0;
        double actual = Fit.womanWeight(height);
        assertThat(actual).isEqualTo(expected);
    }
}