package C10;

import java.util.Scanner;

public class Code10_03_1 {
    static int plus(int v1, int v2){
        int result;
        result = v1+ v2;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        int v1 = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int v2 = s.nextInt();

        int hap;

        hap = plus(v1,v2);

        System.out.printf("%d과 %d의 plus() 메서드 결과 : %d \n",v1,v2,hap);
        s.close();

    }
}
