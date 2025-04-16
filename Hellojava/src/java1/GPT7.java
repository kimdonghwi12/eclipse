package java1;

import java.util.Scanner;

public class GPT7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i,j;
		
		System.out.println();
		int N = s.nextInt();
		
		for (i=1; i<=9; i++) {
			System.out.println(N + "*"+ i + "=" + N*i);
		}
	}
}
