import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter two strings");
        String a = sc.next();
        String b = sc.next();
        int r =0;
       int l1 = a.length();
       int l2 = b.length();
       if(l1==l2){
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(a.charAt(i)==b.charAt(j)){
                 r+=1;
                }

                

            }
        }
            if(l1==r){
                System.out.println("string is anagram");

            }else{
                System.out.println("string is not anagram");
            }
        
       }
       else{
        System.out.println("string is not anagram");
       }
       sc.close();

        
    }
    
}
