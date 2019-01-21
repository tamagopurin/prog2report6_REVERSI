package jp.ac.uryukyu.ie.e185728;

public class play extends Board {
    private static int x,
                       y,
                       turn = black,
                       Opponent = 3 - turn,
                       notCountEmpty = 0;
    /**
     *
     * @param player
     * @param x
     * @param y
     */
    public static void turnOver(int player, int x, int y) {
        for (int k = -1; k <= 1; k++) {
            for (int j = -1; j <= 1; j++) {
                if (board[x + k][y + j] == Opponent) {
                    for (int i = 1; board[x + i * k][y + i * j] == player; i++) {
                        if (board[x + i * k][y + i * j] == player) {
                            break;
                        } else if (board[x + i * k][y + i * j] == Opponent) {
                            board[x + i * k][y + i * j] = player; // 裏返す
                        }
                    }
                }
            }
        }
    }

    public int changeTurn(int turn){
        turn = Opponent;
        return this.turn;
    }

    public static int getTurn(){
        return turn;
    }
}
