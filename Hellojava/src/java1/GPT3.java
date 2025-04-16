package java1;

import java.util.Scanner;

public class GPT3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int avg = (a+b+c)/3;
		if (a>=40 && b>=40 && c>=40 && avg>=60 ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}

}
