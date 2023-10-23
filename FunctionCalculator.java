import java.util.Scanner;

public class FunctionCalculator {
    public static float funAdd(float x,float y){
        float sum = x + y;
        return sum;
    }
    public static float funDiv(float x,float y){
        float div = x/y;
        return div;
    }
    public static float funMul(float x,float y){
        float mul = x*y;
        return mul;
    }
    public static float funsub(float x,float y){
        float sub = x-y;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter + for addition");
        System.out.println("enter / for division");
        System.out.println("enter * for multiplication");
        System.out.println("enter - for subtraction");
        System.out.println("enter your choice");
        char n = sc.next().charAt(0);
        switch(n){
            case '+':{
                System.out.println("enter the first no");
                float x = sc.nextFloat();
                System.out.println("enter the second no");
                float y = sc.nextFloat();
                System.out.println("the addition is:"+funAdd(x,y));
                break;
            }
            case '*':{
                System.out.println("enter the value of x ");
                float x = sc.nextFloat();
                System.out.println("enter the value of y ");
                float y = sc.nextFloat();
                System.out.println("the division is:"+funDiv(x,y));
                break;

            }
            case '/':{
              System.out.println("enter the first no");
              float x = sc.nextFloat();
              System.out.println("enter the second no");
              float y = sc.nextFloat();
              System.out.println("the multiplication is:"+funMul(x,y));
              break;
            }
            case '-':{
            System.out.println("enter the value of first no");
            float x = sc.nextFloat();
            System.out.println("enter the value of 2 no");
            float y = sc.nextFloat();
            System.out.println("the subtraction is:"+funsub(x,y));
            break;
            }
            


        }
        sc.close();

    }

    
}
