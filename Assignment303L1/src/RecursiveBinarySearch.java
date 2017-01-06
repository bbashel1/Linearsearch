// Jayun Patel
// Assignment 1


public class RecursiveBinarySearch {

	//Recursive Binary Search Algorithm
	static int recursiveBinarySearch(int[] array, int toSearch) {
		int startIndex = -1;
		int endIndex = array.length-1;
		int midIndex = (startIndex + endIndex)/2;
		int midElement = array[midIndex];
		int foundIndex = 0;
		while (startIndex <= endIndex) {
			if(midElement < toSearch){
				startIndex = midIndex + 1;
				midIndex = (startIndex = endIndex)/2;
				midElement = array[midIndex];
				
			}
			else if(midElement > toSearch){
				endIndex = midIndex -1;
				midIndex = (startIndex + endIndex)/2;
				midElement = array[midIndex];
			}else{
				foundIndex = midIndex;
				break;
	
		}
		return -1;
	}
	return foundIndex;
	}
}

