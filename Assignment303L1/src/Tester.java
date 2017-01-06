// Jayun Patel
// Assignment 1

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tester {
	public static void main (String[] args) throws FileNotFoundException {

		/**
		 * 2^4 = 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 
		 * 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 
		 * 8388608, 16777216, 33554432 
		 **/

		Scanner input = new Scanner (new File ("input_1000.txt"));
			//Scanner input = new Scanner (new File ("num.txt"));

		//		int arraySize = 0;
		int x = 0;
		//		for (int i = 4; i <= 25; i++) {
		//			arraySize = (int) Math.pow(2, i);
		int[] array = new int[100000];
		//
		//			while (input.hasNext() && x < arraySize) {
		//				array[x] = input.nextInt();
		//				x++;
		//				Arrays.sort(array);
		//				for (int j = 0; j < 50; j++) {
		//					System.out.println( j + "............." + array[j]);
		//				}
		//			}
		//			System.out.println("arraySize............ " + arraySize);
		//			System.out.println(LinearSearch.linearSearch(array, 4));
		//			Arrays.sort(array);
		//			for (int j = 0; j < 1000; j++) {
		//				System.out.println( j + "............." + array[j]);
		//			}
		//			System.out.println(RecursiveBinarySearch.recursiveBinarySearch(array, 0, arraySize, 4));

		//		}
		while (input.hasNext()) {
			array[x] = input.nextInt();
			x++;
			int[] temp = new int[array.length+1];
			
			for(int i = 0; i < array.length; i++){
				temp[i] = array[i];
			}
			array = temp;
		}
		
		long startTime = System.nanoTime();
		int linearSearchResult = LinearSearch.linearSearch(array, 0);
		long stopTime = System.nanoTime();
		System.out.println("Linear Search: \n Index of the key element: " + linearSearchResult + 
		" \n Time taken: " + (stopTime - startTime) + " nanoseconds. \n");
		
		Arrays.sort(array);
		long startTime2 = System.nanoTime();
		int binarySearch = RecursiveBinarySearch.recursiveBinarySearch(array, 1);
		long stopTime2 = System.nanoTime();
		System.out.println("Binary Search: \n Index of the key element: " + binarySearch);
		System.out.println("Time taken: " + (stopTime2 - startTime2) + " nanoseconds.");
	}
}