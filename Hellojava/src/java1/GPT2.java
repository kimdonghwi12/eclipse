package java1;

import java.util.Scanner;

public class GPT2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int price= 2*a+3*b;
		System.out.println("총가격: " + (price));
		if (c >=price) {
			System.out.println("잔돈: " +(c-price));
		} else {
			System.out.println("부족한 금액: " + (price -c));
		}
	}

}
