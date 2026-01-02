package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 4, 1, 6, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[] {8, 6, 1, 4, 2};
        assertThat(result).containsExactly(expected);
    }
}