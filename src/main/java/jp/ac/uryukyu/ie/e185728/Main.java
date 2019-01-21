package jp.ac.uryukyu.ie.e185728;

import java.util.Scanner;
public class Main {
    /**
     *自分は黒
     * 初期盤面作成　Board.java
     * 駒打ちの可否メソッド、pass、ひっくり返るメソッド、終了判定を含むクラス　play.java
     * 勝敗判定　judge.java
     */
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int flag = 0;
        play.getTurn(); // 初手は黒
        Board.initialBoard(); // オセロ盤を初期化する

        while(flag != 1) { // 1:終了
            Board.generateBoard(); // オセロ盤をコマンドプロンプトに表示する
            System.out.println("--------------------------------");
            System.out.println("x,y と入力すると、そこに石をおきます。");
            System.out.println("--------------------------------");
            String[] user_input = sc.nextLine().split(",", 2);
            int[] int_input = new int[user_input.length];
            for (int i = 0; i< int_input.length; i++) {
                int_input[i] = Integer.parseInt(user_input[i]);
            }
            System.out.println(user_input[1]);
            play.turnOver(play.getTurn(), int_input[0], int_input[1]);
            
            if(judge.judgeGame() == 1){
                System.out.println("黒の勝利です。");
                flag = 1;
            } else if(judge.judgeGame() == 2) {
                System.out.println("白の勝利です。");
                flag = 1;
            } else if(judge.judgeGame() == 3) {
                System.out.println("引き分けです。");
                flag = 1;
            }
            // play.changeTurn(play.getTurn()); // 黒と白の手番が変わる(実装途中)
        }
    }
}
