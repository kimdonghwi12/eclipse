package java1;

import java.util.Scanner;

public class BAEK10869 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A,B;
		int res;
		A=s.nextInt();
		B=s.nextInt();
		
		res=A+B;
		System.out.println(res);
		
		res=A-B;
		System.out.println(res);
		
		res=A*B;
		System.out.println(res);
		
		res=A/B;
		System.out.println(res);

		res=A%B;
		System.out.println(res);
	}

}
