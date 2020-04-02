package zmisc;

import java.util.Arrays;  
public class SecondLargestInArrayExample1{ 
	
	
    /**
     * Return 2nd Largest Number using <b>Arrays.sort()</b>
     * @param a[] - Receives the int array to sort
     * @param total - Receives the total length of the array 
     * @return int - The 2nd Largest Number found inside Array a[]
     */
	
	public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-2];  
	}  
	
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
		System.out.println("Second Largest: "+getSecondLargest(b,b.length));  
	}}  