package com.hihighlinux;

public class Practice6_1 {
	public static void main(String[] args) {
		System.out.println("----ī�� �޴���----");
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard();
		card1.num = (int)(Math.random()* 10 + 1);
		card2.num = (int)(Math.random()* 10 + 1);
		System.out.println("ī�� ����! : " + card1.num + ", "+ card2.num);
		System.out.println("����� ù��° ī��� " + card1.num);
		
		
		if(card1.num == card2.num) {
			System.out.println("ī�尡 ��ġ �ٽ� ������.....");
			card2.num = (int)(Math.random()* 10 + 1);
			System.out.println("����� �ι�° ī��� " + card2.num);
		} else {
			System.out.println("����� �ι�° ī��� " + card2.num);
		}
		
	}
}

class SutdaCard {
	int num ;//(int)(Math.random()* 10 + 1);
	boolean isKwang;
}
