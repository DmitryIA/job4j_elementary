package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax6To7Then7() {
        int result = Max.max(6, 7);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To7Then8() {
        int result = Max.max(8, 7);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To9Then9() {
        int result = Max.max(8, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual9To9Then9() {
        int result = Max.max(9, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}