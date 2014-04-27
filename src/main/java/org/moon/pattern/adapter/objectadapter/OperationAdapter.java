package org.moon.pattern.adapter.objectadapter;

public class OperationAdapter implements ScoreOperation {

	BinarySearch binarySearch = new BinarySearch();
	
	QuickSort quickSort = new QuickSort();
	
	@Override
	public int[] sort(int[] array) {
		return quickSort.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		return binarySearch.binarySearch(array, key);
	}

}
