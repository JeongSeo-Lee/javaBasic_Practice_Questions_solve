package com.hihighlinux;

public class Practice4_2 {
	public static void main(String args[]) {
		//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		int sum = 0;
		for(int i = 1; i <21; i++) {
			if(i%2==0 | i%3 == 0 ) {
				continue;
			}
			sum = sum + i;
		}
	
	}
}
