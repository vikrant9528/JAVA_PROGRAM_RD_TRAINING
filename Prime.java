import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n==2){
            System.out.println("no is prime");
        }
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isprime = false;
                }

            }
        }
        if(isprime==true){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }
        sc.close();

    }
}