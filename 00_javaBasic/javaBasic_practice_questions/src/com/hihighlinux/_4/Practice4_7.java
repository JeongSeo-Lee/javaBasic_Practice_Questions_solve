package com.hihighlinux._4;

public class Practice4_7 {
	public static void main(String[] args) {
		/*
		Math.random() 1 6 value 을 이용해서 부터 사이의 임의의 정수를 변수 에 저장하는
		코드를 완성하라 에 알맞은 코드를 넣으시오 . (1) .
		
		class Exercise4_7 {
			public static void main(String[] args) {
				int value = (  (1)  );
				System.out.println("value:"+value);
			}
		}
	    */

		int value = (int)(Math.random()*6 + 1);
		System.out.println("value : " + value);
		
	}
}
