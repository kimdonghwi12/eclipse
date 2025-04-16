package java1;

import java.util.Scanner;

public class GPT6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		String day = s.nextLine();
		
		switch(day) {
			case "Monday":
				System.out.println("월요일");
				break;
			case "Tuesday":
				System.out.println("화요일");
				break;
			case "Wednesday":
				System.out.println("수요일");
				break;
			case "Thursday":
				System.out.println("목요일");
				break;
			case "Friday":
				System.out.println("금요일");
				break;
			case "Saturday":
				System.out.println("토요일");
				break;
			case "Sunday":
				System.out.println("일요일");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}

}
