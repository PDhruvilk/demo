
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second num:");
        int num2 = sc.nextInt();
        System.out.print("Enter the Limit of num:");
        int limit = sc.nextInt();
        fibonacci(num2, num2, limit);

        // int total = 0;
        // for (int i = 0; i < limit; i++) {
        //     total = num1 + num2;
        //     System.out.println(num1);
        //     num1 = num2;
        //     num2 = total;
        // }

        

        // while(limit>0){
        //     total = num1 + num2;
        //     System.out.print(num1+" ");
        //     num1 = num2;
        //     num2 = total;
        //     limit--;
        // }
    }
    public static void fibonacci(int a, int b,int limit){
        for(int i = 0;i<=n;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuss");
            }
            else if(i%5==0 && i%3==0){
                System.out.println("FizzBuss");
            }
            else if(i%3==0 && i%5!=0){
                System.out.println("FizzBuss");
            }
            else{
                System.out.println(i);
            }
    }
}
