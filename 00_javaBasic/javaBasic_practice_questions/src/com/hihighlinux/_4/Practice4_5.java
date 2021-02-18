package com.hihighlinux._4;

public class Practice4_5 {
	public static void main(String args[]) {
		
		
		//다음의 문을 문으로 변경하시오 for while .
		
			
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
	int i=0;
	while(i<=10) {
		int j=0;
		while(j<=i) {
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}
		
		
	}
	
}
