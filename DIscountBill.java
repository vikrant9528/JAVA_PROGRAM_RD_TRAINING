import java.util.*;
public class DIscountBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("if your purchase amount is 1k to 5k then you get 5% off ");
        System.out.println("if your purchase amount is 5k to 10k then you get 10% off ");
        System.out.println("if your purchase amount is 10k to 20k then you get 15% off ");
        System.out.println("if your purchase amount is greater than 20k then you get 25% off ");
        System.out.println("enter the bill amount");
        float total = sc.nextFloat();
        float discount;
        if(total>=1000 && total<5000){
            discount=(total - (total*0.05f));
            System.out.println("your total amount is :"+total);
            System.out.println("your payable amount after 5% off is :" +discount);
        }
        else if(total>=5000 && total<10000){
            System.out.println("your total payable amount is :"+total );
            discount = (total-total*0.10f);
            System.out.println("your payable amount after 10% off is:"+discount);

        }
        else if(total>=10000 && total<=20000){
            System.out.println("your total payable amount is :"+total);
            discount = (total-total*0.15f);
            System.out.println("your total payable amount after 15% off is:"+discount);
        }
        else{
            System.out.println("your total payable amount is:"+total);
            discount = (total-total*0.25f);
            System.out.println("your total payable amount after 25% off is :"+discount);
        }

sc.close();

    }
    
}
