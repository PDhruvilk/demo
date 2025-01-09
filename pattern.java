
import java.util.Scanner;


public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int rn = sc.nextInt();
        System.out.print("Enter The Number:");
        int cn = sc.nextInt();
        for (int r = 1; r <= rn; r++) {
            for (int c = 1; c <= cn; c++) {
                if(r==1||r==rn||r==c||c==1||c==cn||(r+c)==rn+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println(e);
                }   
            }
            System.out.println();
        }
        for (int r = 1; r <= rn; r++) {
            for (int c = 1; c <= cn; c++) {
                if(r==1||c==1||(r+c)==rn+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        for (int r = 1; r <= rn; r++) {
            for (int c = 1; c <= cn; c++) {
                if(r==rn||r==c||c==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}







