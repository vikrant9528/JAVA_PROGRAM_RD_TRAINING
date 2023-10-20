import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("the factorial of :"+num+ ":is" +fact);
        sc.close();
    }
    
    
}


