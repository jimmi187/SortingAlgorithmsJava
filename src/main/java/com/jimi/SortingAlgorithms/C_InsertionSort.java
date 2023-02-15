package com.jimi.SortingAlgorithms;

import java.util.stream.IntStream;

public class C_InsertionSort<T extends Comparable<T>>{
    private final T[] arr;

    public C_InsertionSort(T[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for(int j = 1 ; j<arr.length;j++) { // poredi se sa predhodnim i za svaki radi bubble unazad
            int i = j;
            while(i >0 && arr[i].compareTo(arr[i - 1]) < 0) {
                T temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }

    public void sortWithStreams() {
        IntStream.range(1, arr.length)
                .forEach(i ->
                        IntStream.iterate(i, j -> j > 0 && arr[j].compareTo(arr[j - 1]) < 0, j -> j - 1)
                                .forEach(j -> {
                                    T temp = arr[j];
                                    arr[j] = arr[j - 1];
                                    arr[j - 1] = temp;
                                })
                );
    }

    public void sortRecursively() {
        IntStream.range(1, arr.length).forEach(this::sort);
    }

    private void sort(int index) {
        if (index > 0 && arr[index].compareTo(arr[index - 1]) < 0) {
            T temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
            sort(index - 1);
        }
    }
}
