package dh;

import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] num = new int[4];

        int hap=0;

        for(int i=0; i<=3; i++){
            System.out.print("숫자 : ");
            num[i]=s.nextInt();
        }

        for(int i=0;i<4;i++){
            hap+=num[i];
        }
        System.out.println("합계: " + hap);
    }
}
