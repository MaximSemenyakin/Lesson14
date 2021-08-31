package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

public class MainTestV2 {

    @Test
    public void test1() {
        int[] test = {1, 2, 3, 1, 4, 4};

        Assert.assertFalse(MainV2.checkArray(test, 1, 4));
    }

    @Test
    public void test2() {
        int[] test = {1, 4, 1, 1, 4, 1, 4};

        Assert.assertTrue(MainV2.checkArray(test, 1, 4));
    }

    @Test
    public void test3() {
        int[] test = {1, 1, 1, 1, 1, 1, 1};

        Assert.assertFalse(MainV2.checkArray(test, 1, 4));
    }

    @Test
    public void test4() {
        int[] test = {4, 4, 4, 4, 4, 4};

        Assert.assertFalse(MainV2.checkArray(test,1,4));
    }

}
