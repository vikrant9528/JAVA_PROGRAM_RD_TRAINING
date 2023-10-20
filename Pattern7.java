import java.util.Scanner;

public class Pattern7{
    public static void pattern7(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==5||j==5){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        pattern7(n);
        sc.close();
    }
}