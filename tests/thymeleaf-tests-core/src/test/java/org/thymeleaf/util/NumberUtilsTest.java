package org.thymeleaf.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {



    @Test
    public void testSequence() {

        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(1),Integer.valueOf(3)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(1),Integer.valueOf(3), Integer.valueOf(1)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(1),Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(1),Integer.valueOf(3), Integer.valueOf(2)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(3),Integer.valueOf(3), Integer.valueOf(1)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(3),Integer.valueOf(3), Integer.valueOf(2)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(3)}, NumberUtils.sequence(Integer.valueOf(3),Integer.valueOf(3)));

        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-1),Integer.valueOf(-2),Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-1),Integer.valueOf(-3)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-1),Integer.valueOf(-2),Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-1),Integer.valueOf(-3), Integer.valueOf(-1)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-1),Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-1),Integer.valueOf(-3), Integer.valueOf(-2)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-3),Integer.valueOf(-3), Integer.valueOf(-1)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-3),Integer.valueOf(-3), Integer.valueOf(-2)));
        Assertions.assertArrayEquals(new Integer[] {Integer.valueOf(-3)}, NumberUtils.sequence(Integer.valueOf(-3),Integer.valueOf(-3)));

        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(1),Integer.valueOf(3), Integer.valueOf(-1)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(-1),Integer.valueOf(-3), Integer.valueOf(1)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(1),Integer.valueOf(3), Integer.valueOf(-2)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(-1),Integer.valueOf(-3), Integer.valueOf(2)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(3),Integer.valueOf(1), Integer.valueOf(1)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(-3),Integer.valueOf(-1), Integer.valueOf(-1)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(3),Integer.valueOf(1), Integer.valueOf(2)));
        Assertions.assertArrayEquals(new Integer[0], NumberUtils.sequence(Integer.valueOf(-3),Integer.valueOf(-1), Integer.valueOf(-2)));

    }


}
