import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i+"no is even");

            }
            else{
                System.out.println(i+"no is odd");
            }
            sc.close();
        }
    }
    
}
