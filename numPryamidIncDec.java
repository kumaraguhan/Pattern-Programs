//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
//


package com.justjava;


public class numPryamidIncDec {
    public static void main(String[] args) {
        int n = 7;  // You can change this value for different number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for center alignment
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Print descending numbers from i to 1
            for (int num = i; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Print ascending numbers from 2 to i
            for (int num = 2; num <= i; num++) {
                System.out.print(num + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


