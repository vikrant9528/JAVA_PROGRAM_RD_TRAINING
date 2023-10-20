import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int sum =0;
        while(n>0){
         sum= sum+n%10;
         n /= 10;
        }
        System.out.println("the sum of digit is:"+sum);
      sc.close();
    }
    
}
