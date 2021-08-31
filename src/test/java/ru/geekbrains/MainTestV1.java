package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

public class MainTestV1 {

    @Test
    public void test1() {
        int[] testArr = {3, 2, 1, -3, 10};
        int[] actual = new int[5];

        try {
            System.arraycopy(Main.newArray(testArr), 0, actual, 0, actual.length);
            Assert.fail("RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals("Не нашли 4 в вашем массиве", e.getMessage());
        }

    }

    @Test
    public void test2() {
        int[] testArr = {3, 3, 4, 23, 12, 23, 43};
        int[] expected = {23, 12, 23, 43};
        int[] actual = Main.newArray(testArr);

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        int[] test = {4, 5, 10, -1, 4, 3, 23};
        int[] expected = {3, 23};
        int[] actual = new int[2];

        System.arraycopy(Main.newArray(test), 0, actual, 0, actual.length);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] test = {0, 32, 2, 1, 9, 3, 23};
        int[] actual = new int[7];

        try {
            System.arraycopy(Main.newArray(test), 0, actual, 0, actual.length);
            Assert.fail("RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals("Не нашли 4 в вашем массиве", e.getMessage());
        }
    }

}
