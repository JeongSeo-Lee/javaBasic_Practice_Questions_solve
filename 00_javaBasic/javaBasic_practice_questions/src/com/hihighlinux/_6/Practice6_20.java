package com.hihighlinux._6;

public class Practice6_20 {
	
	static int[] shuffle(int[] arr) {
		int j, temp;
		for(int i = 0 ; i < arr.length; i++) {
			j = (int) (Math.random()*arr.length);
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
	
	
	public static void main(String[] args)
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
