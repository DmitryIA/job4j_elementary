package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumZeroTheTen() {
        int expected = 55;
        int result = Counter.sum(0, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumThreeTheEight() {
        int expected = 33;
        int result = Counter.sum(3, 8);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumOneTheOne() {
        int expected = 1;
        int result = Counter.sum(1, 1);
        assertThat(result).isEqualTo(expected);
    }
}