import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to indian bank atm");
        System.out.println("enter 1 to deposit money");
        System.out.println("enter 2 to withdraw money");
        System.out.println("enter 3 to check available balance");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        float totalbalance = 25000.00f;
        float money;
        switch(choice){
            case 1:{
                System.out.println("enter the amount to deposit");
                money = sc.nextFloat();
                totalbalance+=money;
                System.out.print("your money is successfully deposit and available balance is :"+totalbalance);
                break;
                
            }
            case 2:{
                System.out.println("enter the amount to withdraw");
                money = sc.nextFloat();
                if(money<totalbalance){
                    totalbalance-=money;
                    System.out.print("the money is successfully withdraw and available balance is :"+totalbalance);
                }
                else{
                    System.out.println("insufficient balance");
                }
                break;
                
            }
            case 3:{
                System.out.print("the available balance in your account is :"+totalbalance);
                break;
            }
            default:
              System.out.println("please try again");
            }
       
sc.close();
    }    
}