package zmisc;

import java.util.*;  
public class SecondLargestInArrayExample2{ 
	
	
    /**
     * Return 2nd Largest Number using <b>List & Collections.sort()</b>
     * @param a[] - Receives the int array to sort
     * @param total - Receives the total length of the array 
     * @return int - The 2nd Largest Number found inside Array a[]
     */

	public static int getSecondLargest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(total-2);  
		return element;  
	}  
	public static void main(String args[]){  
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
		System.out.println("Second Largest: "+getSecondLargest(b,b.length));  
	}}  