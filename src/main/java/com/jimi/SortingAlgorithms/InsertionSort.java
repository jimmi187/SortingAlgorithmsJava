package com.jimi.SortingAlgorithms;

public class InsertionSort<T extends Comparable<T>>{
    private final T[] arr;

    public InsertionSort(T[] arr) {
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
}
