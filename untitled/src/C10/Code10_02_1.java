package C10;

public class Code10_02_1 {
    static void drawDice() {
        int diceNum;
        diceNum = (int)(Math.random() *6 +1);
        System.out.println("결과: " + diceNum);
    }
    public static void main(String[] args) {
        String [] players = {"A","B","C"};
        for(String player : players){
            System.out.println(player + "주사위를 던집니다~");
            drawDice();
        }
    }
}
