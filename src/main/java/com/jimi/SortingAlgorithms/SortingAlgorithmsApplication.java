package com.jimi.SortingAlgorithms;


import java.util.Arrays;

public class SortingAlgorithmsApplication {

	public static void main(String[] args) {

		System.out.println("==============Bubble Sort================");
		Integer[] integers = { 10, 55, -5, 34, 7, 22, 19 };
		String [] strings = { "Sylvanas", "Arthas", "Illidan", "Thrall", "Jaina" };
		System.out.println(Arrays.toString(integers) + " | " + Arrays.toString(strings));
		new D_ShellSort<>(integers).sort(); new D_ShellSort<>(strings).sort();
		System.out.println(Arrays.toString(integers) + " | " + Arrays.toString(strings));



		IntWrapper intedzer = new IntWrapper(9);
		funkcija(intedzer);
		System.out.println(intedzer.getValue());
	}
	private static void funkcija(IntWrapper x){
		x.setValue(x.getValue()+1);
	};
}

class IntWrapper{
	private int value;

	public IntWrapper(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
