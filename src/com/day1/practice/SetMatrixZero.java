package com.day1.practice;

public class SetMatrixZero {
    public static void main(String[] args) {
        SetMatrixZero obj = new SetMatrixZero();
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    obj.setRow(mat, i);
                    obj.setCol(mat, j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
    }

    public void setRow(int[][] mat, int r){
        int n = mat.length;
        for(int i=0;i<n;i++){
            mat[r][i] = -1;
        }
    }
    public void setCol(int[][] mat, int c){
        int m = mat[0].length;
        for(int j=0;j<m;j++){
            mat[j][c] = -1;
        }
    }


}
