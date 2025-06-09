package dh;

public class Code09_12 {
    public static void main(String[] args) {
        int[][] ary = new int[3][4];
        int value = 1;

        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++){
                ary[i][j] = value;
                value++;
            }
        System.out.printf("ary[0][0]부터 ary[2][3]까지 출력 \n");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d", ary[i][j]);
            }
            System.out.println();
        }
    }
}
