package com;

import org.junit.Assert;
import org.junit.Test;

public class SortingContextTest {
    private SortingContext sortingContext;

    @Test
    public void testExecuteBubbleSort() {
        sortingContext = new SortingContext(new BubbleSort());
        int[] expected = sortingContext.execute(new int[]{6, 2, 5, 3, 4, 7, 9, 8, 1, 0});
        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testExecuteSelectionSort() {
        sortingContext = new SortingContext(new SelectionSort());
        int[] expected = sortingContext.execute(new int[]{6, 2, 5, 3, 4, 7, 9, 8, 1, 0});
        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, actual);
    }
}
