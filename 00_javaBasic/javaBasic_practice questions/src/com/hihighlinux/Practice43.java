package com.hihighlinux;

public class Practice43 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int sum = 0;
		int twoSum = 0;
		
		for(int i = 1; i<=10; i++ ) {
			sum += i;
			twoSum = twoSum + sum;  
			System.out.println(sum);
			System.out.println(">>>" + twoSum);
		}
		/*
		 *  1 + (1 + 2) ....
		 *	규칙을 찾는 것보다 괄호 사이의 내용다 더한다음 sum으로 합쳐라!
		 *	
		 */
		
	}
}
