package week2;

import java.util.Arrays;

public class ArrayFun {
	
	public static void main(String[] args) {
		
		int[] ages = {34, 56, 72, 56, 3, 24, 89};
		int[] ages2 = {34, 56, 56, 3, 24, 72, 89};
		
		System.out.println(ages[ages.length - 1]);
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		for (int age : ages) {
			System.out.println(age);
		}
		
		int index = findIndex(ages, 3);		
		System.out.println(index);
		
		System.out.println(findIndex(ages2, 790));
		
		System.out.println(multiplyLength("Hello", 3));
		
	}
	
	static int multiplyLength(String string, int factor) {
		return string.length() * factor;
	}
	
	private static int findIndex(int[] array, int num) {
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
			}
		}
		
		return index;
	}

}
