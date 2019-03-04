package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] alphabet= {"a","b","c","d","e","f"};
		assertEquals(2, _00_LinearSearch.linearSearch(alphabet,"c"));
		assertEquals(0, _00_LinearSearch.linearSearch(alphabet,"a"));
		assertEquals(4, _00_LinearSearch.linearSearch(alphabet,"e"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] a = {1,2,3,4,5};
		assertEquals(2, _01_BinarySearch.binarySearch(a,0,a.length,3));
		assertEquals(4 ,_01_BinarySearch.binarySearch(a,0,a.length,5));
		assertEquals(1 ,_01_BinarySearch.binarySearch(a,0,a.length,2));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] b = {1,2,3,4,5};
		assertEquals( 2, _02_InterpolationSearch.interpolationSearch(b,3));
		assertEquals( 0, _02_InterpolationSearch.interpolationSearch(b,1));
		assertEquals( -1, _02_InterpolationSearch.interpolationSearch(b,8));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] c = {1,2,3,4,5};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(c, 1));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(c, 5));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(c, 35));
	}
}
