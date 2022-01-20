package com;

public class BubbleSort implements Sorter{
    @Override
    public int[] sortArray(int[] array){
        for (int index = 0; index < array.length - 1; index++) {
            for (int current = array.length - 2; current >= index; current--) {
                if (array[current] > array[current + 1]) {
                    int temp = array[current + 1];
                    array[current + 1] = array[current];
                    array[current] = temp;
                }
            }
        }
        return array;
    }
}
