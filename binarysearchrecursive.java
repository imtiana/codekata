/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] test1 = {1, 3, 5, 7};

		System.out.println(binarySearch(test1, 1));
		System.out.println(binarySearch(test1, 3));
		System.out.println(binarySearch(test1, 5));
		System.out.println(binarySearch(test1, 7));
		System.out.println(binarySearch(test1, 2));
	}

	public static int binarySearch(int[] a, int n) {
		return binarySearchHelper(a, n, 0, a.length -1);
	}

	public static int binarySearchHelper(int[] a, int n, int lo, int hi) {
		int mid = (hi + lo) / 2;
		
		if (lo > hi) {
			return -1;
		}
		
		if (a[mid] == n) {
			return mid;
		}

		if (a[mid] < n) {
			return binarySearchHelper(a, n, mid + 1, hi);
		}
		else {
			return binarySearchHelper(a, n, lo, mid - 1);
		}
	}
}