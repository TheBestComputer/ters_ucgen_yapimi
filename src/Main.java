
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basamak sayisi : ");
        n = scanner.nextInt();
        for(int k = n; k > 0; k--){
            for(int i = 1; i <= (2 * k - 1); i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
