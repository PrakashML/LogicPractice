package com.day2.practice;

public class Patterns {
    public void pattern1(){
        int row = 5;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        int row = 5;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        int row = 5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(){
        int row=3;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                System.out.print(" ");
            }
            int n;
            if(i%2==0){
                n = i*2+1+i;
            }
            else{
                n = i*2+i;
            }
            for(int j=0;j<=i;j++){
                System.out.print(n + " ");
                n+=2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns p1 = new Patterns();
        p1.pattern1();
        p1.pattern3();
        p1.pattern2();
        p1.pattern4();
    }
}
