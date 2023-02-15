package com.jimi.SortingAlgorithms;

import java.util.stream.IntStream;

public class D_ShellSort<T extends Comparable<T>> {
    private final T[] arr;

    public D_ShellSort(T[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for(int gap = arr.length/2; gap > 0; gap /=2){ // swiching elements on gaps till gap go to 1
            for(int j = gap ; j<arr.length;j++) {
                int i = j;
                while(i >=gap && arr[i].compareTo(arr[i - gap]) < 0) {
                    T temp = arr[i];
                    arr[i] = arr[i - gap];
                    arr[i - gap] = temp;
                    i-=gap;
                }
            }
        }
    }

    public void sortRecursively() {
        IntStream.iterate(arr.length / 2, gap -> gap > 0, gap -> gap / 2).forEach(gap ->
                IntStream.range(gap, arr.length).forEach(index -> sort(index, gap))
        );
    }

    private void sort(int index, int gap) {
        if (index >= gap && arr[index].compareTo(arr[index - gap]) < 0) {
            T temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
            sort(index - gap, gap);
        }
    }
}
