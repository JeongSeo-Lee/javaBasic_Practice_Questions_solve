package com.hihighlinux;

public class Practice44 {
	public static void main(String args[]) {
		int sum = 0;
		int k = 1;
		for(int i = 1; true; i++) {
			System.out.println(k);
			sum += i;
			k += 1;
			if(sum >=100) {
				break;
			}
			if(i%2==0) {
				i = i * (-1);
			} else {
				i = i * (-1);
			}
		}
		
	}
}
