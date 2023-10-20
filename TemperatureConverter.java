import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to convert temp from ferhenheit to celcius");
        System.out.println("enter 2 to convert temp from celsius to ferhenheit");
        int convert = sc.nextInt();
        if(convert==1){
            System.out.println("enter the temperature value in ferhenheit");
            float temp = sc.nextFloat();
            temp =(temp-32)*5/9;
            System.out.println(temp+"value in celcius");
        }
        else if(convert==2){
            System.out.println("enter temperature value in celsius");
            float temp = sc.nextFloat();
            temp=(temp*9/5)+32;
            System.out.println(temp+"value in ferhenheit");

        }
        else{
            System.out.println("your choice is invalid");
        }
        sc.close();
    }
    
}
