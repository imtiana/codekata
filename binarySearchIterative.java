/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import static org.junit.Assert.*;
import org.junit.Test;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] test1 = {1, 3, 5, 7};
		int[] test2 = {1, 3, 5, 7};
		
		System.out.println(binarySearch(test1, 1));
		System.out.println(binarySearch(test1, 3));
		System.out.println(binarySearch(test1, 5));
		System.out.println(binarySearch(test1, 7));
		System.out.println(binarySearch(test1, 2));

//		assertEquals(0, binarySearch(test1, 1));
	}
	
	public static int binarySearch(int[] a, int n) {
		if (a.length == 0) { 
			return -1;
		}
		
		int hi = a.length - 1;
		int lo = 0;
		int mid = (hi + lo) / 2;
		
		while (lo <= hi) {
			mid = (hi + lo) / 2;
			
			if (a[mid] == n) {
				return mid;
			}
			if (a[mid] < n) {
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		
		return -1;
	}
}