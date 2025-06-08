package dh;

public class Code09_05 {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        int count, size;

        count = num.length;
        size = count * Integer.BYTES; //배열의 각 요소가 int 타입이므로 각 요소가 차지하는 크기는 4bytes -> Inter.Bytes=4다

        System.out.println("배열 num[]의 요소 개수 : " + count);

        System.out.println("배열 num[]의 요소 전체 크기 : " + size);
    }
}
