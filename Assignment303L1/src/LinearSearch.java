// Jayun Patel
// Assignment 1


public class LinearSearch {

	//Linear Search Algorithm
	static int linearSearch(int[] array, int num) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			if (array[i] == num) {
				return i ;
			}
		}
		return -1; 
	}
	
}
