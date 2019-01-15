package jp.ac.uryukyu.ie.e185728;

import java.util.Scanner;
public class Main {
    private static Scanner  sc = new Scanner(System.in);
    /**
     * 初期盤面作成　Board.java
     * 駒打ちの可否メソッド、pass、ひっくり返るメソッド、終了判定を含むクラス　play.java
     * 勝敗判定　judge.java
     */
    public static void main(String[] args) {

        Board.initialBoard(); // オセロ盤を初期化する
        Board.createdBoard(); // 初期オセロ盤をコマンドプロンプトに表示する
    }
}