package com.day1.practice;

public class RotateNinty {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] temp = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int n = 4;
        int m = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[j][n-i-1] = mat[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(temp[i][j] + ",");
            }
            System.out.println();
        }
    }
}
