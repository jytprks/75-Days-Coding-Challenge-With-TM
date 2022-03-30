package com.jyoti.days6;

import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args){
        int[][] board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        //int[][] arr = new int[][]{{1,1},{1,0}};
        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }
    public static void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int row = board.length, com = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < com; j++) {
                int sum = liveNeighbors(board, row, com, i, j);
                if (board[i][j] == 1 && sum >= 2 && sum <= 3) {
                    board[i][j] = 3;
                }
                if (board[i][j] == 0 && sum == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < com; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    public static int liveNeighbors(int[][] board, int row, int com, int i, int j) {
        int sum = 0;
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, row - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, com - 1); y++) {
                sum += board[x][y] & 1;

            }
        }
        sum -= board[i][j] & 1;
        return sum;
    }

//    public static void gameOfLife(int[][] board) {
//        int col = board[0].length;
//        int row = board.length;
//        for (int i =0; i< row; i++){
//            for (int j = 0; j<col;j++ ){
//                int sRow = Math.max(i-1,0);
//                int eRow = Math.min(i+1,board.length-1);
//                int sCol = Math.max(j-1,0);
//                int eCol = Math.min(j+1,board[0].length-1);
//                int total = totalSum(board, sRow,sCol,eRow,eCol,i,j);;
//                if (board[i][j] == 1 && total >= 2 && total <= 3) {
//                    board[i][j] = 3;
//                }
//                if (board[i][j] == 0 && total == 3) {
//                    board[i][j] = 2;
//                }
//            }
//        }
//        for (int i =0; i< row; i++){
//            for (int j = 0; j<col;j++ ){
//                //board[i][j] = board[i][j] == 2 || board[i][j] == 3? (board[i][j] == 2? 1:0  ) : board[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(board));
//    }
//
//    public static  int totalSum  (int[][] board, int sRow, int sCol, int eRow, int eCol,int n,int m){
//        int sum = 0;
//
//        for (int i = sRow; i<=eRow; i++){
//            for (int j = sCol; j<=eCol; j++){
//                if (n != i &&m != j){
//
//                }else{
//                    sum += getDeiOrNot(board[i][j]);
//                    System.out.print( "["+i+ "/" + j + "] - " +board[i][j]+" ");
//                }
//              //  sum = board[x][y] & 1;
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------------------------------");
//        return sum;
//    }
//    public static int getDeiOrNot(int a){
//        if (a==3)
//            return 1;
//        else if (a==2)
//                return 0;
//        else return a;
//    }

}
