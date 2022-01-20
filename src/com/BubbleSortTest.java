package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void tearDown() {
        bubbleSort = null;
    }

    @Test
    public void testSortArray() {
        int[] expected = bubbleSort.sortArray(new int[]{6, 2, 5, 3, 4, 7, 9, 8, 1, 0});
        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, actual);
    }
}