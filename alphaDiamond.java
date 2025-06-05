
package com.justjava;

public class alphaDiamond {
    public static void main(String[] args) {
        int n = 5; // Number of rows (A to E)

        // Top half including middle
        for (int i = 1; i <= n; i++) {
            printAlphabetRow(i, n);
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            printAlphabetRow(i, n);
        }
    }

    public static void printAlphabetRow(int i, int n) {
        // Print leading spaces
        for (int space = 1; space <= n - i; space++) {
            System.out.print("  ");
        }

        // Print descending letters from (char)('A' + i - 1) to 'A'
        for (int j = i; j >= 1; j--) {
            System.out.print((char)('A' + j - 1) + " ");
        }

        // Print ascending letters from 'B' to (char)('A' + i - 1)
        for (int j = 2; j <= i; j++) {
            System.out.print((char)('A' + j - 1) + " ");
        }

        System.out.println();
    }
}


