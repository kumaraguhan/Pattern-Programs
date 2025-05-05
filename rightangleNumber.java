import java.util.*;

public class rightangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.print("Enter the Limit");
        
        int k = 1;
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }
}
