package C10;

import java.util.Scanner;

public class Code10_04_1 {
    static int para_method(int v1, int v2){
        int result;
        result= v1+ v2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 값:");
        int v1 = sc.nextInt();
        System.out.print("두번째 값: ");
        int v2 = sc.nextInt();
        int hap;
        hap=para_method(v1,v2);

        System.out.printf("%d과 %d의 2개 메서드 호출 결과 : %d \n",v1,v2,hap);
        sc.close();


    }
}
