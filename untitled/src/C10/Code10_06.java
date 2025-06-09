package C10;

import java.util.Scanner;

public class Code10_06 {
    static int hap_para2(int v1, int v2){
        int result;
        result = v1 + v2;
        return result;
    }
    static int hap_para3(int v1, int v2, int v3) {
        int result;
        result = v1 + v2 + v3;
        return result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째:");
        int v1 = s.nextInt();
        System.out.print("두번째:");
        int v2 = s.nextInt();
        int hap;
        hap= hap_para2(v1,v2);
        System.out.printf("%d과 %d의 매개변수 2개 메서드 호출 결과:%d \n",v1,v2,hap);

        System.out.print("세번째:");
        int v3 = s.nextInt();
        hap= hap_para3(v1,v2,v3);
        System.out.printf("%d과 %d과 %d의 매개변수 3개 메서드 호출 결과:%d\n",v1,v2,v3,hap);

        s.close();
    }
}
