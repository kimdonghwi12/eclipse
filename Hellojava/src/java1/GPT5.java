package java1;

import java.util.Scanner;

public class GPT5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		char menu = s.next().charAt(0);
				
		switch(menu) {
			case 'A':
				System.out.println("아메리카노");
				break;
			case 'B':
				System.out.println("카페라떼");
				break;
			case 'C':
				System.out.println("아이스티");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				
				
		}
	}

}
//문자 입력을위해선 char/string 써야한다
// char ~ =s.next().charAt(0)