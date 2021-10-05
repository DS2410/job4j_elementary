package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MaxTest {

    @Test
    public void max() {
        int rsl = Max.max(10, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void testMax() {
        int rsl = Max.max(71, 5, 21);
        assertThat(rsl, is(71));
    }

    @Test
    public void testMax1() {
        int rsl = Max.max(1, 568, 7, 99);
        assertThat(rsl, is(568));
    }
}

