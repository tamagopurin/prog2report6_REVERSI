package jp.ac.uryukyu.ie.e185728;

public class Board {
    protected final static int Length = 8,
                             empty = 0,
                             black = 1,
                             white = 2;

    protected static int[][] board   = new int[Length][Length];

    public static void initialBoard(){
        for(int i=0; i<Length; i++) {
            board[i][0] = empty;
            board[0][i] = empty;
        }
        board[3][3] = board[4][4] = white;
        board[3][4] = board[4][3] = black;
    }

    public static void generateBoard(){
        for(int i=0; i<Length; i++) {
            for (int j = 0; j < Length; j++) {
                switch (board[j][i]) {
                    case empty: {
                        System.out.print("-");
                        break;
                    }
                    case white: {
                        System.out.print("◯");
                        break;
                    }
                    case black: {
                        System.out.print("×");
                    }
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
