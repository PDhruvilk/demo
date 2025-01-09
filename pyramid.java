import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         for (int r = 7; r <= n-1; r++) {
             for (int s = 1; s <=(n-r); s++) {
                 System.out.print("  ");
             }
             for (int p = 1; p <=(2*r)-1; p++) {
                 System.err.print("* ");
             }
             System.out.println();

         }
         for (int r = n; r >= 1; r--) {
            for (int s = 1; s <=(n-r); s++) {
                System.out.print("  ");
            }
            for (int p = 1; p <=(2*r)-1; p++) {
                System.err.print("* ");
            }
            System.out.println();

        }
        //  for (int r = n; r >= 1; r--) {
        //     for (int s = (n-r); s >=1; s--) {
        //         System.out.print("  ");
        //     }
        //     for (int p = (2*r)-1; p >=1; p--) {
        //         System.err.print("* ");
        //     }
        //     System.out.println();
            
        // }
    }
}
