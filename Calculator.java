import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for subtract");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for divide");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        System.out.println("enter the value of 1 number");
        int a = sc.nextInt();
        System.out.println("enter the value of second number");
        int b = sc.nextInt();
        switch(choice){
            case 1:{
            a+=b;
            System.out.println("the sum is :"+a);
            break;
            }
            case 2:{
                a-=b;
                System.out.println("the subraction is :"+a);
                break;
            }
            case 3:{
                a*=b;
                System.out.println("the multiplication is :"+a);
                break;
            }
            case 4:{
                a/=b;
                System.out.println("the division is :"+a);
                break;
            }
            default:
            System.out.println("wrong choice or option");
           sc.close();
        }        

    }
    
}
