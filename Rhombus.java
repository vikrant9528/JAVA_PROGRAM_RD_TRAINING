import java.util.Scanner; 

public class Rhombus {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of Rhombus");


         int size = sc.nextInt();

         for (int i = 1; i<= size; i++) {
            for (int j = 1; j< i; j++) {
                
                System.out.print(" ");

            }
            for(int star = 1; star<= size; star++){
                System.out.print("*");

            }
            System.out.println();
        
         }


     }
    
}
