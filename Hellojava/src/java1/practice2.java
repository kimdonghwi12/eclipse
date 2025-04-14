package java1;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		int res;
		
		System.out.println("첫번째 값을 입력하세요: ");
		a=s.nextInt();
		System.out.println("두번째 값을 입력하세요: ");
		b= s.nextInt();
		
		res=a+b;
		System.out.println(a+ "+" + b + "=" + res);
		
	
	}
}
