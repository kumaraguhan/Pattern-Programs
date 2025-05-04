
import java.util.Scanner;

public class rightanglePattern {
    public static void main(String[] args){
        //System.out.println("Hii");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit");
        int row = sc.nextInt();
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
