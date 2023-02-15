package com.jimi.SortingAlgorithms;

public class A_BubbleSort<T extends Comparable<T>>{

    private final T[] arr;

    public A_BubbleSort(T[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for(int i = 0; i< arr.length -1; i++ ){
            boolean didSwap = false;
            for(int j = 0; j < arr.length -1 - i ; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){  // > for ascending order < for oposite
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }
    }
}
