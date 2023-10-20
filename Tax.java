import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        float sal = sc.nextFloat();
        if(sal<10000){
            System.out.println("no tax");
        }
        else if(sal>=10000 && sal<20000){
            System.out.println(sal*0.1+" is your tax");
        }
        else if(sal>=20000 && sal<=30000){
            System.out.println(sal*0.15+"is your tax");
        }
        else{
            System.out.println(sal*0.25+"is your tax");
        }
        sc.close();    
}
}
    