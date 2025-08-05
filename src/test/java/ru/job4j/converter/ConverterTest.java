package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float euro = Converter.rubleToEuro(140);
        float expectedEuro = 2;
        float value = 0.0001f;
        assertThat(euro).isEqualTo(expectedEuro, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float dollar = Converter.rubleToDollar(180);
        float expectedDollar = 3;
        float value = 0.0001f;
        assertThat(dollar).isEqualTo(expectedDollar, withPrecision(value));
    }
}