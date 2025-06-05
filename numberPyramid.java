package com.justjava;

import java.util.*;

public class numberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit");
        int row = sc.nextInt();
        
        for(int i=1; i<=row; i++){
            int re = i;
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
//                if(re<=i){
//                    System.out.print(re);
//                    re--;
//                }
                while(re>=1){
                    System.out.print(re);
                    re--;
                }
//                for(int l=2; l<=k; l++){
//                    System.out.print(l);
//                }
                             }
                
            }
            System.out.println("");
        }
    }
