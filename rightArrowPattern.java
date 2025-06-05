package com.justjava;

import java.util.*;

public class rightArrowPattern {
    public static void main(String[] args) {
        System.out.println("Enter the Limit");
        Scanner sc = new Scanner(System.in);
        int k;
        int n=sc.nextInt();
        for(int i=1; i<=(n*2)-1; i++){
            
            if(i>n){
                k = n*2 - i;
            }else{
                k=i;
            }
            for(int j=1; j<=k; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
