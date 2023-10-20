import java.util.*;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
    System.out.println(a>=b&&a>=c?"a is greater":(b>a&&b>=c)?"b is greater":"c is greater");
    sc.close();

}
        
    }
    
