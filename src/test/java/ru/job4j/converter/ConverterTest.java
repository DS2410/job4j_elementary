package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int ineuro = 140;
        int expectedeuro = 2;
        int outeuro = Converter.rubleToEuro(ineuro);
        Assert.assertEquals(expectedeuro, outeuro);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int indollar = 180;
        int expecteddollar = 3;
        int outdollar = Converter.rubleToDollar(indollar);
        Assert.assertEquals(expecteddollar, outdollar);
    }
}