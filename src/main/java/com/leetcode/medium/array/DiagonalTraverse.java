package com.leetcode.medium.array;

public class DiagonalTraverse {
    static int m;
    static int n;
    public static int[] findDiagonalOrder(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        int[] res = new int[m * n];

        //Traverse the list
        int row = 0, col = 0, index = 0;
        while(row < m && col < n){
            res[index++] = mat[row][col];
            if(traverseUp(row, col)){
                if(withBoundary(row - 1, col + 1)){
                    row--;
                    col++;
                }else if(withBoundary(row, col + 1)){
                    col++;
                }else{
                    row++;
                }
            }else{
                if(withBoundary(row + 1, col - 1)){
                    row++;
                    col--;
                }else if(withBoundary(row + 1, col)){
                    row++;
                }else{
                    col++;
                }
            }
        }
        return res;
    }
    private static boolean traverseUp(int row, int col){
        return (row + col) % 2 == 0;
    }
    private static boolean withBoundary(int row, int col){
        if(row < 0 || m <= row) return false;
        if(col < 0 || n <= col) return false;
        return true;
    }
    public static void main(String[] args){
   int [][] mat={{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(findDiagonalOrder(mat));
    }
}
