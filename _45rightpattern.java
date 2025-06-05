//***** 
// **** 
//  *** 
//   ** 
//    * 

package com.justjava;

import java.util.*;

public class _45rightpattern {
    public static void main(String[] args) {            
        System.out.print("Enter the Limit");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("*");  //if I just add a space after the * it will print down facing pyramid pattern
            }
            System.out.println(" ");
        }
    }
}
