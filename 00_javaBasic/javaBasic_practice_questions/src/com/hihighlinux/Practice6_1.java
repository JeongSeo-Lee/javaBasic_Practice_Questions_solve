package com.hihighlinux;

public class Practice6_1 {
	public static void main(String[] args) {
		System.out.println("----카드 받는중----");
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard();
		card1.num = (int)(Math.random()* 10 + 1);
		card2.num = (int)(Math.random()* 10 + 1);
		System.out.println("카드 오픈! : " + card1.num + ", "+ card2.num);
		System.out.println("당신의 첫번째 카드는 " + card1.num);
		
		
		if(card1.num == card2.num) {
			System.out.println("카드가 일치 다시 섞는중.....");
			card2.num = (int)(Math.random()* 10 + 1);
			System.out.println("당신의 두번째 카드는 " + card2.num);
		} else {
			System.out.println("당신의 두번째 카드는 " + card2.num);
		}
		
	}
}

class SutdaCard {
	int num ;//(int)(Math.random()* 10 + 1);
	boolean isKwang;
}
