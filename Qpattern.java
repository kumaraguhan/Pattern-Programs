package com.justjava;

import java.util.*;

public class Qpattern {
    public static void main(String[] args) {
        System.out.println("Enter the Limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
//                if(i==n){
//                    System.out.print("*");
//                }
                if(k==1 || k==(i*2)-1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}


//         *
//        * *
//       *   *
//      *     *
//     *       *
//    *         *
//   *           *
//  *             *
// *               *
//*******************