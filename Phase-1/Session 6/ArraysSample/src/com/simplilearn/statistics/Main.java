package com.simplilearn.statistics;

public class Main {

	public static void main(String[] args) {
		
		KthSmallest ob = new KthSmallest();
		
		int arr[]= {12,3,57,4,19,26};
		int left=0;
		int n= arr.length;
		int right= n-1;
		int k= 4;
		
		System.out.println("K'th smallest element is "+ob.kthSmallest(arr, left, right,k));
	}
}
