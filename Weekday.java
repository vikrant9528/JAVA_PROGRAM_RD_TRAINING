import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for monday");
        System.out.println("enter 2 for tuesday");
        System.out.println("enter 3 for wednesday");
        System.out.println("enter 4 for thursday");
        System.out.println("enter 5 for friday");
        System.out.println("enter 6 for saturday");
        System.out.println("enter 7 for sunday");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.print("monday is a weekday");
                break;
            }
            case 2:{
                System.out.print("tuesday is a weekday");
                break;
            }
            case 3:{
                System.out.print("wednesday is a weekday");
                break;
            }
            case 4:{
                System.out.print("thursday is a weekday");
                break;
            }
            case 5:{
                System.out.print("friday is a weekday");
                break;
            }
            case 6:{
                System.out.print("saturday is a weekend");
                break;
            }
            case 7:{
                System.out.print("sunday is a weekend");
                break;
            }
            default:
            System.out.print("wrong choice");
        }
    sc.close();

    }
    
}
