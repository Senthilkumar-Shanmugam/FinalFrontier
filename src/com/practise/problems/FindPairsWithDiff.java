package com.practise.problems;

import java.util.Arrays;

public class FindPairsWithDiff {

	public static void main(String[] args) {
		int input[] = { 1, 7, 5, 9, 2, 12, 3 };
		int k = 2;
		findAndPrintPairsO(input, k);
	}

	// brute force.. O(N square 2)
	private static void findAndPrintPairs(int arr[], int k) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] - arr[j] == k) || (arr[j] - arr[i] == k))
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
	}

	// optimized time complexity. N log N
	private static void findAndPrintPairsO(int arr[], int k) {
		// First sort the input array .N log N
		Arrays.sort(arr);

		// pair {x,y} x we know, y is x+k=y
		for (int i = 0; i <= arr.length - 1; i++) {
			int y = binarySearch(arr, i + 1, arr.length - 1, arr[i] + k);

			if (y != -1)
				System.out.println("{" + arr[i] + "," + arr[y] + "}");

		}
	}

	static int binarySearch(int arr[], int low, int high, int x) {
		if (high >= low) {
			int mid = (high+low) / 2;
			//System.out.println("MID>>"+mid);
			if (x == arr[mid])
				return mid;
			if (x > arr[mid])
				return binarySearch(arr, (mid + 1), high, x);
			else
				return binarySearch(arr, low, (mid - 1), x);
		}
		return -1;
	}

}
