package com.hihighlinux;

public class Practice4_4 {
	public static void main(String args[]) {
		//1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		//100이상이 되는지 구하시오.
		
		// 답은 199
		
		
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
