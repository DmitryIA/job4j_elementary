package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas10then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot4ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int element = 4;
        int result = FindLoop.indexOf(data, element);
        assertThat(result).isEqualTo(-1);
    }
}