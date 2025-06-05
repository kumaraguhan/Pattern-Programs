package com.justjava;

public class diamondNumber {
    public static void main(String[] args) {
        int n = 5;

        // Top half (including middle row)
        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        // Bottom half (excluding middle row)
        for (int i = n - 1; i >= 1; i--) {
            printRow(i, n);
        }
    }

    // Helper method to print a single row
    public static void printRow(int i, int n) {
        // Print leading spaces
        for (int space = 1; space <= n - i; space++) {
            System.out.print("  ");
        }

        // Print descending numbers
        for (int num = i; num >= 1; num--) {
            System.out.print(num + " ");
        }

        // Print ascending numbers
        for (int num = 2; num <= i; num++) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}



//package com.justjava;
//
//import java.util.*;
//
//public class diamondNumber {
//    public static void main(String[] args) {
//        System.out.println("Enter the limit");
//        Scanner sc = new Scanner(System.in);
//        
//        int n = sc.nextInt();
//        int l = n;
//        for(int i=1; i<=n*2; i++){
//            if(i<n+1){
//                for(int j=n; j>=i; j--){
//                System.out.print(" ");
//            }
//                for(int k=1; k<=i*2 - 1; k++){
//                System.out.print(k);
//            }
//            }
//            
//            
//            if(i>n){
//                
//                for(int j=1; j<=i-n; j++){
//                    System.out.print(" ");
//                }
//                for(int k=l*2 - 1; k>=1; k--){
//                    System.out.print("k");
//                }
//                l--;
//            }
//            
//            
//            System.out.println("");
//        }
//    }
//}
