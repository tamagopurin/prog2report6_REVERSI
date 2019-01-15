package jp.ac.uryukyu.ie.e185728;

public class Board {
    private final static int length = 8,
                empty = 0,
                brack = 1,
                white = 2;

    public static void initialBoard(){
        for(int i=0; i<length; i++) {
            board[i][0] = empty;
            board[0][i] = empty;
        }
        board[3][3] = board[4][4] = white;
        board[3][4] = board[4][3] = brack;
    }

    public static void createdBoard(){
        for(int i=0; i<length; i++) {
            for (int j = 0; j < length; j++) {
                switch (board[i][j]) {
                    case empty: {
                        System.out.print("-");
                        break;
                    }
                    case white: {
                        System.out.print("◯");
                        break;
                    }
                    case brack: {
                        System.out.print("×");
                    }
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    private static int[][] board   = new int[length][length];
}
