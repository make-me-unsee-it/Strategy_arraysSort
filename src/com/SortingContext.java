package com;

import java.util.Objects;

public class SortingContext {
    private Sorter strategy;

    public SortingContext(Sorter strategy) {
        this.strategy = strategy;
    }

    public int[] execute(int[] array) {
        return strategy.sortArray(array);
    }

    public Sorter getStrategy() {
        return strategy;
    }

    public void setStrategy(Sorter strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SortingContext context)) return false;
        return strategy.equals(context.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategy);
    }

    @Override
    public String toString() {
        return "SortingContext{" +
                "strategy=" + strategy +
                '}';
    }
}
