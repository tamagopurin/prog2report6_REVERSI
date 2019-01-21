package jp.ac.uryukyu.ie.e185728;

public class judge extends Board {

    public static int judgeGame() {
        int notFinish = 0, // ゲームが終了していない
                vic = 1, // 黒の勝ち
                loss = 2,  // 白の勝ち
                draw = 3; // 引き分け
        int JUDGE = 0;
        int countWhite = 0;
        int countBlack = 0;
        int winner = countBlack - countWhite;
        loop:for (int i = 0; i < Length; i++) {
            for (int j = 0; j < Length; j++) {
                switch (board[j][i]) {
                    case black: {
                        countBlack += 1;
                    }
                    case white: {
                        countWhite += 1;
                    }
                    case empty: {
                        JUDGE = 0;
                        break loop;
                    }
                }
            }
        }
        if (JUDGE == notFinish) {
            return JUDGE; // ゲームが終了していない
        } else if (winner > 0) {
            JUDGE = vic;
            return JUDGE; // 黒勝利
        } else if (winner < 0) {
            JUDGE = loss;
            return JUDGE; // 白勝利
        } else if (winner == 0) {
            JUDGE = draw; // 引き分け
            return JUDGE;
        }
        return JUDGE;
    }
}