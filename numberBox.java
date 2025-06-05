package com.justjava;

public class numberBox {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= (n*2) - 1; row++){
            for(int col = 1; col <= (n*2) - 1; col++){
                int topD = row, downD = (n*2) - row, leftD = col, rightD = (n*2) - col;
                int min = Math.min(Math.min(topD,downD), Math.min(leftD, rightD));
                System.out.print(min + " ");
            }
            System.out.println("");
        }
    }
}


//  1 1 1 1 1 1 1 1 1 
//  1 2 2 2 2 2 2 2 1 
//  1 2 3 3 3 3 3 2 1 
//  1 2 3 4 4 4 3 2 1 
//  1 2 3 4 5 4 3 2 1 
//  1 2 3 4 4 4 3 2 1 
//  1 2 3 3 3 3 3 2 1 
//  1 2 2 2 2 2 2 2 1 
//  1 1 1 1 1 1 1 1 1 