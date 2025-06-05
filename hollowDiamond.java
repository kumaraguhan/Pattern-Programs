//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********

package com.justjava;

import java.util.*;

public class hollowDiamond {
    public static void main(String[] args) {
        System.out.println("Enter the Limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n*2; i++){
            
            int rowNum = i > n ? (n * 2) - (i - 1) : i;
            
            for(int col = 1; col <= n*2; col++){
                
                if(col <= n - rowNum + 1 || col > n + rowNum - 1)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
