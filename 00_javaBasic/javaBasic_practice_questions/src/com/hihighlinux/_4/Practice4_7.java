package com.hihighlinux._4;

public class Practice4_7 {
	public static void main(String[] args) {
		/*
		Math.random() 1 6 value �� �̿��ؼ� ���� ������ ������ ������ ���� �� �����ϴ�
		�ڵ带 �ϼ��϶� �� �˸��� �ڵ带 �����ÿ� . (1) .
		
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
