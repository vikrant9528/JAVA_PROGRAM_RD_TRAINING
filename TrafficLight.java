import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.println("enter 1 for red light");
        System.out.println("enter 2 for yellow light");
        System.out.println("enter 3 for green light");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("red light");
            break;
            case 2:
            System.out.println("yellow light");
            break;
            case 3:
            System.out.println("green light");
            break;
            default:
            System.out.println("wrong choice");
        }
            System.out.println("enter 0 for exit 1 else 1");
             n = sc.nextInt();
    
        }while(n>0);

    
        
        sc.close();
    }
    
        
    }
    

