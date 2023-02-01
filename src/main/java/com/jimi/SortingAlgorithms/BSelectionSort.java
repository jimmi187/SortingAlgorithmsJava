package com.jimi.SortingAlgorithms;

public class BSelectionSort<T extends Comparable<T>> {

    private final T[] arr;


    public BSelectionSort(T[] arr) {
        this.arr = arr;
    }

    // puts min element to beginning of array and moves on
    public void sort(){
        for(int j = 0; j< arr.length-1;j++){
            int minIndex = j;
            for(int i = j + 1; i< arr.length-1; i++){
                if(arr[i].compareTo(arr[minIndex]) < 0){
                    minIndex = i;
                }
            }
            //swap
            T temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
