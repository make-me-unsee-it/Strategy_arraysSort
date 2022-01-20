package com;

public class SortingContext {
    private Sorter strategy;

    public SortingContext(Sorter strategy) {
        this.strategy = strategy;
    }

    public int[] execute(int[] array) {
        return strategy.sortArray(array);
    }
}
