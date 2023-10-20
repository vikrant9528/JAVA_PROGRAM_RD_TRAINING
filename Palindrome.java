import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int rev=0,m=num;
        while(num>0){
           rev = rev*10+num%10;
           num /= 10;
        }
        if(rev==m){
            System.out.println(m+" no is palindrome");


        }
        else{
            System.out.println(m+"no is not palindrome");
        }
        sc.close();
    }
    
}
