package coreJava;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		//binary search
		
		int a[]= {6,5,8,4,3};
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					
					a[j]=a[j+1];
					a[j+1]=a[j];
					
				}
			}
		}	
		System.out.println(Arrays.toString(a));
	}
}
