import java.util.*;
public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice from 1 to 7");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("sunday");
        }
        else if(choice==2){
            System.out.println("monday");
        }
        else if(choice==3){
            System.out.println("tuesday");
        }
        else if(choice==4){
            System.out.println("wednesday");
        }
        else if(choice==5){
            System.out.println("thursday");
        }
        else if(choice==6){
            System.out.println("friday");
        }
        else if(choice==7){
            System.out.println("saturday");
        }
        else
        {
            System.out.println("invalid choice");
        }
        sc.close();
    }
    
    
}
