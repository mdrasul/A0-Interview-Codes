package zjavacollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

import org.openqa.selenium.WebElement;

public class CollectionsConcept {

	public static void main(String[] args) {


			Scanner  scan = new Scanner(System.in);		
			Scanner  scan2 = new Scanner(System.in);		
			Scanner  scan3 = new Scanner(System.in);		

		
		// trying to Access A Single Ton Class Object 
		
		//Driver mydriver;
		
		// 1. Need a Object Of Driver Class 
		Driver testSingleToneNumber1;
		testSingleToneNumber1=Driver.getDriver();
		
		Driver.getDriver();
		

		
		
		
		// Only Possible to create new by destryong the Objec
		Driver.removeDriver();
		
		
		
		Driver testSingleToneNumber3;
		testSingleToneNumber3=Driver.getDriver();
		
		
		

		List<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");

		System.out.println("First Print With All Loaded Item ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));

		}
		
		myList.remove(2);
		
		System.out.println("Second Item Removed ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}

		myList.clear();
		System.out.println("Cleared ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}

		



		//		String[] myArr = new String[5];
		//		myArr[0] = "A";
		//		myArr[1] = "b";
		//		myArr[2] = "c";
		//		myArr[3] = "d";
		//		myArr[4] = "e";
		//
		//		System.out.println("First Print With All Loaded Item ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//			
		//			if(i==2) {
		//				myArr[i] = "";
		//			}
		//			
		//		}
		//		
		//		System.out.println("2nd Print With All Removed Item at index2 ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//	
		//			
		//		}
		//		
		//		
		//		myArr = new String[6];
		//
		//		System.out.println("3rd Resized ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//	
		//		}






	}

}
